package com.bst.pmgr.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.bst.pmgr.entities.audit.WorkAudit;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@EntityListeners(WorkAudit.class)
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "workType")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@Table(name = "WORK_TABLE")
public class Work {	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(nullable = false)
	private String name;

	@OneToMany(mappedBy = "work")
	private final List<Activity> activities = new ArrayList<>();

	@OneToMany(mappedBy = "work")
	private final List<Document> documents = new ArrayList<>();

	@OneToMany(mappedBy = "work")
	private final List<Tool> tools = new ArrayList<>();

	@OneToMany(mappedBy = "work")
	private final List<Process> processes = new ArrayList<>();

	@OneToMany(mappedBy = "work")
	private final List<ProcessGroup> processGroups = new ArrayList<>();

	@ManyToOne(fetch = FetchType.LAZY)
	private PmgrPerson createdBy;

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
		final Work other = (Work) obj;
		if (this.activities == null) {
			if (other.activities != null) {
				return false;
			}
		} else if (!this.activities.equals(other.activities)) {
			return false;
		}
		if (this.createdBy == null) {
			if (other.createdBy != null) {
				return false;
			}
		} else if (!this.createdBy.equals(other.createdBy)) {
			return false;
		}
		if (this.documents == null) {
			if (other.documents != null) {
				return false;
			}
		} else if (!this.documents.equals(other.documents)) {
			return false;
		}
		if (this.id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!this.id.equals(other.id)) {
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
		if (this.tools == null) {
			if (other.tools != null) {
				return false;
			}
		} else if (!this.tools.equals(other.tools)) {
			return false;
		}
		return true;
	}

	public List<Activity> getActivities() {
		return this.activities;
	}

	public PmgrPerson getCreatedBy() {
		return this.createdBy;
	}

	public List<Document> getDocuments() {
		return this.documents;
	}

	public Long getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public List<Process> getProcesses() {
		return this.processes;
	}

	public List<ProcessGroup> getProcessGroups() {
		return this.processGroups;
	}

	public List<Tool> getTools() {
		return this.tools;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((this.activities == null) ? 0 : this.activities.hashCode());
		result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
		result = prime * result + ((this.documents == null) ? 0 : this.documents.hashCode());
		result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
		result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
		result = prime * result + ((this.processGroups == null) ? 0 : this.processGroups.hashCode());
		result = prime * result + ((this.processes == null) ? 0 : this.processes.hashCode());
		result = prime * result + ((this.tools == null) ? 0 : this.tools.hashCode());
		return result;
	}

	public void setCreatedBy(final PmgrPerson createdBy) {
		this.createdBy = createdBy;
	}

	public void setName(final String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Work [id=" + this.id + ", name=" + this.name + ", createdBy=" + this.createdBy + "]";
	}

}
