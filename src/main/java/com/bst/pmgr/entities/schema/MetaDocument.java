package com.bst.pmgr.entities.schema;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators.StringIdGenerator;

@JsonIdentityInfo(generator = StringIdGenerator.class, property = "name")
public class MetaDocument {
	private String name;
	private Map<String, MetaActivity> producingActivities = new HashMap<>();
	private Map<String, MetaActivity> consumingActivities = new HashMap<>();
	private Map<String, MetaTool> producingTools = new HashMap<>();
	private Map<String, MetaTool> consumingTools = new HashMap<>();
	private Map<String, MetaProcessGroup> producingProcessGroups = new HashMap<>();
	private Map<String, MetaProcessGroup> consumingProcessGroups = new HashMap<>();
	private Map<String, MetaProcess> producingProcesses = new HashMap<>();
	private Map<String, MetaProcess> consumingProcesses = new HashMap<>();

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
		final MetaDocument other = (MetaDocument) obj;
		if (this.consumingActivities == null) {
			if (other.consumingActivities != null) {
				return false;
			}
		} else if (!this.consumingActivities.equals(other.consumingActivities)) {
			return false;
		}
		if (this.consumingProcessGroups == null) {
			if (other.consumingProcessGroups != null) {
				return false;
			}
		} else if (!this.consumingProcessGroups.equals(other.consumingProcessGroups)) {
			return false;
		}
		if (this.consumingProcesses == null) {
			if (other.consumingProcesses != null) {
				return false;
			}
		} else if (!this.consumingProcesses.equals(other.consumingProcesses)) {
			return false;
		}
		if (this.consumingTools == null) {
			if (other.consumingTools != null) {
				return false;
			}
		} else if (!this.consumingTools.equals(other.consumingTools)) {
			return false;
		}
		if (this.name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!this.name.equals(other.name)) {
			return false;
		}
		if (this.producingActivities == null) {
			if (other.producingActivities != null) {
				return false;
			}
		} else if (!this.producingActivities.equals(other.producingActivities)) {
			return false;
		}
		if (this.producingProcessGroups == null) {
			if (other.producingProcessGroups != null) {
				return false;
			}
		} else if (!this.producingProcessGroups.equals(other.producingProcessGroups)) {
			return false;
		}
		if (this.producingProcesses == null) {
			if (other.producingProcesses != null) {
				return false;
			}
		} else if (!this.producingProcesses.equals(other.producingProcesses)) {
			return false;
		}
		if (this.producingTools == null) {
			if (other.producingTools != null) {
				return false;
			}
		} else if (!this.producingTools.equals(other.producingTools)) {
			return false;
		}
		return true;
	}

	public Map<String, MetaActivity> getConsumingActivities() {
		return this.consumingActivities;
	}

	public Map<String, MetaProcess> getConsumingProcesses() {
		return this.consumingProcesses;
	}

	public Map<String, MetaProcessGroup> getConsumingProcessGroups() {
		return this.consumingProcessGroups;
	}

	public Map<String, MetaTool> getConsumingTools() {
		return this.consumingTools;
	}

	public String getName() {
		return this.name;
	}

	public Map<String, MetaActivity> getProducingActivities() {
		return this.producingActivities;
	}

	public Map<String, MetaProcess> getProducingProcesses() {
		return this.producingProcesses;
	}

	public Map<String, MetaProcessGroup> getProducingProcessGroups() {
		return this.producingProcessGroups;
	}

	public Map<String, MetaTool> getProducingTools() {
		return this.producingTools;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((this.consumingActivities == null) ? 0 : this.consumingActivities.hashCode());
		result = prime * result + ((this.consumingProcessGroups == null) ? 0 : this.consumingProcessGroups.hashCode());
		result = prime * result + ((this.consumingProcesses == null) ? 0 : this.consumingProcesses.hashCode());
		result = prime * result + ((this.consumingTools == null) ? 0 : this.consumingTools.hashCode());
		result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
		result = prime * result + ((this.producingActivities == null) ? 0 : this.producingActivities.hashCode());
		result = prime * result + ((this.producingProcessGroups == null) ? 0 : this.producingProcessGroups.hashCode());
		result = prime * result + ((this.producingProcesses == null) ? 0 : this.producingProcesses.hashCode());
		result = prime * result + ((this.producingTools == null) ? 0 : this.producingTools.hashCode());
		return result;
	}

	public void setConsumingActivities(Map<String, MetaActivity> consumingActivities) {
		this.consumingActivities = consumingActivities;
	}

	public void setConsumingProcesses(Map<String, MetaProcess> consumingProcesses) {
		this.consumingProcesses = consumingProcesses;
	}

	public void setConsumingProcessGroups(Map<String, MetaProcessGroup> consumingProcessGroups) {
		this.consumingProcessGroups = consumingProcessGroups;
	}

	public void setConsumingTools(Map<String, MetaTool> consumingTools) {
		this.consumingTools = consumingTools;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setProducingActivities(Map<String, MetaActivity> producingActivities) {
		this.producingActivities = producingActivities;
	}

	public void setProducingProcesses(Map<String, MetaProcess> producingProcesses) {
		this.producingProcesses = producingProcesses;
	}

	public void setProducingProcessGroups(Map<String, MetaProcessGroup> producingProcessGroups) {
		this.producingProcessGroups = producingProcessGroups;
	}

	public void setProducingTools(Map<String, MetaTool> producingTools) {
		this.producingTools = producingTools;
	}

	@Override
	public String toString() {
		return "MetaDocument [name=" + this.name + "]";
	}

}
