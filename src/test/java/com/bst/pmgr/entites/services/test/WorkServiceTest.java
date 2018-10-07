package com.bst.pmgr.entites.services.test;

import static com.bst.utility.testlib.SnapshotListener.expect;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.TestExecutionListeners.MergeMode;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.bst.configuration.pmgr.entities.PmgrEntitiesConfiguration;
import com.bst.pmgr.entities.PmgrPerson;
import com.bst.pmgr.entities.Work;
import com.bst.pmgr.entities.services.WorkService;
import com.bst.user.authentication.entities.Person;
import com.bst.user.authentication.repositories.PersonRepository;
import com.bst.utility.testlib.SnapshotListener;

@ExtendWith(SpringExtension.class)
@DataJpaTest
@ContextConfiguration(classes = { PmgrEntitiesConfiguration.class })
@TestExecutionListeners(listeners = SnapshotListener.class, mergeMode = MergeMode.MERGE_WITH_DEFAULTS)
@EntityScan({ "com.bst.user.authentication.entities" })
@EnableJpaRepositories("com.bst.user.authentication.repositories")
@TestPropertySource("classpath:work-service-test.properties")
@Transactional
@ComponentScan({ "com.bst.pmgr.entities" })
class WorkServiceTest {

	@Autowired
	private TestEntityManager entityManager;
	
	@Autowired
	private PersonRepository personRepository;

	@Autowired
	private WorkService workService;

	@Test
	void testWorkCreate() throws Exception {
		Person person = new Person("jon@doe.com");
		person = personRepository.save(person);

		Work work = workService.create(person, "testWork");
		expect(work).toMatchSnapshot();
		
		entityManager.flush();
	}
	
	@Test
	void testWorkDelete() throws Exception {
		Person person = new Person("jon@doe.com");
		person = personRepository.save(person);

		Work work = workService.create(person, "testWork");
		entityManager.flush();
		
		work = entityManager.refresh(work);
		work.getCreatedBy().removeWork(work);
		entityManager.flush();
		
		PmgrPerson createdBy = entityManager.refresh(work.getCreatedBy());
		expect(createdBy).toMatchSnapshot();
		
		work = entityManager.find(Work.class, work.getId());
		expect(work).toMatchSnapshot();
	}
	
}
