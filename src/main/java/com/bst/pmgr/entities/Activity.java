package com.bst.pmgr.entities;

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

import com.bst.pmgr.entities.audit.ActivityAudit;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@EntityListeners(ActivityAudit.class)
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "activityType")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Activity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	public void setName(String name) {
		this.name = name;
	}

	public void setMetaName(String metaName) {
		this.metaName = metaName;
	}

	public void setWork(Work work) {
		this.work = work;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getMetaName() {
		return metaName;
	}

	public Work getWork() {
		return work;
	}

	private String name;

	@Column(nullable = false, updatable = false)
	private String metaName;

	@ManyToOne(fetch = FetchType.LAZY)
	private Work work;
}
