package com.bst.pmgr.entities.schema;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators.StringIdGenerator;

@JsonIdentityInfo(generator = StringIdGenerator.class, property = "name")
public class MetaProcess {
	private String name;
	private Map<String, MetaActivity> activities = new HashMap<>();
	private Map<String, MetaDocument> producedDocuments = new HashMap<>();
	private Map<String, MetaDocument> consumedDocuments = new HashMap<>();
	private MetaProcessGroup processGroup;
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
		final MetaProcess other = (MetaProcess) obj;
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
		if (this.processGroup == null) {
			if (other.processGroup != null) {
				return false;
			}
		} else if (!this.processGroup.equals(other.processGroup)) {
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

	public Map<String, MetaDocument> getProducedDocuments() {
		return this.producedDocuments;
	}

	public String getName() {
		return this.name;
	}

	public MetaProcessGroup getProcessGroup() {
		return this.processGroup;
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
		result = prime * result + ((this.producedDocuments == null) ? 0 : this.producedDocuments.hashCode());
		result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
		result = prime * result + ((this.processGroup == null) ? 0 : this.processGroup.hashCode());
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
		this.producedDocuments = generatedDocuments;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setProcessGroup(MetaProcessGroup processGroup) {
		this.processGroup = processGroup;
	}

	public void setTools(Map<String, MetaTool> tools) {
		this.tools = tools;
	}

	@Override
	public String toString() {
		return "MetaProcess [name=" + this.name + "]";
	}

}
