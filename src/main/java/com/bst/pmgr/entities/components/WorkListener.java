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
import com.bst.pmgr.entities.schema.SchemaService;

@Component
public class WorkListener {

	private final RandomNameGenerator rnd = new RandomNameGenerator(0);

	@Autowired
	private SchemaService schemaService;

	@PrePersist
	public void prePersist(final Work work) throws Exception {
		if (work.getName() == null) {
			work.setName(this.rnd.next());
		}

		if (work.getActivities().size() == 0) {
			this.schemaService.getActivities().values().stream().map(metaActivity -> {
				final Activity activity = new Activity();
				activity.setMetaName(metaActivity.getName());
				activity.setName(this.rnd.next());
				work.addToActivities(activity);
				return activity;
			}).collect(Collectors.toList());
		}

		if (work.getDocuments().size() == 0) {
			this.schemaService.getDocuments().values().stream().map(metaDocument -> {
				final Document document = new Document();
				document.setMetaName(metaDocument.getName());
				document.setName(this.rnd.next());
				work.addToDocuments(document);
				return document;
			}).collect(Collectors.toList());
		}

		if (work.getProcesses().size() == 0) {
			this.schemaService.getProcesses().values().stream().map(metaProcess -> {
				final Process process = new Process();
				process.setMetaName(metaProcess.getName());
				process.setName(this.rnd.next());
				work.addToProcesses(process);
				return process;
			}).collect(Collectors.toList());
		}

		if (work.getProcessGroups().size() == 0) {
			this.schemaService.getProcessGroups().values().stream().map(metaProcessGroup -> {
				final ProcessGroup processGroup = new ProcessGroup();
				processGroup.setMetaName(metaProcessGroup.getName());
				processGroup.setName(this.rnd.next());
				work.addToProcessGroups(processGroup);
				return processGroup;
			}).collect(Collectors.toList());
		}
	}

}
