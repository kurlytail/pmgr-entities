package com.bst.pmgr.entities.schema;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class SchemaService {

	static final Logger LOG = LoggerFactory.getLogger(SchemaService.class);

	@Autowired
	private ResourceLoader resourceLoader;

	private Map<String, SchemaActivity> schemaMap = new HashMap<>();
	private Map<String, MetaActivity> activities = new HashMap<>();
	private Map<String, MetaDocument> documents = new HashMap<>();
	private Map<String, MetaTool> tools = new HashMap<>();
	private Map<String, MetaProcess> processes = new HashMap<>();

	private Map<String, MetaProcessGroup> processGroups = new HashMap<>();
	
	@PostConstruct
	public void init() throws JsonProcessingException, IOException {
		final ObjectMapper objectMapper = new ObjectMapper();
		this.schemaMap = objectMapper.readValue(resourceLoader.getResource("classpath:schema.json").getInputStream(),
				new TypeReference<Map<String, SchemaActivity>>() {
				});

		this.createSkeletonMaps();
		this.fixupActivities();
		this.fixupDocuments();
		this.fixupTools();
		this.fixupProcesses();
		this.fixupProcessGroups();
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
			final SchemaActivity schemaActivity = this.schemaMap.get(name);

			schemaActivity.getInputs().forEach(inputName -> {
				final MetaDocument metaDocument = this.documents.get(inputName);
				metaDocument.getConsumingActivities().put(inputName, metaActivity);
				schemaActivity.getTools().forEach(toolName -> {
					metaDocument.getConsumingTools().put(toolName, this.tools.get(toolName));
				});
				metaDocument.getConsumingProcesses().put(schemaActivity.getProcess(),
						this.processes.get(schemaActivity.getProcess()));
				metaDocument.getConsumingProcessGroups().put(schemaActivity.getProcessGroup(),
						this.processGroups.get(schemaActivity.getProcessGroup()));
			});

			schemaActivity.getOutputs().forEach(outputName -> {
				final MetaDocument metaDocument = this.documents.get(outputName);
				metaDocument.getProducingActivities().put(outputName, metaActivity);
				schemaActivity.getTools().forEach(toolName -> {
					metaDocument.getProducingTools().put(toolName, this.tools.get(toolName));
				});
				metaDocument.getProducingProcesses().put(schemaActivity.getProcess(),
						this.processes.get(schemaActivity.getProcess()));
				metaDocument.getProducingProcessGroups().put(schemaActivity.getProcessGroup(),
						this.processGroups.get(schemaActivity.getProcessGroup()));
			});
		});
	}

	private void fixupProcesses() {
		this.activities.forEach((name, metaActivity) -> {
			final SchemaActivity schemaActivity = this.schemaMap.get(name);

			final String process = schemaActivity.getProcess();
			final MetaProcess metaProcess = this.processes.get(process);
			metaProcess.getActivities().put(name, metaActivity);
			schemaActivity.getInputs().forEach(inputName -> {
				metaProcess.getConsumedDocuments().put(inputName, this.documents.get(inputName));
			});
			schemaActivity.getOutputs().forEach(outputName -> {
				metaProcess.getProducedDocuments().put(outputName, this.documents.get(outputName));
			});
			metaProcess.setProcessGroup(this.processGroups.get(schemaActivity.getProcess()));
			schemaActivity.getTools().forEach(toolName -> {
				metaProcess.getTools().put(toolName, this.tools.get(toolName));
			});
		});
	}

	private void fixupProcessGroups() {
		this.activities.forEach((name, metaActivity) -> {
			final SchemaActivity schemaActivity = this.schemaMap.get(name);

			final String processGroupName = schemaActivity.getProcessGroup();
			final MetaProcessGroup metaProcessGroup = this.processGroups.get(processGroupName);
			metaProcessGroup.getActivities().put(name, metaActivity);
			schemaActivity.getInputs().forEach(inputName -> {
				metaProcessGroup.getConsumedDocuments().put(inputName, this.documents.get(inputName));
			});
			schemaActivity.getOutputs().forEach(outputName -> {
				metaProcessGroup.getProducedDocuments().put(outputName, this.documents.get(outputName));
			});
			metaProcessGroup.getProcesses().put(schemaActivity.getProcess(),
					this.processes.get(schemaActivity.getProcess()));
			schemaActivity.getTools().forEach(toolName -> {
				metaProcessGroup.getTools().put(toolName, this.tools.get(toolName));
			});
		});
	}

	private void fixupTools() {
		this.activities.forEach((name, metaActivity) -> {
			final SchemaActivity schemaActivity = this.schemaMap.get(name);

			schemaActivity.getTools().forEach(toolName -> {
				final MetaTool metaTool = this.tools.get(toolName);
				metaTool.getActivities().put(name, metaActivity);
				schemaActivity.getInputs().forEach(inputName -> {
					metaTool.getConsumedDocuments().put(inputName, this.documents.get(inputName));
				});
				metaActivity.getOutputs().forEach((outputName, metaDocument) -> {
					metaTool.getProducedDocuments().put(outputName, this.documents.get(outputName));
				});
				metaTool.getProcesses().put(schemaActivity.getProcess(),
						this.processes.get(schemaActivity.getProcess()));
				metaTool.getProcessGroups().put(schemaActivity.getProcessGroup(),
						this.processGroups.get(schemaActivity.getProcessGroup()));
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

	public void setActivities(final Map<String, MetaActivity> activities) {
		this.activities = activities;
	}

	public void setDocuments(final Map<String, MetaDocument> documents) {
		this.documents = documents;
	}

	public void setProcesses(final Map<String, MetaProcess> processes) {
		this.processes = processes;
	}

	public void setProcessGroups(final Map<String, MetaProcessGroup> processGroups) {
		this.processGroups = processGroups;
	}

	public void setSchemaMap(final Map<String, SchemaActivity> schemaMap) {
		this.schemaMap = schemaMap;
	}

	public void setTools(final Map<String, MetaTool> tools) {
		this.tools = tools;
	}

}
