package com.bst.pmgr.entities;

import java.util.List;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

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

	public void setDocument(Document document) {
		this.document = document;
	}

	public Section getParentSection() {
		return parentSection;
	}

	public void setParentSection(Section parentSection) {
		this.parentSection = parentSection;
	}

	public List<Section> getChildSections() {
		return childSections;
	}

	public void setChildSections(List<Section> childSections) {
		this.childSections = childSections;
	}

	@ManyToOne
	private Document document;
	
	@ManyToOne
	private Section parentSection;
	
	@OneToMany(mappedBy = "parentSection")
	private List<Section> childSections;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
