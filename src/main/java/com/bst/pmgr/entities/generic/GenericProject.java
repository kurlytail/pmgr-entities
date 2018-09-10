package com.bst.pmgr.entities.generic;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import com.bst.pmgr.entities.Project;

@Entity
@DiscriminatorValue("generic-project")
public class GenericProject extends Project {

}
