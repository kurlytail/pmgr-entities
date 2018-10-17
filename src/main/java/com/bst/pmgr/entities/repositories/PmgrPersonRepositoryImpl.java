package com.bst.pmgr.entities.repositories;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import com.bst.pmgr.entities.PmgrPerson;
import com.bst.user.authentication.entities.Person;

public class PmgrPersonRepositoryImpl implements PmgrPersonRepositoryCustom {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	@Transactional
	public PmgrPerson findOrCreateByPerson(Person person) {
		PmgrPerson pmgrPerson = entityManager.find(PmgrPerson.class, person.getId());
		
		if (pmgrPerson == null) {
			pmgrPerson = new PmgrPerson();
			pmgrPerson.setPerson(person);
			entityManager.persist(pmgrPerson);
			entityManager.flush();

			pmgrPerson = entityManager.find(PmgrPerson.class, person.getId());
		}

		return pmgrPerson;
	}

}
