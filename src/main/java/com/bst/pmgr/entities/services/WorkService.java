package com.bst.pmgr.entities.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bst.pmgr.entities.PmgrPerson;
import com.bst.pmgr.entities.Work;
import com.bst.pmgr.entities.repositories.PmgrPersonRepository;
import com.bst.pmgr.entities.repositories.WorkRepository;
import com.bst.user.authentication.entities.Person;

@Service
public class WorkService {

	@Autowired
	private PmgrPersonRepository personRepository;

	@Autowired
	private WorkRepository workRepository;

	@Transactional
	public Work create(Person createdBy, String name) {
		PmgrPerson pmgrPerson = personRepository.findOrCreateByPerson(createdBy);

		Work work = new Work();
		work.setName(name);
		pmgrPerson.addWork(work);
		
		return workRepository.save(work);
	}
	
	@Transactional
	public void delete(Work work) {
		workRepository.delete(work);
	}

}
