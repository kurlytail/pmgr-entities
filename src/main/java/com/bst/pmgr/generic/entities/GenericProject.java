package com.bst.pmgr.generic.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import com.bst.pmgr.entities.Project;

@Entity
@DiscriminatorValue("Generic")
public class GenericProject extends Project {

}
