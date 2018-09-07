package com.bst.pmgr.entities.generic;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import com.bst.pmgr.entities.Work;

@Entity
@DiscriminatorValue("Generic")
public class GenericProject extends Work {

}
