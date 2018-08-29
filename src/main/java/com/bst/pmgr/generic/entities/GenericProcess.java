package com.bst.pmgr.generic.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import com.bst.pmgr.entities.Process;

@Entity
@DiscriminatorValue("Generic")
public class GenericProcess extends Process {

}
