package com.bst.pmgr.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
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

	@Column(nullable = false)
	private String metaName;

	private String name;

	@ManyToOne(cascade = CascadeType.ALL)
	private Work work;

	@OneToMany(mappedBy = "document", orphanRemoval = true, cascade = CascadeType.ALL)
	private final List<Tool> tools = new ArrayList<>();

	@OneToMany(mappedBy = "document", orphanRemoval = true, cascade = CascadeType.ALL)
	private final List<Section> sections = new ArrayList<>();

	public void addTool(final Tool tool) {
		this.tools.add(tool);
		tool.setDocument(this);
	}

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
		if (this.metaName == null) {
			if (other.metaName != null) {
				return false;
			}
		} else if (!this.metaName.equals(other.metaName)) {
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
		if (this.tools == null) {
			if (other.tools != null) {
				return false;
			}
		} else if (!this.tools.equals(other.tools)) {
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

	public String getMetaName() {
		return this.metaName;
	}

	public String getName() {
		return this.name;
	}

	public List<Section> getSections() {
		return this.sections;
	}

	public List<Tool> getTools() {
		return this.tools;
	}

	public Work getWork() {
		return this.work;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
		result = prime * result + ((this.metaName == null) ? 0 : this.metaName.hashCode());
		result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
		result = prime * result + ((this.sections == null) ? 0 : this.sections.hashCode());
		result = prime * result + ((this.tools == null) ? 0 : this.tools.hashCode());
		result = prime * result + ((this.work == null) ? 0 : this.work.hashCode());
		return result;
	}

	public void removeTool(final Tool tool) {
		this.tools.remove(tool);
		tool.setDocument(null);
	}

	public void setMetaName(final String metaName) {
		this.metaName = metaName;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public void setWork(final Work work) {
		this.work = work;
	}

	@Override
	public String toString() {
		return "Document [id=" + this.id + ", metaName=" + this.metaName + ", name=" + this.name + ", work=" + this.work
				+ ", tools=" + this.tools + ", sections=" + this.sections + "]";
	}
}
