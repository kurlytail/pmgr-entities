package com.bst.pmgr.entities;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;

import com.bst.utility.components.AuditListener;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@EntityListeners(AuditListener.class)
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "processType")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Process {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String name;

	private String metaName;

	@ManyToOne
	private Work work;

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
		final Process other = (Process) obj;
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
		result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
		result = prime * result + ((this.metaName == null) ? 0 : this.metaName.hashCode());
		result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
		result = prime * result + ((this.work == null) ? 0 : this.work.hashCode());
		return result;
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
		return "Process [id=" + this.id + ", name=" + this.name + ", metaName=" + this.metaName + ", work=" + this.work
				+ "]";
	}

}
