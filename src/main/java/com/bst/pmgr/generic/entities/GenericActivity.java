package com.bst.pmgr.generic.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import com.bst.pmgr.entities.Activity;

@Entity
@DiscriminatorValue("Generic")
public class GenericActivity extends Activity {

}
