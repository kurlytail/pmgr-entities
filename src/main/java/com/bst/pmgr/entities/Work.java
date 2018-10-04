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

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@EntityListeners(WorkAudit.class)
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "workType")
@ToString
@Getter
@EqualsAndHashCode
public class Work {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    
    @Column(nullable = false, updatable = false)
    @Setter
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
}
