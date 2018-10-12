package com.bst.pmgr.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;

import com.bst.utility.components.AuditListener;

@EntityListeners(AuditListener.class)
@Entity
@DiscriminatorValue("project")
public class Project extends Work {

}
