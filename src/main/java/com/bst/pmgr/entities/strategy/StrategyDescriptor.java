package com.bst.pmgr.entities.strategy;

import com.bst.pmgr.entities.Activity;
import com.bst.pmgr.entities.Document;
import com.bst.pmgr.entities.Process;
import com.bst.pmgr.entities.ProcessGroup;
import com.bst.pmgr.entities.Tool;

public class StrategyDescriptor {

	private Document documents;
	private Tool tools;
	private Activity activities;
	private ProcessGroup processGroups;
	private Process processes;

	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		final StrategyDescriptor other = (StrategyDescriptor) obj;
		if (this.activities == null) {
			if (other.activities != null) {
				return false;
			}
		} else if (!this.activities.equals(other.activities)) {
			return false;
		}
		if (this.documents == null) {
			if (other.documents != null) {
				return false;
			}
		} else if (!this.documents.equals(other.documents)) {
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
		if (this.tools == null) {
			if (other.tools != null) {
				return false;
			}
		} else if (!this.tools.equals(other.tools)) {
			return false;
		}
		return true;
	}

	public Activity getActivities() {
		return this.activities;
	}

	public Document getDocuments() {
		return this.documents;
	}

	public Process getProcesses() {
		return this.processes;
	}

	public ProcessGroup getProcessGroups() {
		return this.processGroups;
	}

	public Tool getTools() {
		return this.tools;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((this.activities == null) ? 0 : this.activities.hashCode());
		result = prime * result + ((this.documents == null) ? 0 : this.documents.hashCode());
		result = prime * result + ((this.processGroups == null) ? 0 : this.processGroups.hashCode());
		result = prime * result + ((this.processes == null) ? 0 : this.processes.hashCode());
		result = prime * result + ((this.tools == null) ? 0 : this.tools.hashCode());
		return result;
	}

	public void setActivities(final Activity activities) {
		this.activities = activities;
	}

	public void setDocuments(final Document documents) {
		this.documents = documents;
	}

	public void setProcesses(final Process processes) {
		this.processes = processes;
	}

	public void setProcessGroups(final ProcessGroup processGroups) {
		this.processGroups = processGroups;
	}

	public void setTools(final Tool tools) {
		this.tools = tools;
	}

	@Override
	public String toString() {
		return "StrategyDescriptor [documents=" + this.documents + ", tools=" + this.tools + ", activities="
				+ this.activities + ", processGroups=" + this.processGroups + ", processes=" + this.processes + "]";
	}

}
