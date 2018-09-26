package com.bst.pmgr.entities.audit.tests;

import static com.bst.utility.testlib.SnapshotListener.expect;

import java.util.List;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.dao.InvalidDataAccessApiUsageException;
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
import com.bst.utility.testlib.SnapshotListener;

@ExtendWith(SpringExtension.class)
@DataJpaTest
@ContextConfiguration(classes = { PmgrEntitiesConfiguration.class })
@TestExecutionListeners(listeners = SnapshotListener.class, mergeMode = MergeMode.MERGE_WITH_DEFAULTS)
@TestPropertySource("classpath:section-audit-test.properties")
@Transactional
public class SectionAuditTest {

	@Autowired
	private TestEntityManager entityManager;

	@Autowired
	private SectionRepository<Section> sectionRepository;

	@Autowired
	private DocumentRepository<Document> documentRepository;

	@Test
	public void testDocumentField() throws Exception {

		Section section = new Section();
		section.setName("testName");

		Assertions.assertThrows(InvalidDataAccessApiUsageException.class, () -> {
			sectionRepository.save(section);
			entityManager.flush();
		});

		List<Section> sections = sectionRepository.findAll();
		expect(sections).toMatchSnapshot();

		Document document = new Document();
		document = documentRepository.save(document);
		section.setDocument(document);
		sectionRepository.save(section);
		entityManager.flush();

		sections = sectionRepository.findAll();
		expect(sections).toMatchSnapshot();
	}
	
	@Test
	public void testParentSectionField() throws Exception {

		Document document = new Document();
		document = documentRepository.save(document);
		Document document1 = new Document();
		document1 = documentRepository.save(document1);
		
		Section section = new Section();
		section.setName("testName");
		section.setDocument(document);
		
		Section parentSection = new Section();
		parentSection.setName("parent testName");
		parentSection.setDocument(document1);
		parentSection = sectionRepository.save(parentSection);
		
		section.setParentSection(parentSection);
		Assertions.assertThrows(InvalidDataAccessApiUsageException.class, () -> {
			sectionRepository.save(section);
			entityManager.flush();
		});
		List<Section> sections = sectionRepository.findAll();
		expect(sections).toMatchSnapshot();

		parentSection.setDocument(document);
		parentSection = sectionRepository.save(parentSection);
		section.setParentSection(parentSection);
		sectionRepository.save(section);
		entityManager.flush();

		sections = sectionRepository.findAll();
		expect(sections).toMatchSnapshot();

	}

}
