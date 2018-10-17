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
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.TestExecutionListeners.MergeMode;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.bst.pmgr.entities.Document;
import com.bst.pmgr.entities.PmgrPerson;
import com.bst.pmgr.entities.Section;
import com.bst.pmgr.entities.Work;
import com.bst.pmgr.entities.components.SectionListener;
import com.bst.pmgr.entities.repositories.SectionRepository;
import com.bst.user.authentication.entities.Person;
import com.bst.utility.components.RepositoryAspect;
import com.bst.utility.testlib.SnapshotListener;

@ExtendWith(SpringExtension.class)
@DataJpaTest
@TestExecutionListeners(listeners = SnapshotListener.class, mergeMode = MergeMode.MERGE_WITH_DEFAULTS)
@ContextConfiguration(classes = { TestConfiguration.class })
@TestPropertySource("classpath:section-audit-test.properties")
public class SectionAuditTest {

	@TestConfiguration
	@EntityScan("com.bst.pmgr.entities")
	@EnableJpaRepositories("com.bst.pmgr.entities.repositories")
	@EnableAspectJAutoProxy
	static class SectionAuditTestConfiguration {
		@Bean
		public RepositoryAspect getRepositoryAspect() {
			return new RepositoryAspect();
		}

		@Bean
		public SectionListener getSectionListener() {
			return new SectionListener();
		}
	}

	@Autowired
	private TestEntityManager entityManager;

	@Autowired
	private SectionRepository<Section> sectionRepository;

	@SuppressWarnings("unused")
	@Autowired
	private SectionListener sectionListener;

	@Test
	public void testDocumentField() throws Exception {

		final Work work = new Work();
		work.setName("some name");

		final PmgrPerson pmgrPerson = new PmgrPerson();
		final Person person = new Person();
		pmgrPerson.setPerson(person);
		pmgrPerson.setName("test person");
		work.setPerson(pmgrPerson);

		final Section section = new Section();
		section.setName("testName");
		Assertions.assertThrows(RuntimeException.class, () -> {
			this.sectionRepository.save(section);
			this.entityManager.flush();
		});

		List<Section> sections = this.sectionRepository.findAll();
		SnapshotListener.expect(sections).toMatchSnapshot();

		final Document document = new Document();
		document.setName("Document");
		document.setMetaName("projectStaffAssignments");
		work.addToDocuments(document);
		document.addToTopLevelSections(section);

		this.sectionRepository.save(section);
		this.entityManager.flush();

		sections = this.sectionRepository.findAll();
		SnapshotListener.expect(sections).toMatchSnapshot();
	}

	@Test
	public void testParentSectionField() throws Exception {

		final Work work = new Work();
		work.setName("some test");

		final PmgrPerson pmgrPerson = new PmgrPerson();
		final Person person = new Person();
		pmgrPerson.setPerson(person);
		pmgrPerson.setName("test person");
		work.setPerson(pmgrPerson);

		final Document document = new Document();
		document.setName("document");
		document.setMetaName("projectStaffAssignments");
		work.addToDocuments(document);

		final Document document1 = new Document();
		document1.setName("document1");
		document1.setMetaName("projectStaffAssignments");
		work.addToDocuments(document1);

		final Section section = new Section();
		section.setName("testName");
		document.addToTopLevelSections(section);

		Section parentSection = new Section();
		parentSection.setName("parent testName");
		document1.addToTopLevelSections(parentSection);

		parentSection = this.sectionRepository.save(parentSection);
		parentSection.addToChildSections(section);

		document.addToTopLevelSections(section);
		this.sectionRepository.save(section);

		List<Section> sections = this.sectionRepository.findAll();
		SnapshotListener.expect(sections).toMatchSnapshot();

		parentSection.setDocument(document1);
		parentSection = this.sectionRepository.save(parentSection);
		section.setParentSection(parentSection);
		this.sectionRepository.save(section);
		this.entityManager.flush();

		sections = this.sectionRepository.findAll();
		SnapshotListener.expect(sections).toMatchSnapshot();

	}

}
