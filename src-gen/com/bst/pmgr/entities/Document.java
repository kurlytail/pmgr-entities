package com.bst.pmgr.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * A representation of the model object '<em><b>Document</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "entities_Document")
public class Document extends Identifiable {

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
	@OneToMany(cascade = { CascadeType.ALL })
	private List<Section> sections = new ArrayList<Section>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
	private List<Section> topLevelSections = new ArrayList<Section>();

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
	 * Sets the '{@link Document#getWork() <em>work</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newWork
	 *            the new value of the '{@link Document#getWork() work}' feature.
	 * @generated
	 */
	public void setWork(Work newWork) {
		if (work != newWork) {
			if (work != null) {
				work.removeFromDocuments(this);
			}
			work = newWork;
			if (work != null) {
				work.addToDocuments(this);
			}
		}
	}

	/**
	 * Returns the value of '<em><b>sections</b></em>' feature. Note: the returned
	 * collection is Unmodifiable use the
	 * {#addToSections(com.bst.pmgr.entities.Section value)} and
	 * {@link #removeFromSections(Section value)} methods to modify this feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>sections</b></em>' feature
	 * @generated
	 */
	public List<Section> getSections() {
		return Collections.unmodifiableList(sections);
	}

	/**
	 * Adds to the <em>sections</em> feature.
	 *
	 * @param sectionsValue
	 *            the value to add
	 * @return true if the value is added to the collection (it was not yet present
	 *         in the collection), false otherwise
	 * @generated
	 */
	public boolean addToSections(Section sectionsValue) {
		if (!sections.contains(sectionsValue)) {
			boolean result = sections.add(sectionsValue);
			sectionsValue.setDocument(this);
			return result;
		}
		return false;
	}

	/**
	 * Removes from the <em>sections</em> feature.
	 *
	 * @param sectionsValue
	 *            the value to remove
	 * @return true if the value is removed from the collection (it existed in the
	 *         collection before removing), false otherwise
	 *
	 * @generated NOT
	 */
	public boolean removeFromSections(Section sectionsValue) {
		if (sections.contains(sectionsValue)) {
			boolean result = sections.remove(sectionsValue) && removeFromTopLevelSections(sectionsValue);
			if (result) {
				sectionsValue.setDocument(null);
			}
			return result;
		}
		return false;
	}

	/**
	 * Clears the <em>sections</em> feature.
	 * 
	 * @generated
	 */
	public void clearSections() {
		while (!sections.isEmpty()) {
			removeFromSections(sections.iterator().next());
		}
	}

	/**
	 * Sets the '{@link Document#getSections() <em>sections</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newSections
	 *            the new value of the '{@link Document#getSections() sections}'
	 *            feature.
	 * @generated
	 */
	public void setSections(List<Section> newSections) {
		clearSections();
		for (Section value : newSections) {
			addToSections(value);
		}
	}

	/**
	 * Returns the value of '<em><b>topLevelSections</b></em>' feature. Note: the
	 * returned collection is Unmodifiable use the
	 * {#addToTopLevelSections(com.bst.pmgr.entities.Section value)} and
	 * {@link #removeFromTopLevelSections(Section value)} methods to modify this
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>topLevelSections</b></em>' feature
	 * @generated
	 */
	public List<Section> getTopLevelSections() {
		return Collections.unmodifiableList(topLevelSections);
	}

	/**
	 * Adds to the <em>topLevelSections</em> feature.
	 *
	 * @param topLevelSectionsValue
	 *            the value to add
	 * @return true if the value is added to the collection (it was not yet present
	 *         in the collection), false otherwise
	 * @generated NOT
	 */
	public boolean addToTopLevelSections(Section topLevelSectionsValue) {
		if (!topLevelSections.contains(topLevelSectionsValue)) {
			boolean result = addToSections(topLevelSectionsValue);
			result = result && topLevelSections.add(topLevelSectionsValue);
			return result;
		}
		return false;
	}

	/**
	 * Removes from the <em>topLevelSections</em> feature.
	 *
	 * @param topLevelSectionsValue
	 *            the value to remove
	 * @return true if the value is removed from the collection (it existed in the
	 *         collection before removing), false otherwise
	 *
	 * @generated
	 */
	public boolean removeFromTopLevelSections(Section topLevelSectionsValue) {
		if (topLevelSections.contains(topLevelSectionsValue)) {
			boolean result = topLevelSections.remove(topLevelSectionsValue);
			return result;
		}
		return false;
	}

	/**
	 * Clears the <em>topLevelSections</em> feature.
	 * 
	 * @generated
	 */
	public void clearTopLevelSections() {
		while (!topLevelSections.isEmpty()) {
			removeFromTopLevelSections(topLevelSections.iterator().next());
		}
	}

	/**
	 * Sets the '{@link Document#getTopLevelSections() <em>topLevelSections</em>}'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newTopLevelSections
	 *            the new value of the '{@link Document#getTopLevelSections()
	 *            topLevelSections}' feature.
	 * @generated
	 */
	public void setTopLevelSections(List<Section> newTopLevelSections) {
		clearTopLevelSections();
		for (Section value : newTopLevelSections) {
			addToTopLevelSections(value);
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
	 * Sets the '{@link Document#getMetaName() <em>metaName</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newMetaName
	 *            the new value of the '{@link Document#getMetaName() metaName}'
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
		return "Document " + " [metaName: " + getMetaName() + "]" + "{extends: " + super.toString() + "} ";
	}
}
