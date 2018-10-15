package com.bst.pmgr.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("project")
public class Project extends Work {

}
