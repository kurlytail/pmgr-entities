package com.bst.pmgr.entities.generic;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import com.bst.pmgr.entities.Tool;

@Entity
@DiscriminatorValue("Generic")
public class GenericTool extends Tool {

}
