package com.bst.pmgr.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * A representation of the model object '<em><b>Section</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "entities_Section")
public class Section extends Identifiable {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, optional = false)
	@JoinColumns({ @JoinColumn() })
	private Document document = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
	@JoinColumns({ @JoinColumn() })
	private Section parentSection = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@OneToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
	@JoinTable()
	private List<Section> childSections = new ArrayList<Section>();

	/**
	 * Returns the value of '<em><b>document</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>document</b></em>' feature
	 * @generated
	 */
	public Document getDocument() {
		return document;
	}

	/**
	 * Sets the '{@link Section#getDocument() <em>document</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newDocument
	 *            the new value of the '{@link Section#getDocument() document}'
	 *            feature.
	 * @generated NOT
	 */
	public void setDocument(Document newDocument) {
		if (document != newDocument) {
			if (document != null) {
				document.removeFromSections(this);
			}
			document = newDocument;
			if (document != null) {
				if (parentSection == null) {
					document.addToTopLevelSections(this);
				} else {
					document.addToSections(this);
				}
			}

			for (Section childSection : this.getChildSections()) {
				childSection.setDocument(newDocument);
			}
		}
	}

	/**
	 * Returns the value of '<em><b>parentSection</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>parentSection</b></em>' feature
	 * @generated
	 */
	public Section getParentSection() {
		return parentSection;
	}

	/**
	 * Sets the '{@link Section#getParentSection() <em>parentSection</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newParentSection
	 *            the new value of the '{@link Section#getParentSection()
	 *            parentSection}' feature.
	 * @generated NOT
	 */
	public void setParentSection(Section newParentSection) {
		if (parentSection != newParentSection) {
			if (parentSection != null) {
				parentSection.removeFromChildSections(this);
			}
			parentSection = newParentSection;
			if (parentSection != null) {
				parentSection.addToChildSections(this);
			}
		}
		setDocument(newParentSection.getDocument());
	}

	/**
	 * Returns the value of '<em><b>childSections</b></em>' feature. Note: the
	 * returned collection is Unmodifiable use the
	 * {#addToChildSections(com.bst.pmgr.entities.Section value)} and
	 * {@link #removeFromChildSections(Section value)} methods to modify this
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>childSections</b></em>' feature
	 * @generated
	 */
	public List<Section> getChildSections() {
		return Collections.unmodifiableList(childSections);
	}

	/**
	 * Adds to the <em>childSections</em> feature.
	 *
	 * @param childSectionsValue
	 *            the value to add
	 * @return true if the value is added to the collection (it was not yet present
	 *         in the collection), false otherwise
	 * @generated
	 */
	public boolean addToChildSections(Section childSectionsValue) {
		if (!childSections.contains(childSectionsValue)) {
			boolean result = childSections.add(childSectionsValue);
			childSectionsValue.setParentSection(this);
			return result;
		}
		return false;
	}

	/**
	 * Removes from the <em>childSections</em> feature.
	 *
	 * @param childSectionsValue
	 *            the value to remove
	 * @return true if the value is removed from the collection (it existed in the
	 *         collection before removing), false otherwise
	 *
	 * @generated
	 */
	public boolean removeFromChildSections(Section childSectionsValue) {
		if (childSections.contains(childSectionsValue)) {
			boolean result = childSections.remove(childSectionsValue);
			childSectionsValue.setParentSection(null);
			return result;
		}
		return false;
	}

	/**
	 * Clears the <em>childSections</em> feature.
	 * 
	 * @generated
	 */
	public void clearChildSections() {
		while (!childSections.isEmpty()) {
			removeFromChildSections(childSections.iterator().next());
		}
	}

	/**
	 * Sets the '{@link Section#getChildSections() <em>childSections</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newChildSections
	 *            the new value of the '{@link Section#getChildSections()
	 *            childSections}' feature.
	 * @generated
	 */
	public void setChildSections(List<Section> newChildSections) {
		clearChildSections();
		for (Section value : newChildSections) {
			addToChildSections(value);
		}
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "Section " + "{extends: " + super.toString() + "} ";
	}
}
