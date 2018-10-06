package com.bst.pmgr.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import com.bst.pmgr.entities.audit.WorkAudit;

@EntityListeners(WorkAudit.class)
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "workType")
public class Work {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(nullable = false, updatable = false)
	private String name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public List<Activity> getActivities() {
		return activities;
	}

	public List<Document> getDocuments() {
		return documents;
	}

	public List<Tool> getTools() {
		return tools;
	}

	public List<Process> getProcesses() {
		return processes;
	}

	public List<ProcessGroup> getProcessGroups() {
		return processGroups;
	}

	public PmgrPerson getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(PmgrPerson createdBy) {
		this.createdBy = createdBy;
	}

	@OneToMany(mappedBy = "work")
	private List<Activity> activities = new ArrayList<Activity>();

	@OneToMany(mappedBy = "work")
	private List<Document> documents = new ArrayList<Document>();

	@OneToMany(mappedBy = "work")
	private List<Tool> tools = new ArrayList<Tool>();

	@OneToMany(mappedBy = "work")
	private List<Process> processes = new ArrayList<Process>();

	@OneToMany(mappedBy = "work")
	private List<ProcessGroup> processGroups = new ArrayList<ProcessGroup>();

	@NotNull
	@ManyToOne
	private PmgrPerson createdBy;
}
