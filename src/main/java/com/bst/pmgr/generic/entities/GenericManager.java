package com.bst.pmgr.generic.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import com.bst.pmgr.entities.Manager;

@Entity
@DiscriminatorValue("Generic")
public class GenericManager extends Manager {

}
