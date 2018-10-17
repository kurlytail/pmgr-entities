package com.bst.pmgr.entities.components;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import org.kohsuke.randname.RandomNameGenerator;
import org.springframework.beans.factory.annotation.Autowired;

import com.bst.pmgr.entities.Activity;
import com.bst.pmgr.entities.Tool;
import com.bst.pmgr.entities.schema.MetaTool;
import com.bst.pmgr.entities.schema.SchemaService;

public class ActivityListener {
	private final RandomNameGenerator rnd = new RandomNameGenerator(0);

	@Autowired
	private SchemaService schemaService;

	@PreUpdate
	@PrePersist
	public void prePersist(final Activity activity) throws Exception {
		if (activity.getName() == null) {
			activity.setName(this.rnd.next());
		}

		if (activity.getMetaName() == null) {
			throw new Exception("Document does not have a meta name");
		}

		final Map<String, MetaTool> tools = new HashMap<>();
		tools.putAll(this.schemaService.getActivities().get(activity.getMetaName()).getTools());
		final List<Tool> workTools = activity.getWork().getTools();

		for (final Tool workTool : workTools) {
			if (workTool.getActivity() == activity) {
				tools.remove(workTool.getMetaName());
				continue;
			}
			activity.addToTools(workTool);
			tools.remove(activity.getMetaName());
		}

		for (final MetaTool metaTool : tools.values()) {
			final Tool tool = new Tool();
			tool.setMetaName(metaTool.getName());
			tool.setName(this.rnd.next());

			activity.addToTools(tool);
		}
	}
}
