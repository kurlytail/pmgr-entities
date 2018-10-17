package com.bst.pmgr.entities;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

/**
 * A representation of the model object '<em><b>Tool</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "entities_Tool")
public class Tool extends Identifiable {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, optional = false)
	@JoinColumns({ @JoinColumn() })
	private Activity activity = null;

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
	 * Returns the value of '<em><b>activity</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>activity</b></em>' feature
	 * @generated
	 */
	public Activity getActivity() {
		return activity;
	}

	/**
	 * Sets the '{@link Tool#getActivity() <em>activity</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newActivity
	 *            the new value of the '{@link Tool#getActivity() activity}'
	 *            feature.
	 * @generated
	 */
	public void setActivity(Activity newActivity) {
		if (activity != newActivity) {
			if (activity != null) {
				activity.removeFromTools(this);
			}
			activity = newActivity;
			if (activity != null) {
				activity.addToTools(this);
			}
		}
	}

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
	 * Sets the '{@link Tool#getWork() <em>work</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newWork
	 *            the new value of the '{@link Tool#getWork() work}' feature.
	 * @generated
	 */
	public void setWork(Work newWork) {
		if (work != newWork) {
			if (work != null) {
				work.removeFromTools(this);
			}
			work = newWork;
			if (work != null) {
				work.addToTools(this);
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
	 * Sets the '{@link Tool#getMetaName() <em>metaName</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newMetaName
	 *            the new value of the '{@link Tool#getMetaName() metaName}'
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
		return "Tool " + " [metaName: " + getMetaName() + "]" + "{extends: " + super.toString() + "} ";
	}
}
