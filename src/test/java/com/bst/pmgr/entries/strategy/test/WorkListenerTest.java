package com.bst.pmgr.entries.strategy.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.TestExecutionListeners.MergeMode;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.bst.pmgr.entities.Work;
import com.bst.pmgr.entities.repositories.WorkRepository;
import com.bst.pmgr.entities.schema.SchemaService;
import com.bst.pmgr.entities.strategy.WorkListener;
import com.bst.utility.components.AuditService;
import com.bst.utility.testlib.SnapshotListener;

@ExtendWith(SpringExtension.class)
@TestExecutionListeners(listeners = SnapshotListener.class, mergeMode = MergeMode.MERGE_WITH_DEFAULTS)
@DataJpaTest
// @ContextConfiguration(classes = { ComponentTestApplication.class })
public class WorkListenerTest {

	@TestConfiguration
	@EntityScan("com.bst.pmgr.entities")
	@EnableJpaRepositories("com.bst.pmgr.entities.repositories")
	static class WorkListenerTestConfiguration {
		@Bean
		public AuditService getAuditService() {
			return new AuditService();
		}

		@Bean
		public WorkListener getWorkListener() {
			return new WorkListener();
		}
		
		@Bean
		public SchemaService getSchemaService() {
			return new SchemaService();
		}

	}

	@Autowired
	private WorkRepository workRepository;
	
	@Autowired
	private WorkListener workListener;

	@Autowired
	private AuditService auditService;
	
	@Test
	public void testWorkListenerInitializeWork() throws Exception {
		Work work = new Work();
		work = this.workRepository.save(work);
		SnapshotListener.expect(work).toMatchSnapshot();
	}
}
