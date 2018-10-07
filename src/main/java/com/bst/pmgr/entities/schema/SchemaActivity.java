package com.bst.pmgr.entities.schema;

import java.util.ArrayList;
import java.util.List;

public class SchemaActivity {

	private List<String> inputs = new ArrayList<>();
	private List<String> outputs = new ArrayList<>();;
	private String process = "no_process";
	private String processGroup = "no_process_group";
	private List<String> tools = new ArrayList<>();;

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SchemaActivity other = (SchemaActivity) obj;
		if (inputs == null) {
			if (other.inputs != null)
				return false;
		} else if (!inputs.equals(other.inputs))
			return false;
		if (outputs == null) {
			if (other.outputs != null)
				return false;
		} else if (!outputs.equals(other.outputs))
			return false;
		if (process == null) {
			if (other.process != null)
				return false;
		} else if (!process.equals(other.process))
			return false;
		if (processGroup == null) {
			if (other.processGroup != null)
				return false;
		} else if (!processGroup.equals(other.processGroup))
			return false;
		if (tools == null) {
			if (other.tools != null)
				return false;
		} else if (!tools.equals(other.tools))
			return false;
		return true;
	}

	public List<String> getInputs() {
		return inputs;
	}

	public List<String> getOutputs() {
		return outputs;
	}

	public String getProcess() {
		return process;
	}

	public String getProcessGroup() {
		return processGroup;
	}

	public List<String> getTools() {
		return tools;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((inputs == null) ? 0 : inputs.hashCode());
		result = prime * result + ((outputs == null) ? 0 : outputs.hashCode());
		result = prime * result + ((process == null) ? 0 : process.hashCode());
		result = prime * result + ((processGroup == null) ? 0 : processGroup.hashCode());
		result = prime * result + ((tools == null) ? 0 : tools.hashCode());
		return result;
	}

	public void setInputs(List<String> inputs) {
		this.inputs = inputs;
	}

	public void setOutputs(List<String> outputs) {
		this.outputs = outputs;
	}

	public void setProcess(String process) {
		this.process = process;
	}

	public void setProcessGroup(String processGroup) {
		this.processGroup = processGroup;
	}

	public void setTools(List<String> tools) {
		this.tools = tools;
	}

	@Override
	public String toString() {
		return "SchemaActivity [inputs=" + inputs + ", outputs=" + outputs + ", tools=" + tools + ", processGroup="
				+ processGroup + ", process=" + process + "]";
	}
}
