package com.bst.pmgr.entities.generic;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import com.bst.pmgr.entities.ProcessGroup;

@Entity
@DiscriminatorValue("Generic")
public class GenericProcessGroup extends ProcessGroup {

}
