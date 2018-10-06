package com.bst.pmgr.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import com.bst.pmgr.entities.audit.PmgrPersonAudit;
import com.bst.user.authentication.entities.Person;

@EntityListeners(PmgrPersonAudit.class)
@Entity
public class PmgrPerson {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@NotNull
	@Column(updatable = false)
	private Person person;

	@OneToMany(mappedBy = "createdBy")
	private List<Work> works;

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

	public List<Work> getWorks() {
		return works;
	}

}
