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

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@EntityListeners(DocumentAudit.class)
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "documentType")
@ToString
@Getter
@EqualsAndHashCode
public class Document {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Setter
	private String name;

	@ManyToOne
	@Setter
	private Work work;

	@OneToMany(mappedBy = "document")
	private List<Section> sections;
}
