package com.bst.pmgr.entities.generic;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import com.bst.pmgr.entities.Activity;

@Entity
@DiscriminatorValue("Generic")
public class GenericActivity extends Activity {

}
