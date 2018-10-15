package com.bst.pmgr.entities;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "toolType")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Tool {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;

	private String metaName;

	@ManyToOne(cascade = CascadeType.ALL)
	private Work work;

	@ManyToOne(cascade = CascadeType.ALL)
	private Document document;

	@ManyToOne(cascade = CascadeType.ALL)
	private Activity activity;

	@Min(0)
	@Max(100)
	int executionPercent = 0;

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
		final Tool other = (Tool) obj;
		if (this.activity == null) {
			if (other.activity != null) {
				return false;
			}
		} else if (!this.activity.equals(other.activity)) {
			return false;
		}
		if (this.document == null) {
			if (other.document != null) {
				return false;
			}
		} else if (!this.document.equals(other.document)) {
			return false;
		}
		if (this.executionPercent != other.executionPercent) {
			return false;
		}
		if (this.id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!this.id.equals(other.id)) {
			return false;
		}
		if (this.metaName == null) {
			if (other.metaName != null) {
				return false;
			}
		} else if (!this.metaName.equals(other.metaName)) {
			return false;
		}
		if (this.name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!this.name.equals(other.name)) {
			return false;
		}
		if (this.work == null) {
			if (other.work != null) {
				return false;
			}
		} else if (!this.work.equals(other.work)) {
			return false;
		}
		return true;
	}

	public Activity getActivity() {
		return this.activity;
	}

	public Document getDocument() {
		return this.document;
	}

	public int getExecutionPercent() {
		return this.executionPercent;
	}

	public Long getId() {
		return this.id;
	}

	public String getMetaName() {
		return this.metaName;
	}

	public String getName() {
		return this.name;
	}

	public Work getWork() {
		return this.work;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((this.activity == null) ? 0 : this.activity.hashCode());
		result = prime * result + ((this.document == null) ? 0 : this.document.hashCode());
		result = prime * result + this.executionPercent;
		result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
		result = prime * result + ((this.metaName == null) ? 0 : this.metaName.hashCode());
		result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
		result = prime * result + ((this.work == null) ? 0 : this.work.hashCode());
		return result;
	}

	public void setActivity(final Activity activity) {
		this.activity = activity;
	}

	public void setDocument(final Document document) {
		this.document = document;
	}

	public void setExecutionPercent(final int executionPercent) {
		this.executionPercent = executionPercent;
	}

	public void setMetaName(final String metaName) {
		this.metaName = metaName;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public void setWork(final Work work) {
		this.work = work;
	}

	@Override
	public String toString() {
		return "Tool [id=" + this.id + ", name=" + this.name + ", metaName=" + this.metaName + ", work=" + this.work
				+ ", document=" + this.document + ", activity=" + this.activity + ", executionPercent="
				+ this.executionPercent + "]";
	}

}
