package com.bst.pmgr.entries.strategy.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.TestExecutionListeners.MergeMode;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.bst.pmgr.entities.Document;
import com.bst.pmgr.entities.Work;
import com.bst.pmgr.entities.components.DocumentListener;
import com.bst.pmgr.entities.repositories.DocumentRepository;
import com.bst.pmgr.entities.repositories.WorkRepository;
import com.bst.pmgr.entities.schema.SchemaService;
import com.bst.utility.components.AuditService;
import com.bst.utility.testlib.SnapshotListener;

@ExtendWith(SpringExtension.class)
@TestExecutionListeners(listeners = SnapshotListener.class, mergeMode = MergeMode.MERGE_WITH_DEFAULTS)
@DataJpaTest
@TestPropertySource("classpath:global-test.properties")
public class DocumentListenerTest {

	@TestConfiguration
	@EntityScan("com.bst.pmgr.entities")
	@EnableJpaRepositories("com.bst.pmgr.entities.repositories")
	static class WorkListenerTestConfiguration {
		@Bean
		public AuditService getAuditService() {
			return new AuditService();
		}

		@Bean
		public DocumentListener getDocumentListener() {
			return new DocumentListener();
		}

		@Bean
		public SchemaService getSchemaService() {
			return new SchemaService();
		}

	}

	@Autowired
	private WorkRepository workRepository;

	@Autowired
	private DocumentRepository documentRepository;

	@SuppressWarnings("unused")
	@Autowired
	private DocumentListener documentListener;

	@SuppressWarnings("unused")
	@Autowired
	private AuditService auditService;

	@FunctionalInterface
	public interface TransactionWrappedFunction {
		public void wrap() throws Exception;
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	private void transactionWrapper(TransactionWrappedFunction fn) throws Exception {
		fn.wrap();
	}

	@Test
	public void testDocumentListenerInitializeDocument() throws Exception {

		transactionWrapper(() -> {
			Work work = new Work();
			work.setName("test work");

			Document document = new Document();
			document.setMetaName("projectStaffAssignments");
			document.setWork(work);
			work.getDocuments().add(document);

			documentRepository.save(document);
		});

		transactionWrapper(() -> {
			Document document = documentRepository.findAll().iterator().next();
			SnapshotListener.expect(document).toMatchSnapshot();

			document.removeTool(document.getTools().get(0));
			SnapshotListener.expect(document).toMatchSnapshot();
			
			document.setName("new name");

			document = documentRepository.save(document);
		});
		
		Document document = documentRepository.findAll().iterator().next();
		SnapshotListener.expect(document).toMatchSnapshot();
	}

}
