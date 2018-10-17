package com.bst.pmgr.entities;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

/**
 * A representation of the model object '<em><b>Process</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "entities_Process")
public class Process extends Identifiable {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, optional = false)
	@JoinColumns({ @JoinColumn() })
	private Work work = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic(optional = false)
	private String metaName = null;

	/**
	 * Returns the value of '<em><b>work</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>work</b></em>' feature
	 * @generated
	 */
	public Work getWork() {
		return work;
	}

	/**
	 * Sets the '{@link Process#getWork() <em>work</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newWork
	 *            the new value of the '{@link Process#getWork() work}' feature.
	 * @generated
	 */
	public void setWork(Work newWork) {
		if (work != newWork) {
			if (work != null) {
				work.removeFromProcesses(this);
			}
			work = newWork;
			if (work != null) {
				work.addToProcesses(this);
			}
		}
	}

	/**
	 * Returns the value of '<em><b>metaName</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>metaName</b></em>' feature
	 * @generated
	 */
	public String getMetaName() {
		return metaName;
	}

	/**
	 * Sets the '{@link Process#getMetaName() <em>metaName</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newMetaName
	 *            the new value of the '{@link Process#getMetaName() metaName}'
	 *            feature.
	 * @generated
	 */
	public void setMetaName(String newMetaName) {
		metaName = newMetaName;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "Process " + " [metaName: " + getMetaName() + "]" + "{extends: " + super.toString() + "} ";
	}
}
