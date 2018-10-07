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

import com.bst.pmgr.entities.audit.PmgrPersonAudit;
import com.bst.user.authentication.entities.Person;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@EntityListeners(PmgrPersonAudit.class)
@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class PmgrPerson {
	@Id
	private Long id;

	@NotNull
	@Column(updatable = false)
	private Person person;

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "createdBy")
	private List<Work> works = new ArrayList<>();

	public List<Work> getWorks() {
		return works;
	}

	public Long getId() {
		return id;
	}

	public Person getPerson() {
		return person;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public void addWork(Work work) {
		works.add(work);
		work.setCreatedBy(this);
	}
	
	public void removeWork(Work work) {
		works.remove(work);
	}
	
	@Override
	public String toString() {
		return "PmgrPerson [id=" + id + ", person=" + person + ", works=" + works + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((person == null) ? 0 : person.hashCode());
		result = prime * result + ((works == null) ? 0 : works.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PmgrPerson other = (PmgrPerson) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (person == null) {
			if (other.person != null)
				return false;
		} else if (!person.equals(other.person))
			return false;
		if (works == null) {
			if (other.works != null)
				return false;
		} else if (!works.equals(other.works))
			return false;
		return true;
	}

}
