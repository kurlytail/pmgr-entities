package com.bst.pmgr.entities.schema;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class SchemaService {

	private Map<String, SchemaActivity> schemaMap = new HashMap<>();
	private Map<String, MetaActivity> activities = new HashMap<>();
	private Map<String, MetaDocument> documents = new HashMap<>();
	private Map<String, MetaTool> tools = new HashMap<>();
	private Map<String, MetaProcess> processes = new HashMap<>();
	private Map<String, MetaProcessGroup> processGroups = new HashMap<>();

	public SchemaService() throws JsonProcessingException, IOException {
		final ObjectMapper objectMapper = new ObjectMapper();
		this.schemaMap = objectMapper.readValue(this.getClass().getResourceAsStream("schema.json"),
				new TypeReference<Map<String, SchemaActivity>>(){});

		this.createSkeletonMaps();
		this.fixupActivities();
		this.fixupDocuments();
	}

	private void createSkeletonMaps() {
		this.schemaMap.forEach((name, meta) -> {
			final MetaActivity metaActivity = new MetaActivity();
			metaActivity.setName(name);
			this.activities.put(name, metaActivity);

			meta.getInputs().forEach(inputName -> {
				final MetaDocument metaDocument = new MetaDocument();
				metaDocument.setName(inputName);
				this.documents.put(inputName, metaDocument);
			});

			meta.getOutputs().forEach(outputName -> {
				final MetaDocument metaDocument = new MetaDocument();
				metaDocument.setName(outputName);
				this.documents.put(outputName, metaDocument);
			});

			meta.getTools().forEach(toolName -> {
				final MetaTool metaTool = new MetaTool();
				metaTool.setName(toolName);
				this.tools.put(toolName, metaTool);
			});

			final MetaProcessGroup metaProcessGroup = new MetaProcessGroup();
			metaProcessGroup.setName(meta.getProcessGroup());
			this.processGroups.put(metaProcessGroup.getName(), metaProcessGroup);

			final MetaProcess metaProcess = new MetaProcess();
			metaProcess.setName(meta.getProcess());
			this.processes.put(metaProcess.getName(), metaProcess);
		});
	}

	private void fixupActivities() {
		this.activities.forEach((name, metaActivity) -> {
			final SchemaActivity schemaActivity = this.schemaMap.get(name);
			schemaActivity.getInputs().forEach(inputName -> {
				metaActivity.getInputs().put(inputName, this.documents.get(inputName));
			});
			schemaActivity.getOutputs().forEach(outputName -> {
				metaActivity.getOutputs().put(outputName, this.documents.get(outputName));
			});
			schemaActivity.getTools().forEach(toolName -> {
				metaActivity.getTools().put(toolName, this.tools.get(toolName));
			});
			metaActivity.setProcess(this.processes.get(schemaActivity.getProcess()));
			metaActivity.setProcessGroup(this.processGroups.get(schemaActivity.getProcessGroup()));
		});
	}

	private void fixupDocuments() {
		this.activities.forEach((name, metaActivity) -> {
			metaActivity.getInputs().forEach((inputName, metaDocument) -> {
				metaDocument.getConsumingActivities().put(inputName, metaActivity);
				metaActivity.getTools().forEach((toolName, metaTool) -> {
					metaDocument.getConsumingTools().put(toolName, metaTool);
				});
				metaDocument.getConsumingProcesses().put(metaActivity.getProcess().getName(),
						metaActivity.getProcess());
				metaDocument.getConsumingProcessGroups().put(metaActivity.getProcessGroup().getName(),
						metaActivity.getProcessGroup());
			});

			metaActivity.getOutputs().forEach((outputName, metaDocument) -> {
				metaDocument.getProducingActivities().put(outputName, metaActivity);
				metaActivity.getTools().forEach((toolName, metaTool) -> {
					metaDocument.getProducingTools().put(toolName, metaTool);
				});
				metaDocument.getProducingProcesses().put(metaActivity.getProcess().getName(),
						metaActivity.getProcess());
				metaDocument.getProducingProcessGroups().put(metaActivity.getProcessGroup().getName(),
						metaActivity.getProcessGroup());
			});
		});
	}

	public Map<String, MetaActivity> getActivities() {
		return this.activities;
	}

	public Map<String, MetaDocument> getDocuments() {
		return this.documents;
	}

	public Map<String, MetaProcess> getProcesses() {
		return this.processes;
	}

	public Map<String, MetaProcessGroup> getProcessGroups() {
		return this.processGroups;
	}

	public Map<String, SchemaActivity> getSchemaMap() {
		return this.schemaMap;
	}

	public Map<String, MetaTool> getTools() {
		return this.tools;
	}

	public void setActivities(Map<String, MetaActivity> activities) {
		this.activities = activities;
	}

	public void setDocuments(Map<String, MetaDocument> documents) {
		this.documents = documents;
	}

	public void setProcesses(Map<String, MetaProcess> processes) {
		this.processes = processes;
	}

	public void setProcessGroups(Map<String, MetaProcessGroup> processGroups) {
		this.processGroups = processGroups;
	}

	public void setSchemaMap(Map<String, SchemaActivity> schemaMap) {
		this.schemaMap = schemaMap;
	}

	public void setTools(Map<String, MetaTool> tools) {
		this.tools = tools;
	}

}
