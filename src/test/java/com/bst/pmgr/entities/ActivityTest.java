package com.bst.pmgr.entities;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bst.pmgr.application.TestApplication;
import com.bst.pmgr.generic.entities.GenericActivity;
import com.bst.pmgr.repositories.ActivityRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
@SpringBootTest(classes = TestApplication.class)
public class ActivityTest {
	
    @Autowired
    private TestEntityManager entityManager;
    
	@Autowired
	private ActivityRepository activityRepository;
	
	@Before
	public void setup() {
		entityManager.persist(new GenericActivity());
	}
	
	@Test
	public void testGetId() {
		Iterable<Activity> activityIterator = activityRepository.findAll();
		int activityCount = 0;
		for(Activity activity: activityIterator) {
			++activityCount;
			assertNotNull(activity.getId());
		}
		
		assertEquals(activityCount, 1);
	}

	@Test
	public void testGetName() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetName() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetMetaName() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetMetaName() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetProject() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetProject() {
		fail("Not yet implemented");
	}

}
