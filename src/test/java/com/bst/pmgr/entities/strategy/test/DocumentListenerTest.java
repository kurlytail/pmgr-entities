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
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.bst.pmgr.entities.Document;
import com.bst.pmgr.entities.Work;
import com.bst.pmgr.entities.components.DocumentListener;
import com.bst.pmgr.entities.repositories.DocumentRepository;
import com.bst.pmgr.entities.schema.SchemaService;
import com.bst.utility.components.RepositoryAspect;
import com.bst.utility.testlib.SnapshotListener;

@ExtendWith(SpringExtension.class)
@TestExecutionListeners(listeners = SnapshotListener.class, mergeMode = MergeMode.MERGE_WITH_DEFAULTS)
@DataJpaTest
@ContextConfiguration(classes = { TestConfiguration.class })
@TestPropertySource("classpath:global-test.properties")
public class DocumentListenerTest {

	@TestConfiguration
	@EntityScan("com.bst.pmgr.entities")
	@EnableJpaRepositories("com.bst.pmgr.entities.repositories")
	@EnableAspectJAutoProxy
	static class DocumentListenerTestConfiguration {

		@Bean
		public DocumentListener getDocumentListener() {
			return new DocumentListener();
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

	@FunctionalInterface
	public interface TransactionWrappedFunction {
		public void wrap() throws Exception;
	}

	@Autowired
	private DocumentRepository documentRepository;

	@SuppressWarnings("unused")
	@Autowired
	private DocumentListener documentListener;

	@Test
	public void testDocumentListenerInitializeDocument() throws Exception {

		this.transactionWrapper(() -> {
			final Work work = new Work();
			work.setName("test work");

			final Document document = new Document();
			document.setMetaName("projectStaffAssignments");
			work.addDocument(document);

			this.documentRepository.save(document);
		});

		this.transactionWrapper(() -> {
			Document document = this.documentRepository.findAll().iterator().next();
			SnapshotListener.expect(document).toMatchSnapshot();

			document.removeTool(document.getTools().get(0));
			SnapshotListener.expect(document).toMatchSnapshot();

			document.setName("new name");

			document = this.documentRepository.save(document);
		});

		final Document document = this.documentRepository.findAll().iterator().next();
		SnapshotListener.expect(document).toMatchSnapshot();
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	private void transactionWrapper(final TransactionWrappedFunction fn) throws Exception {
		fn.wrap();
	}

}
