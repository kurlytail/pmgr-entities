package com.bst.pmgr.entities.components;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import org.kohsuke.randname.RandomNameGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bst.pmgr.entities.Document;
import com.bst.pmgr.entities.Tool;
import com.bst.pmgr.entities.schema.MetaActivity;
import com.bst.pmgr.entities.schema.MetaTool;
import com.bst.pmgr.entities.schema.SchemaService;

@Component
public class DocumentListener {

	private final RandomNameGenerator rnd = new RandomNameGenerator(0);

	@Autowired
	private SchemaService schemaService;

	@PreUpdate
	@PrePersist
	public void prePersist(final Document document) throws Exception {
		if (document.getName() == null) {
			document.setName(this.rnd.next());
		}

		if (document.getMetaName() == null) {
			throw new Exception("Document does not have a meta name");
		}

		Map<String, MetaTool> producingTools = new HashMap<>();
		producingTools.putAll(schemaService.getDocuments().get(document.getMetaName()).getProducingTools());
		List<Tool> workTools = document.getWork().getTools();
		Map<String, MetaActivity> producingActivities = schemaService.getDocuments().get(document.getMetaName())
				.getProducingActivities();
		for (Tool workTool : workTools) {
			// Equality of references ??
			if (workTool.getDocument() == document) {
				producingTools.remove(workTool.getMetaName());
				continue;
			}
			if (workTool.getActivity() != null && producingActivities.containsKey(workTool.getActivity().getMetaName())) {
				producingTools.remove(workTool.getMetaName());
				continue;
			}
			
			document.addTool(workTool);
		}
		
		for(MetaTool metaTool : producingTools.values()) {
			final Tool tool = new Tool();
			tool.setMetaName(metaTool.getName());
			tool.setName(this.rnd.next());
			
			document.addTool(tool);
		}
	}

}
