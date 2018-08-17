package com.bst.pmgr.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Document {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
	private String name;
	private String metaName;
	
	@ManyToOne
    @JoinColumn(name = "fk_project")
	private Project project;

}
