package com.bst.pmgr.entities.schema;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators.StringIdGenerator;

@JsonIdentityInfo(generator = StringIdGenerator.class, property = "name")
public class MetaActivity {

	private Map<String, MetaDocument> inputs = new HashMap<>();
	private String name;
	private Map<String, MetaDocument> outputs = new HashMap<>();
	private MetaProcess process;
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
		final MetaActivity other = (MetaActivity) obj;
		if (this.inputs == null) {
			if (other.inputs != null) {
				return false;
			}
		} else if (!this.inputs.equals(other.inputs)) {
			return false;
		}
		if (this.name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!this.name.equals(other.name)) {
			return false;
		}
		if (this.outputs == null) {
			if (other.outputs != null) {
				return false;
			}
		} else if (!this.outputs.equals(other.outputs)) {
			return false;
		}
		if (this.process == null) {
			if (other.process != null) {
				return false;
			}
		} else if (!this.process.equals(other.process)) {
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

	public Map<String, MetaDocument> getInputs() {
		return this.inputs;
	}

	public String getName() {
		return this.name;
	}

	public Map<String, MetaDocument> getOutputs() {
		return this.outputs;
	}

	public MetaProcess getProcess() {
		return this.process;
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
		result = prime * result + ((this.inputs == null) ? 0 : this.inputs.hashCode());
		result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
		result = prime * result + ((this.outputs == null) ? 0 : this.outputs.hashCode());
		result = prime * result + ((this.process == null) ? 0 : this.process.hashCode());
		result = prime * result + ((this.processGroup == null) ? 0 : this.processGroup.hashCode());
		result = prime * result + ((this.tools == null) ? 0 : this.tools.hashCode());
		return result;
	}

	public void setInputs(Map<String, MetaDocument> inputs) {
		this.inputs = inputs;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setOutputs(Map<String, MetaDocument> outputs) {
		this.outputs = outputs;
	}

	public void setProcess(MetaProcess process) {
		this.process = process;
	}

	public void setProcessGroup(MetaProcessGroup processGroup) {
		this.processGroup = processGroup;
	}

	public void setTools(Map<String, MetaTool> tools) {
		this.tools = tools;
	}

	@Override
	public String toString() {
		return "MetaActivity [inputs=" + this.inputs + ", name=" + this.name + ", outputs=" + this.outputs
				+ ", process=" + this.process + ", processGroup=" + this.processGroup + ", tools=" + this.tools + "]";
	}

}
