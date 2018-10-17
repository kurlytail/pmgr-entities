package com.bst.pmgr.entities;

import javax.persistence.Entity;

/**
 * A representation of the model object '<em><b>Auditable</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "entities_Auditable")
public class Auditable extends Identifiable {

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "Auditable " + "{extends: " + super.toString() + "} ";
	}
}
