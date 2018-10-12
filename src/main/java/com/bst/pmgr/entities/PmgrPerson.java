package com.bst.pmgr.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import com.bst.user.authentication.entities.Person;
import com.bst.utility.components.AuditListener;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@EntityListeners(AuditListener.class)
@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class PmgrPerson {
	@Id
	private Long id;

	@NotNull
	@Column(updatable = false)
	private Person person;

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "createdBy")
	private final List<Work> works = new ArrayList<>();

	public void addWork(final Work work) {
		this.works.add(work);
		work.setCreatedBy(this);
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
		final PmgrPerson other = (PmgrPerson) obj;
		if (this.id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!this.id.equals(other.id)) {
			return false;
		}
		if (this.person == null) {
			if (other.person != null) {
				return false;
			}
		} else if (!this.person.equals(other.person)) {
			return false;
		}
		if (this.works == null) {
			if (other.works != null) {
				return false;
			}
		} else if (!this.works.equals(other.works)) {
			return false;
		}
		return true;
	}

	public Long getId() {
		return this.id;
	}

	public Person getPerson() {
		return this.person;
	}

	public List<Work> getWorks() {
		return this.works;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
		result = prime * result + ((this.person == null) ? 0 : this.person.hashCode());
		result = prime * result + ((this.works == null) ? 0 : this.works.hashCode());
		return result;
	}

	public void removeWork(final Work work) {
		this.works.remove(work);
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public void setPerson(final Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "PmgrPerson [id=" + this.id + ", person=" + this.person + "]";
	}

}
