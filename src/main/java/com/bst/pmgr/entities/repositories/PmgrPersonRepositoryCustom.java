package com.bst.pmgr.entities.repositories;

import org.springframework.transaction.annotation.Transactional;

import com.bst.pmgr.entities.PmgrPerson;
import com.bst.user.authentication.entities.Person;

@Transactional
public interface PmgrPersonRepositoryCustom {
	PmgrPerson findByPerson(Person person);
}
