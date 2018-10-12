package com.bst.pmgr.entities.strategy;

import java.util.stream.Collectors;

import javax.persistence.PrePersist;

import org.kohsuke.randname.RandomNameGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bst.pmgr.entities.Activity;
import com.bst.pmgr.entities.Work;
import com.bst.pmgr.entities.schema.SchemaService;

@Component
public class WorkListener {

	private RandomNameGenerator rnd = new RandomNameGenerator(0);

	@Autowired
	private SchemaService schemaService;

	@PrePersist
	public void prePersist(final Work work) throws Exception {
		if (work.getName() == null) {
			work.setName(rnd.next());
		}

		if (work.getActivities().size() == 0) {
			work.getActivities().addAll(schemaService.getActivities().values().stream().map(metaActivity -> {
				Activity activity = new Activity();
				activity.setMetaName(metaActivity.getName());
				activity.setName(rnd.next());
				return activity;
			}).collect(Collectors.toList()));
		}
	}
}
