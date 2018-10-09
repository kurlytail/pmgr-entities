package com.bst.pmgr.entities.services;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bst.pmgr.entities.PmgrPerson;
import com.bst.pmgr.entities.Work;
import com.bst.pmgr.entities.repositories.PmgrPersonRepository;
import com.bst.pmgr.entities.repositories.WorkRepository;
import com.bst.pmgr.entities.strategy.IExecutionStrategy;
import com.bst.pmgr.entities.strategy.ISelectionStrategy;
import com.bst.pmgr.entities.strategy.StrategyDescriptor;
import com.bst.user.authentication.entities.Person;

@Service
public class WorkService {

	private static Logger LOG = LoggerFactory.getLogger(WorkService.class);

	@Autowired
	private PmgrPersonRepository personRepository;

	@Autowired
	private WorkRepository workRepository;

	@Autowired
	private Map<String, ISelectionStrategy> selectionStrategies;

	@Autowired
	private Map<String, IExecutionStrategy> executionStrategies;

	@Transactional
	public Work create(final Person createdBy, final String name) {
		final PmgrPerson pmgrPerson = this.personRepository.findOrCreateByPerson(createdBy);

		final Work work = new Work();
		work.setName(name);
		pmgrPerson.addWork(work);

		return this.workRepository.save(work);
	}

	@Transactional
	public void delete(final Work work) {
		this.workRepository.delete(work);
	}

	@Transactional
	public void process(final Work work) {
		WorkService.LOG.info("Processing work " + work);
		ISelectionStrategy selectionStrategy = null;
		Long selectionRank = -1L;
		for (final ISelectionStrategy strategy : this.selectionStrategies.values()) {
			final Long currentRank = strategy.computeStrategyScore(work);
			if (currentRank != null && currentRank > selectionRank) {
				selectionRank = currentRank;
				selectionStrategy = strategy;
			}
		}

		WorkService.LOG.info("Using strategy " + selectionStrategy + " on " + work);
		final StrategyDescriptor strategyDescriptor = selectionStrategy.computeSelection(work);

		IExecutionStrategy executionStrategy = null;
		Long executionRank = -1L;
		for (final IExecutionStrategy strategy : this.executionStrategies.values()) {
			final Long currentRank = strategy.computeStrategyScore(work);
			if (currentRank != null && currentRank > executionRank) {
				executionRank = currentRank;
				executionStrategy = strategy;
			}
		}

		WorkService.LOG
				.info("Using strategy " + executionStrategy + " with strategy " + strategyDescriptor + " on " + work);
		executionStrategy.execute(work, strategyDescriptor);
	}

}
