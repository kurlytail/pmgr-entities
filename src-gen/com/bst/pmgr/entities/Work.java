package com.bst.pmgr.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * A representation of the model object '<em><b>Work</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "entities_Work")
public class Work extends Identifiable {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@OneToMany(cascade = { CascadeType.ALL })
	private List<Tool> tools = new ArrayList<Tool>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@OneToMany(cascade = { CascadeType.ALL })
	private List<Activity> activities = new ArrayList<Activity>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@OneToMany(cascade = { CascadeType.ALL })
	private List<Process> processes = new ArrayList<Process>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@OneToMany(cascade = { CascadeType.ALL })
	private List<Document> documents = new ArrayList<Document>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@OneToMany(cascade = { CascadeType.ALL })
	private List<ProcessGroup> processGroups = new ArrayList<ProcessGroup>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, optional = false)
	private PmgrPerson person = null;

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
			toolsValue.setWork(this);
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
			toolsValue.setWork(null);
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
	 * Sets the '{@link Work#getTools() <em>tools</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newTools
	 *            the new value of the '{@link Work#getTools() tools}' feature.
	 * @generated
	 */
	public void setTools(List<Tool> newTools) {
		clearTools();
		for (Tool value : newTools) {
			addToTools(value);
		}
	}

	/**
	 * Returns the value of '<em><b>activities</b></em>' feature. Note: the returned
	 * collection is Unmodifiable use the
	 * {#addToActivities(com.bst.pmgr.entities.Activity value)} and
	 * {@link #removeFromActivities(Activity value)} methods to modify this feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>activities</b></em>' feature
	 * @generated
	 */
	public List<Activity> getActivities() {
		return Collections.unmodifiableList(activities);
	}

	/**
	 * Adds to the <em>activities</em> feature.
	 *
	 * @param activitiesValue
	 *            the value to add
	 * @return true if the value is added to the collection (it was not yet present
	 *         in the collection), false otherwise
	 * @generated
	 */
	public boolean addToActivities(Activity activitiesValue) {
		if (!activities.contains(activitiesValue)) {
			boolean result = activities.add(activitiesValue);
			activitiesValue.setWork(this);
			return result;
		}
		return false;
	}

	/**
	 * Removes from the <em>activities</em> feature.
	 *
	 * @param activitiesValue
	 *            the value to remove
	 * @return true if the value is removed from the collection (it existed in the
	 *         collection before removing), false otherwise
	 *
	 * @generated
	 */
	public boolean removeFromActivities(Activity activitiesValue) {
		if (activities.contains(activitiesValue)) {
			boolean result = activities.remove(activitiesValue);
			activitiesValue.setWork(null);
			return result;
		}
		return false;
	}

	/**
	 * Clears the <em>activities</em> feature.
	 * 
	 * @generated
	 */
	public void clearActivities() {
		while (!activities.isEmpty()) {
			removeFromActivities(activities.iterator().next());
		}
	}

	/**
	 * Sets the '{@link Work#getActivities() <em>activities</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newActivities
	 *            the new value of the '{@link Work#getActivities() activities}'
	 *            feature.
	 * @generated
	 */
	public void setActivities(List<Activity> newActivities) {
		clearActivities();
		for (Activity value : newActivities) {
			addToActivities(value);
		}
	}

	/**
	 * Returns the value of '<em><b>processes</b></em>' feature. Note: the returned
	 * collection is Unmodifiable use the
	 * {#addToProcesses(com.bst.pmgr.entities.Process value)} and
	 * {@link #removeFromProcesses(Process value)} methods to modify this feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>processes</b></em>' feature
	 * @generated
	 */
	public List<Process> getProcesses() {
		return Collections.unmodifiableList(processes);
	}

	/**
	 * Adds to the <em>processes</em> feature.
	 *
	 * @param processesValue
	 *            the value to add
	 * @return true if the value is added to the collection (it was not yet present
	 *         in the collection), false otherwise
	 * @generated
	 */
	public boolean addToProcesses(Process processesValue) {
		if (!processes.contains(processesValue)) {
			boolean result = processes.add(processesValue);
			processesValue.setWork(this);
			return result;
		}
		return false;
	}

	/**
	 * Removes from the <em>processes</em> feature.
	 *
	 * @param processesValue
	 *            the value to remove
	 * @return true if the value is removed from the collection (it existed in the
	 *         collection before removing), false otherwise
	 *
	 * @generated
	 */
	public boolean removeFromProcesses(Process processesValue) {
		if (processes.contains(processesValue)) {
			boolean result = processes.remove(processesValue);
			processesValue.setWork(null);
			return result;
		}
		return false;
	}

	/**
	 * Clears the <em>processes</em> feature.
	 * 
	 * @generated
	 */
	public void clearProcesses() {
		while (!processes.isEmpty()) {
			removeFromProcesses(processes.iterator().next());
		}
	}

	/**
	 * Sets the '{@link Work#getProcesses() <em>processes</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newProcesses
	 *            the new value of the '{@link Work#getProcesses() processes}'
	 *            feature.
	 * @generated
	 */
	public void setProcesses(List<Process> newProcesses) {
		clearProcesses();
		for (Process value : newProcesses) {
			addToProcesses(value);
		}
	}

	/**
	 * Returns the value of '<em><b>documents</b></em>' feature. Note: the returned
	 * collection is Unmodifiable use the
	 * {#addToDocuments(com.bst.pmgr.entities.Document value)} and
	 * {@link #removeFromDocuments(Document value)} methods to modify this feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>documents</b></em>' feature
	 * @generated
	 */
	public List<Document> getDocuments() {
		return Collections.unmodifiableList(documents);
	}

	/**
	 * Adds to the <em>documents</em> feature.
	 *
	 * @param documentsValue
	 *            the value to add
	 * @return true if the value is added to the collection (it was not yet present
	 *         in the collection), false otherwise
	 * @generated
	 */
	public boolean addToDocuments(Document documentsValue) {
		if (!documents.contains(documentsValue)) {
			boolean result = documents.add(documentsValue);
			documentsValue.setWork(this);
			return result;
		}
		return false;
	}

	/**
	 * Removes from the <em>documents</em> feature.
	 *
	 * @param documentsValue
	 *            the value to remove
	 * @return true if the value is removed from the collection (it existed in the
	 *         collection before removing), false otherwise
	 *
	 * @generated
	 */
	public boolean removeFromDocuments(Document documentsValue) {
		if (documents.contains(documentsValue)) {
			boolean result = documents.remove(documentsValue);
			documentsValue.setWork(null);
			return result;
		}
		return false;
	}

	/**
	 * Clears the <em>documents</em> feature.
	 * 
	 * @generated
	 */
	public void clearDocuments() {
		while (!documents.isEmpty()) {
			removeFromDocuments(documents.iterator().next());
		}
	}

	/**
	 * Sets the '{@link Work#getDocuments() <em>documents</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newDocuments
	 *            the new value of the '{@link Work#getDocuments() documents}'
	 *            feature.
	 * @generated
	 */
	public void setDocuments(List<Document> newDocuments) {
		clearDocuments();
		for (Document value : newDocuments) {
			addToDocuments(value);
		}
	}

	/**
	 * Returns the value of '<em><b>processGroups</b></em>' feature. Note: the
	 * returned collection is Unmodifiable use the
	 * {#addToProcessGroups(com.bst.pmgr.entities.ProcessGroup value)} and
	 * {@link #removeFromProcessGroups(ProcessGroup value)} methods to modify this
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>processGroups</b></em>' feature
	 * @generated
	 */
	public List<ProcessGroup> getProcessGroups() {
		return Collections.unmodifiableList(processGroups);
	}

	/**
	 * Adds to the <em>processGroups</em> feature.
	 *
	 * @param processGroupsValue
	 *            the value to add
	 * @return true if the value is added to the collection (it was not yet present
	 *         in the collection), false otherwise
	 * @generated
	 */
	public boolean addToProcessGroups(ProcessGroup processGroupsValue) {
		if (!processGroups.contains(processGroupsValue)) {
			boolean result = processGroups.add(processGroupsValue);
			processGroupsValue.setWork(this);
			return result;
		}
		return false;
	}

	/**
	 * Removes from the <em>processGroups</em> feature.
	 *
	 * @param processGroupsValue
	 *            the value to remove
	 * @return true if the value is removed from the collection (it existed in the
	 *         collection before removing), false otherwise
	 *
	 * @generated
	 */
	public boolean removeFromProcessGroups(ProcessGroup processGroupsValue) {
		if (processGroups.contains(processGroupsValue)) {
			boolean result = processGroups.remove(processGroupsValue);
			processGroupsValue.setWork(null);
			return result;
		}
		return false;
	}

	/**
	 * Clears the <em>processGroups</em> feature.
	 * 
	 * @generated
	 */
	public void clearProcessGroups() {
		while (!processGroups.isEmpty()) {
			removeFromProcessGroups(processGroups.iterator().next());
		}
	}

	/**
	 * Sets the '{@link Work#getProcessGroups() <em>processGroups</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newProcessGroups
	 *            the new value of the '{@link Work#getProcessGroups()
	 *            processGroups}' feature.
	 * @generated
	 */
	public void setProcessGroups(List<ProcessGroup> newProcessGroups) {
		clearProcessGroups();
		for (ProcessGroup value : newProcessGroups) {
			addToProcessGroups(value);
		}
	}

	/**
	 * Returns the value of '<em><b>person</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>person</b></em>' feature
	 * @generated
	 */
	public PmgrPerson getPerson() {
		return person;
	}

	/**
	 * Sets the '{@link Work#getPerson() <em>person</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newPerson
	 *            the new value of the '{@link Work#getPerson() person}' feature.
	 * @generated
	 */
	public void setPerson(PmgrPerson newPerson) {
		person = newPerson;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "Work " + "{extends: " + super.toString() + "} ";
	}
}
