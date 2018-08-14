package com.bst.pmgr.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Document {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    public Long getId() {
    	return id;
    }
}
