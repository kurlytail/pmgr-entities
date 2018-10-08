package com.bst.pmgr.entities.schema;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators.StringIdGenerator;

@JsonIdentityInfo(generator = StringIdGenerator.class, property = "name")
public class MetaTool {
	private String name;
	private Map<String, MetaActivity> activities = new HashMap<>();
	private Map<String, MetaDocument> producedDocuments = new HashMap<>();
	private Map<String, MetaDocument> consumedDocuments = new HashMap<>();
	private Map<String, MetaProcess> processes = new HashMap<>();
	private Map<String, MetaProcessGroup> processGroups = new HashMap<>();

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
		final MetaTool other = (MetaTool) obj;
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
		if (this.producedDocuments == null) {
			if (other.producedDocuments != null) {
				return false;
			}
		} else if (!this.producedDocuments.equals(other.producedDocuments)) {
			return false;
		}
		if (this.name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!this.name.equals(other.name)) {
			return false;
		}
		if (this.processGroups == null) {
			if (other.processGroups != null) {
				return false;
			}
		} else if (!this.processGroups.equals(other.processGroups)) {
			return false;
		}
		if (this.processes == null) {
			if (other.processes != null) {
				return false;
			}
		} else if (!this.processes.equals(other.processes)) {
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

	public String getName() {
		return this.name;
	}

	public Map<String, MetaProcess> getProcesses() {
		return this.processes;
	}

	public Map<String, MetaProcessGroup> getProcessGroups() {
		return this.processGroups;
	}

	public Map<String, MetaDocument> getProducedDocuments() {
		return this.producedDocuments;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((this.activities == null) ? 0 : this.activities.hashCode());
		result = prime * result + ((this.consumedDocuments == null) ? 0 : this.consumedDocuments.hashCode());
		result = prime * result + ((this.producedDocuments == null) ? 0 : this.producedDocuments.hashCode());
		result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
		result = prime * result + ((this.processGroups == null) ? 0 : this.processGroups.hashCode());
		result = prime * result + ((this.processes == null) ? 0 : this.processes.hashCode());
		return result;
	}

	public void setActivities(Map<String, MetaActivity> activities) {
		this.activities = activities;
	}

	public void setConsumedDocuments(Map<String, MetaDocument> consumedDocuments) {
		this.consumedDocuments = consumedDocuments;
	}

	public void setGeneratedDocuments(Map<String, MetaDocument> generatedDocuments) {
		this.producedDocuments = generatedDocuments;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setProcesses(Map<String, MetaProcess> processes) {
		this.processes = processes;
	}

	public void setProcessGroups(Map<String, MetaProcessGroup> processGroups) {
		this.processGroups = processGroups;
	}

	@Override
	public String toString() {
		return "MetaTool [name=" + this.name + "]";
	}

}
