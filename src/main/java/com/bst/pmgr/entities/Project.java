package com.bst.pmgr.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Project {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    public Long getId() {
    	return id;
    }
    
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	private String name;
	
    @OneToMany(mappedBy = "project")
    private List<Activity> activities = new ArrayList<Activity>();
    
    @OneToMany(mappedBy = "project")
    private List<Document> documents = new ArrayList<Document>();
    
    @OneToMany(mappedBy = "project")
    private List<Tool> tools = new ArrayList<Tool>();

    @OneToMany(mappedBy = "project")
    private List<Process> processes = new ArrayList<Process>();

    @OneToMany(mappedBy = "project")
    private List<ProcessGroup> processGroups = new ArrayList<ProcessGroup>();

}
