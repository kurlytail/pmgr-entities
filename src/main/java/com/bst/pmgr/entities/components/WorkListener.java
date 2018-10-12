package com.bst.pmgr.entities.components;

import java.util.stream.Collectors;

import javax.persistence.PrePersist;

import org.kohsuke.randname.RandomNameGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bst.pmgr.entities.Activity;
import com.bst.pmgr.entities.Document;
import com.bst.pmgr.entities.Process;
import com.bst.pmgr.entities.ProcessGroup;
import com.bst.pmgr.entities.Work;
import com.bst.pmgr.entities.repositories.ActivityRepository;
import com.bst.pmgr.entities.repositories.DocumentRepository;
import com.bst.pmgr.entities.repositories.ProcessGroupRepository;
import com.bst.pmgr.entities.repositories.ProcessRepository;
import com.bst.pmgr.entities.schema.SchemaService;

@Component
public class WorkListener {

	private final RandomNameGenerator rnd = new RandomNameGenerator(0);

	@Autowired
	private SchemaService schemaService;

	@Autowired
	private ActivityRepository activityRepository;

	@Autowired
	private DocumentRepository documentRepository;

	@Autowired
	private ProcessRepository processRepository;

	@Autowired
	private ProcessGroupRepository processGroupRepository;

	@PrePersist
	public void prePersist(final Work work) throws Exception {
		if (work.getName() == null) {
			work.setName(this.rnd.next());
		}

		if (work.getActivities().size() == 0) {
			work.getActivities().addAll(this.schemaService.getActivities().values().stream().map(metaActivity -> {
				final Activity activity = new Activity();
				activity.setMetaName(metaActivity.getName());
				activity.setName(this.rnd.next());
				activity.setWork(work);
				return activity;
			}).collect(Collectors.toList()));

			activityRepository.saveAll(work.getActivities());
		}

		if (work.getDocuments().size() == 0) {
			work.getDocuments().addAll(this.schemaService.getDocuments().values().stream().map(metaDocument -> {
				final Document document = new Document();
				document.setMetaName(metaDocument.getName());
				document.setName(this.rnd.next());
				document.setWork(work);
				return document;
			}).collect(Collectors.toList()));

			documentRepository.saveAll(work.getDocuments());
		}

		if (work.getProcesses().size() == 0) {
			work.getProcesses().addAll(this.schemaService.getProcesses().values().stream().map(metaProcess -> {
				final Process process = new Process();
				process.setMetaName(metaProcess.getName());
				process.setName(this.rnd.next());
				process.setWork(work);
				return process;
			}).collect(Collectors.toList()));

			processRepository.saveAll(work.getProcesses());
		}

		if (work.getProcessGroups().size() == 0) {
			work.getProcessGroups()
					.addAll(this.schemaService.getProcessGroups().values().stream().map(metaProcessGroup -> {
						final ProcessGroup processGroup = new ProcessGroup();
						processGroup.setMetaName(metaProcessGroup.getName());
						processGroup.setName(this.rnd.next());
						processGroup.setWork(work);
						return processGroup;
					}).collect(Collectors.toList()));

			processGroupRepository.saveAll(work.getProcessGroups());
		}
	}

}
