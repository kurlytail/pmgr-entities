package com.bst.pmgr.entities.generic;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import com.bst.pmgr.entities.Manager;

@Entity
@DiscriminatorValue("Generic")
public class GenericManager extends Manager {

}
