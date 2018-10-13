package com.bst.pmgr.entities;

import java.util.ArrayList;
import java.util.Date;
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
import javax.persistence.PrePersist;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import com.bst.utility.components.AuditListener;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@EntityListeners(AuditListener.class)
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "sectionType")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Section {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String name;

	private String summary;

	private String description;

	@ManyToOne(cascade = CascadeType.ALL)
	private Document document;

	@ManyToOne(cascade = CascadeType.ALL)
	private Section parentSection;

	@JsonIgnore
	@OneToMany(mappedBy = "parentSection", cascade = CascadeType.ALL)
	private List<Section> childSections = new ArrayList<>();

	@Column(nullable = false, updatable = false)
	@CreatedDate
	@Temporal(TemporalType.TIMESTAMP)
	// @JsonFormat(shape = JsonFormat.Shape.STRING, pattern =
	// "yyyy-MM-dd@HH:mm:ss.SSSZ")
	@JsonIgnore
	private Date createdDate;

	@LastModifiedDate
	@Temporal(TemporalType.TIMESTAMP)
	// @JsonFormat(shape = JsonFormat.Shape.STRING, pattern =
	// "yyyy-MM-dd@HH:mm:ss.SSSZ")
	@JsonIgnore
	private Date modifiedDate;

	@CreatedBy
	private String createdBy;

	@LastModifiedBy
	private String modifiedBy;

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
		final Section other = (Section) obj;
		if (this.childSections == null) {
			if (other.childSections != null) {
				return false;
			}
		} else if (!this.childSections.equals(other.childSections)) {
			return false;
		}
		if (this.createdBy == null) {
			if (other.createdBy != null) {
				return false;
			}
		} else if (!this.createdBy.equals(other.createdBy)) {
			return false;
		}
		if (this.createdDate == null) {
			if (other.createdDate != null) {
				return false;
			}
		} else if (!this.createdDate.equals(other.createdDate)) {
			return false;
		}
		if (this.description == null) {
			if (other.description != null) {
				return false;
			}
		} else if (!this.description.equals(other.description)) {
			return false;
		}
		if (this.document == null) {
			if (other.document != null) {
				return false;
			}
		} else if (!this.document.equals(other.document)) {
			return false;
		}
		if (this.id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!this.id.equals(other.id)) {
			return false;
		}
		if (this.modifiedBy == null) {
			if (other.modifiedBy != null) {
				return false;
			}
		} else if (!this.modifiedBy.equals(other.modifiedBy)) {
			return false;
		}
		if (this.modifiedDate == null) {
			if (other.modifiedDate != null) {
				return false;
			}
		} else if (!this.modifiedDate.equals(other.modifiedDate)) {
			return false;
		}
		if (this.name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!this.name.equals(other.name)) {
			return false;
		}
		if (this.parentSection == null) {
			if (other.parentSection != null) {
				return false;
			}
		} else if (!this.parentSection.equals(other.parentSection)) {
			return false;
		}
		if (this.summary == null) {
			if (other.summary != null) {
				return false;
			}
		} else if (!this.summary.equals(other.summary)) {
			return false;
		}
		return true;
	}

	public List<Section> getChildSections() {
		return this.childSections;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public String getDescription() {
		return this.description;
	}

	public Document getDocument() {
		return this.document;
	}

	public Long getId() {
		return this.id;
	}

	public String getModifiedBy() {
		return this.modifiedBy;
	}

	public Date getModifiedDate() {
		return this.modifiedDate;
	}

	public String getName() {
		return this.name;
	}

	public Section getParentSection() {
		return this.parentSection;
	}

	public String getSummary() {
		return this.summary;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((this.childSections == null) ? 0 : this.childSections.hashCode());
		result = prime * result + ((this.createdBy == null) ? 0 : this.createdBy.hashCode());
		result = prime * result + ((this.createdDate == null) ? 0 : this.createdDate.hashCode());
		result = prime * result + ((this.description == null) ? 0 : this.description.hashCode());
		result = prime * result + ((this.document == null) ? 0 : this.document.hashCode());
		result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
		result = prime * result + ((this.modifiedBy == null) ? 0 : this.modifiedBy.hashCode());
		result = prime * result + ((this.modifiedDate == null) ? 0 : this.modifiedDate.hashCode());
		result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
		result = prime * result + ((this.parentSection == null) ? 0 : this.parentSection.hashCode());
		result = prime * result + ((this.summary == null) ? 0 : this.summary.hashCode());
		return result;
	}

	@PrePersist
	@PreUpdate
	@PreRemove
	public void onPrePersist() {
		System.out.println("prepersist");
	}

	public void setDescription(final String description) {
		this.description = description;
	}

	public void setDocument(final Document document) {
		this.document = document;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public void setParentSection(final Section parentSection) {
		this.parentSection = parentSection;
	}

	public void setSummary(final String summary) {
		this.summary = summary;
	}

	@Override
	public String toString() {
		return "Section [id=" + this.id + ", name=" + this.name + ", summary=" + this.summary + ", description="
				+ this.description + ", document=" + this.document + ", parentSection=" + this.parentSection
				+ ", childSections=" + this.childSections + ", createdDate=" + this.createdDate + ", modifiedDate="
				+ this.modifiedDate + ", createdBy=" + this.createdBy + ", modifiedBy=" + this.modifiedBy + "]";
	}
}
