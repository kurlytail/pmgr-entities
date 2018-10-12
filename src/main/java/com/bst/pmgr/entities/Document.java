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

import com.bst.utility.components.AuditListener;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@EntityListeners(AuditListener.class)
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "documentType")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Document {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String name;

	@ManyToOne
	private Work work;

	@OneToMany(mappedBy = "document")
	private List<Section> sections;

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
		final Document other = (Document) obj;
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
		if (this.sections == null) {
			if (other.sections != null) {
				return false;
			}
		} else if (!this.sections.equals(other.sections)) {
			return false;
		}
		if (this.work == null) {
			if (other.work != null) {
				return false;
			}
		} else if (!this.work.equals(other.work)) {
			return false;
		}
		return true;
	}

	public Long getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public List<Section> getSections() {
		return this.sections;
	}

	public Work getWork() {
		return this.work;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
		result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
		result = prime * result + ((this.sections == null) ? 0 : this.sections.hashCode());
		result = prime * result + ((this.work == null) ? 0 : this.work.hashCode());
		return result;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public void setWork(final Work work) {
		this.work = work;
	}

	@Override
	public String toString() {
		return "Document [id=" + this.id + ", name=" + this.name + ", work=" + this.work + ", sections=" + this.sections
				+ "]";
	}
}
