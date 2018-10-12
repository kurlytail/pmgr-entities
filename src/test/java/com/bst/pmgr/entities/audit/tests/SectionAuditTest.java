package com.bst.pmgr.entities.audit.tests;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.TestExecutionListeners.MergeMode;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.bst.configuration.pmgr.entities.PmgrEntitiesConfiguration;
import com.bst.pmgr.entities.Document;
import com.bst.pmgr.entities.Section;
import com.bst.pmgr.entities.repositories.DocumentRepository;
import com.bst.pmgr.entities.repositories.SectionRepository;
import com.bst.utility.components.AuditService;
import com.bst.utility.testlib.SnapshotListener;

@ExtendWith(SpringExtension.class)
@DataJpaTest
@ContextConfiguration(classes = { PmgrEntitiesConfiguration.class })
@TestExecutionListeners(listeners = SnapshotListener.class, mergeMode = MergeMode.MERGE_WITH_DEFAULTS)
@TestPropertySource("classpath:section-audit-test.properties")
public class SectionAuditTest {

	@TestConfiguration
	@EntityScan("com.bst.pmgr.entities")
	@EnableJpaRepositories("com.bst.pmgr.entities.repositories")
	static class WorkListenerTestConfiguration {
		@Bean
		public AuditService getAuditService() {
			return new AuditService();
		}
	}

	@Autowired
	private TestEntityManager entityManager;

	@Autowired
	private SectionRepository<Section> sectionRepository;

	@Autowired
	private DocumentRepository documentRepository;

	@SuppressWarnings("unused")
	@Autowired
	private AuditService auditService;

	@Test
	public void testDocumentField() throws Exception {

		final Section section = new Section();
		section.setName("testName");
		Assertions.assertThrows(RuntimeException.class, () -> {
			this.sectionRepository.save(section);
			this.entityManager.flush();
		});

		List<Section> sections = this.sectionRepository.findAll();
		SnapshotListener.expect(sections).toMatchSnapshot();

		Document document = new Document();
		document.setName("Document");
		document.setMetaName("testName");
		document = this.documentRepository.save(document);
		section.setDocument(document);
		this.sectionRepository.save(section);
		this.entityManager.flush();

		sections = this.sectionRepository.findAll();
		SnapshotListener.expect(sections).toMatchSnapshot();
	}

	@Test
	public void testParentSectionField() throws Exception {

		Document document = new Document();
		document.setName("document");
		document.setMetaName("testName");
		document = this.documentRepository.save(document);

		Document document1 = new Document();
		document1.setName("document1");
		document1.setMetaName("testName");
		document1 = this.documentRepository.save(document1);

		final Section section = new Section();
		section.setName("testName");
		section.setDocument(document);

		Section parentSection = new Section();
		parentSection.setName("parent testName");
		parentSection.setDocument(document1);
		parentSection = this.sectionRepository.save(parentSection);

		section.setParentSection(parentSection);
		Assertions.assertThrows(RuntimeException.class, () -> {
			this.sectionRepository.save(section);
			this.entityManager.flush();
		});
		List<Section> sections = this.sectionRepository.findAll();
		SnapshotListener.expect(sections).toMatchSnapshot();

		parentSection.setDocument(document);
		parentSection = this.sectionRepository.save(parentSection);
		section.setParentSection(parentSection);
		this.sectionRepository.save(section);
		this.entityManager.flush();

		sections = this.sectionRepository.findAll();
		SnapshotListener.expect(sections).toMatchSnapshot();

	}

}
