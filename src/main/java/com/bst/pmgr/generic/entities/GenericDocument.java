package com.bst.pmgr.generic.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import com.bst.pmgr.entities.Document;

@Entity
@DiscriminatorValue("Generic")
public class GenericDocument extends Document {

}
