package com.bst.pmgr.entities;

import java.util.List;

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

import com.bst.pmgr.entities.audit.DocumentAudit;

@EntityListeners(DocumentAudit.class)
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "documentType")
public class Document {
	public void setName(String name) {
		this.name = name;
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

	public Work getWork() {
		return work;
	}

	public List<Section> getSections() {
		return sections;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String name;

	@ManyToOne
	private Work work;

	@OneToMany(mappedBy = "document")
	private List<Section> sections;
}
