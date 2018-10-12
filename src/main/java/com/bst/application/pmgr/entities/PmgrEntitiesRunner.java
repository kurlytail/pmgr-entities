package com.bst.application.pmgr.entities;

import java.util.Random;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import com.bst.pmgr.entities.Work;
import com.bst.pmgr.entities.repositories.WorkRepository;

@Service
@Transactional
public class PmgrEntitiesRunner implements CommandLineRunner {

	@Autowired
	private WorkRepository workRepository;

	@Autowired
	private EntityManager entityManager;

	@Override
	public void run(final String... args) throws Exception {

		final long countOfWork = Math.abs(new Random().nextLong()) % 10;
		long indexOfWork = 0;
		
		while (indexOfWork < countOfWork) {
			final Work work = new Work();
			this.workRepository.save(work);
			++indexOfWork;
		}

		this.entityManager.flush();
	}

}
