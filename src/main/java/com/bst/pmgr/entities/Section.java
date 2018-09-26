package com.bst.pmgr.entities;

import java.util.ArrayList;
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

import com.bst.pmgr.entities.audit.SectionAudit;

@EntityListeners(SectionAudit.class)
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "sectionType")
public class Section {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
	private String name;
	private String summary;
	private String description;
	
	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Document getDocument() {
		return document;
	}

	public Section getParentSection() {
		return parentSection;
	}

	public List<Section> getChildSections() {
		return childSections;
	}

	@ManyToOne
	private Document document;
	
	@ManyToOne
	private Section parentSection;
	
	@OneToMany(mappedBy = "parentSection")
	private List<Section> childSections = new ArrayList<>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
