package com.bst.pmgr.entities.schema.test;

import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.TestExecutionListeners.MergeMode;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.bst.configuration.pmgr.entities.PmgrEntitiesConfiguration;
import com.bst.pmgr.entities.schema.SchemaService;
import com.bst.utility.testlib.SnapshotListener;
import com.fasterxml.jackson.core.JsonProcessingException;

@ExtendWith(SpringExtension.class)
@TestExecutionListeners(listeners = SnapshotListener.class, mergeMode = MergeMode.MERGE_WITH_DEFAULTS)
public class SchemaServiceTest {
	
    @TestConfiguration
    static class SchemaServiceTestConfiguration {
  
        @Bean
        public SchemaService schemaService() throws JsonProcessingException, IOException {
            return new SchemaService();
        }
    }

	@Autowired
	private SchemaService schemaService;

	@Test
	void testSchemaIntrospection() throws Exception {
		SnapshotListener.expect(this.schemaService.getActivities()).toMatchSnapshot();
		SnapshotListener.expect(this.schemaService.getDocuments()).toMatchSnapshot();
		SnapshotListener.expect(this.schemaService.getTools()).toMatchSnapshot();
		SnapshotListener.expect(this.schemaService.getProcesses()).toMatchSnapshot();
		SnapshotListener.expect(this.schemaService.getProcessGroups()).toMatchSnapshot();
		SnapshotListener.expect(this.schemaService.getSchemaMap()).toMatchSnapshot();
	}
}
