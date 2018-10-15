package com.bst.pmgr.entities.strategy.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.TestExecutionListeners.MergeMode;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.bst.pmgr.entities.Work;
import com.bst.pmgr.entities.components.WorkListener;
import com.bst.pmgr.entities.repositories.WorkRepository;
import com.bst.pmgr.entities.schema.SchemaService;
import com.bst.utility.components.RepositoryAspect;
import com.bst.utility.testlib.SnapshotListener;

@ExtendWith(SpringExtension.class)
@TestExecutionListeners(listeners = SnapshotListener.class, mergeMode = MergeMode.MERGE_WITH_DEFAULTS)
@DataJpaTest
@ContextConfiguration(classes = { TestConfiguration.class })
public class WorkListenerTest {

	@TestConfiguration
	@EntityScan("com.bst.pmgr.entities")
	@EnableJpaRepositories("com.bst.pmgr.entities.repositories")
	@EnableAspectJAutoProxy
	static class WorkListenerTestConfiguration {

		@Bean
		public WorkListener getWorkListener() {
			return new WorkListener();
		}
		
		@Bean
		public RepositoryAspect getRepositoryAspect() {
			return new RepositoryAspect();
		}

		@Bean
		public SchemaService getSchemaService() {
			return new SchemaService();
		}

	}

	@Autowired
	private WorkRepository workRepository;

	@SuppressWarnings("unused")
	@Autowired
	private WorkListener workListener;

	@Test
	public void testWorkListenerInitializeWork() throws Exception {
		Work work = new Work();
		work = this.workRepository.save(work);
		SnapshotListener.expect(work).toMatchSnapshot();
	}
}
