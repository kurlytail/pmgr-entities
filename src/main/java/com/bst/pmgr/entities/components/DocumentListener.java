package com.bst.pmgr.entities.components;

import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.PrePersist;

import org.kohsuke.randname.RandomNameGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bst.pmgr.entities.Document;
import com.bst.pmgr.entities.Tool;
import com.bst.pmgr.entities.schema.SchemaService;

@Component
public class DocumentListener {

	private final RandomNameGenerator rnd = new RandomNameGenerator(0);

	@Autowired
	private SchemaService schemaService;

	@PrePersist
	public void prePersist(final Document document) throws Exception {
		if (document.getName() == null) {
			document.setName(this.rnd.next());
		}

		if (document.getMetaName() == null) {
			throw new Exception("Document does not have a meta name");
		}

		if (document.getTools().size() == 0) {
			final List<Tool> toolList = this.schemaService.getDocuments().get(document.getMetaName())
					.getProducingTools().values().stream().map(metaTool -> {
						final Tool tool = new Tool();
						tool.setMetaName(metaTool.getName());
						tool.setName(this.rnd.next());
						tool.setDocument(document);
						return tool;
					}).collect(Collectors.toList());

			document.getTools().addAll(toolList);
			document.getWork().getTools().addAll(toolList);
		}
	}

}
