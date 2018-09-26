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

import com.bst.pmgr.entities.audit.ProcessAudit;

@EntityListeners(ProcessAudit.class)
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "processType")
public class Process {
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

	public String getMetaName() {
		return metaName;
	}

	public void setMetaName(String metaName) {
		this.metaName = metaName;
	}

	private String name;
	
	private String metaName;
    
	@ManyToOne
	private Work work;

}
