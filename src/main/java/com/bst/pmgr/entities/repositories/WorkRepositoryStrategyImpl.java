package com.bst.pmgr.entities.repositories;

import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.bst.pmgr.entities.Work;
import com.bst.pmgr.entities.services.WorkService;
import com.bst.pmgr.entities.strategy.IExecutionStrategy;
import com.bst.pmgr.entities.strategy.ISelectionStrategy;
import com.bst.pmgr.entities.strategy.StrategyDescriptor;

public class WorkRepositoryStrategyImpl implements WorkRepositoryStrategy {

	private static Logger LOG = LoggerFactory.getLogger(WorkService.class);

	@PersistenceContext
	private EntityManager entityManager;

	@Autowired
	private Map<String, ISelectionStrategy> selectionStrategies;

	@Autowired
	private Map<String, IExecutionStrategy> executionStrategies;

	@Transactional
	public Work process(final Work work) {
		WorkRepositoryStrategyImpl.LOG.info("Processing work " + work);
		ISelectionStrategy selectionStrategy = null;
		Long selectionRank = -1L;
		for (final ISelectionStrategy strategy : this.selectionStrategies.values()) {
			final Long currentRank = strategy.computeStrategyScore(work);
			if (currentRank != null && currentRank > selectionRank) {
				selectionRank = currentRank;
				selectionStrategy = strategy;
			}
		}

		WorkRepositoryStrategyImpl.LOG.info("Using strategy " + selectionStrategy + " on " + work);
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

		WorkRepositoryStrategyImpl.LOG
				.info("Using strategy " + executionStrategy + " with strategy " + strategyDescriptor + " on " + work);
		executionStrategy.execute(work, strategyDescriptor);

		this.entityManager.persist(work);
		return ((WorkRepository)this).findById(work.getId()).get();
	}
}
