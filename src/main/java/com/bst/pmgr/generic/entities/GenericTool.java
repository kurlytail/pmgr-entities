package com.bst.pmgr.generic.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import com.bst.pmgr.entities.Tool;

@Entity
@DiscriminatorValue("Generic")
public class GenericTool extends Tool {

}
