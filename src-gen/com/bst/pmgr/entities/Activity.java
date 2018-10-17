package com.bst.pmgr.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * A representation of the model object '<em><b>Activity</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "entities_Activity")
public class Activity extends Identifiable {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@OneToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
	@JoinTable()
	private List<Tool> tools = new ArrayList<Tool>();

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
	 * Returns the value of '<em><b>tools</b></em>' feature. Note: the returned
	 * collection is Unmodifiable use the {#addToTools(com.bst.pmgr.entities.Tool
	 * value)} and {@link #removeFromTools(Tool value)} methods to modify this
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>tools</b></em>' feature
	 * @generated
	 */
	public List<Tool> getTools() {
		return Collections.unmodifiableList(tools);
	}

	/**
	 * Adds to the <em>tools</em> feature.
	 *
	 * @param toolsValue
	 *            the value to add
	 * @return true if the value is added to the collection (it was not yet present
	 *         in the collection), false otherwise
	 * @generated
	 */
	public boolean addToTools(Tool toolsValue) {
		if (!tools.contains(toolsValue)) {
			boolean result = tools.add(toolsValue);
			toolsValue.setActivity(this);
			return result;
		}
		return false;
	}

	/**
	 * Removes from the <em>tools</em> feature.
	 *
	 * @param toolsValue
	 *            the value to remove
	 * @return true if the value is removed from the collection (it existed in the
	 *         collection before removing), false otherwise
	 *
	 * @generated
	 */
	public boolean removeFromTools(Tool toolsValue) {
		if (tools.contains(toolsValue)) {
			boolean result = tools.remove(toolsValue);
			toolsValue.setActivity(null);
			return result;
		}
		return false;
	}

	/**
	 * Clears the <em>tools</em> feature.
	 * 
	 * @generated
	 */
	public void clearTools() {
		while (!tools.isEmpty()) {
			removeFromTools(tools.iterator().next());
		}
	}

	/**
	 * Sets the '{@link Activity#getTools() <em>tools</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newTools
	 *            the new value of the '{@link Activity#getTools() tools}' feature.
	 * @generated
	 */
	public void setTools(List<Tool> newTools) {
		clearTools();
		for (Tool value : newTools) {
			addToTools(value);
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
	 * Sets the '{@link Activity#getWork() <em>work</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newWork
	 *            the new value of the '{@link Activity#getWork() work}' feature.
	 * @generated
	 */
	public void setWork(Work newWork) {
		if (work != newWork) {
			if (work != null) {
				work.removeFromActivities(this);
			}
			work = newWork;
			if (work != null) {
				work.addToActivities(this);
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
	 * Sets the '{@link Activity#getMetaName() <em>metaName</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newMetaName
	 *            the new value of the '{@link Activity#getMetaName() metaName}'
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
		return "Activity " + " [metaName: " + getMetaName() + "]" + "{extends: " + super.toString() + "} ";
	}
}
