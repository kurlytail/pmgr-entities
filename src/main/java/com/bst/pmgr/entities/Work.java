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

import com.bst.pmgr.entities.audit.WorkAudit;

@EntityListeners(WorkAudit.class)
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "workType")
public class Work {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    @Column(nullable = false, updatable = false)
	private String name;

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
    
    @ManyToOne
    private Manager manager;

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Activity> getActivities() {
		return activities;
	}

	public void setActivities(List<Activity> activities) {
		this.activities = activities;
	}

	public List<Document> getDocuments() {
		return documents;
	}

	public void setDocuments(List<Document> documents) {
		this.documents = documents;
	}

	public List<Tool> getTools() {
		return tools;
	}

	public void setTools(List<Tool> tools) {
		this.tools = tools;
	}

	public List<Process> getProcesses() {
		return processes;
	}

	public void setProcesses(List<Process> processes) {
		this.processes = processes;
	}

	public List<ProcessGroup> getProcessGroups() {
		return processGroups;
	}

	public void setProcessGroups(List<ProcessGroup> processGroups) {
		this.processGroups = processGroups;
	}

	
}
