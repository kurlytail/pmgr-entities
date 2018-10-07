package com.bst.pmgr.entities.schema;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators.StringIdGenerator;

@JsonIdentityInfo(generator = StringIdGenerator.class, property = "name")
public class MetaProcessGroup {
	private String name;
	private Map<String, MetaActivity> activities = new HashMap<>();
	private Map<String, MetaDocument> generatedDocuments = new HashMap<>();
	private Map<String, MetaDocument> consumedDocuments = new HashMap<>();
	private Map<String, MetaProcess> processes = new HashMap<>();
	private Map<String, MetaTool> tools = new HashMap<>();

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		final MetaProcessGroup other = (MetaProcessGroup) obj;
		if (this.activities == null) {
			if (other.activities != null) {
				return false;
			}
		} else if (!this.activities.equals(other.activities)) {
			return false;
		}
		if (this.consumedDocuments == null) {
			if (other.consumedDocuments != null) {
				return false;
			}
		} else if (!this.consumedDocuments.equals(other.consumedDocuments)) {
			return false;
		}
		if (this.generatedDocuments == null) {
			if (other.generatedDocuments != null) {
				return false;
			}
		} else if (!this.generatedDocuments.equals(other.generatedDocuments)) {
			return false;
		}
		if (this.name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!this.name.equals(other.name)) {
			return false;
		}
		if (this.processes == null) {
			if (other.processes != null) {
				return false;
			}
		} else if (!this.processes.equals(other.processes)) {
			return false;
		}
		if (this.tools == null) {
			if (other.tools != null) {
				return false;
			}
		} else if (!this.tools.equals(other.tools)) {
			return false;
		}
		return true;
	}

	public Map<String, MetaActivity> getActivities() {
		return this.activities;
	}

	public Map<String, MetaDocument> getConsumedDocuments() {
		return this.consumedDocuments;
	}

	public Map<String, MetaDocument> getGeneratedDocuments() {
		return this.generatedDocuments;
	}

	public String getName() {
		return this.name;
	}

	public Map<String, MetaProcess> getProcesses() {
		return this.processes;
	}

	public Map<String, MetaTool> getTools() {
		return this.tools;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((this.activities == null) ? 0 : this.activities.hashCode());
		result = prime * result + ((this.consumedDocuments == null) ? 0 : this.consumedDocuments.hashCode());
		result = prime * result + ((this.generatedDocuments == null) ? 0 : this.generatedDocuments.hashCode());
		result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
		result = prime * result + ((this.processes == null) ? 0 : this.processes.hashCode());
		result = prime * result + ((this.tools == null) ? 0 : this.tools.hashCode());
		return result;
	}

	public void setActivities(Map<String, MetaActivity> activities) {
		this.activities = activities;
	}

	public void setConsumedDocuments(Map<String, MetaDocument> consumedDocuments) {
		this.consumedDocuments = consumedDocuments;
	}

	public void setGeneratedDocuments(Map<String, MetaDocument> generatedDocuments) {
		this.generatedDocuments = generatedDocuments;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setProcesses(Map<String, MetaProcess> processes) {
		this.processes = processes;
	}

	public void setTools(Map<String, MetaTool> tools) {
		this.tools = tools;
	}

	@Override
	public String toString() {
		return "MetaProcessGroup [name=" + this.name + "]";
	}

}
