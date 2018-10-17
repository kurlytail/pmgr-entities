package com.bst.pmgr.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import com.bst.user.authentication.entities.Person;

/**
 * A representation of the model object '<em><b>PmgrPerson</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "entities_PmgrPerson")
public class PmgrPerson extends Identifiable {

	@NotNull
	@Column(updatable = false)
	private Person person = null;

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@OneToMany(cascade = { CascadeType.ALL })
	private List<Work> works = new ArrayList<Work>();

	/**
	 * Returns the value of '<em><b>works</b></em>' feature. Note: the returned
	 * collection is Unmodifiable use the {#addToWorks(com.bst.pmgr.entities.Work
	 * value)} and {@link #removeFromWorks(Work value)} methods to modify this
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>works</b></em>' feature
	 * @generated
	 */
	public List<Work> getWorks() {
		return Collections.unmodifiableList(works);
	}

	/**
	 * Adds to the <em>works</em> feature.
	 *
	 * @param worksValue
	 *            the value to add
	 * @return true if the value is added to the collection (it was not yet present
	 *         in the collection), false otherwise
	 * @generated
	 */
	public boolean addToWorks(Work worksValue) {
		if (!works.contains(worksValue)) {
			boolean result = works.add(worksValue);
			return result;
		}
		return false;
	}

	/**
	 * Removes from the <em>works</em> feature.
	 *
	 * @param worksValue
	 *            the value to remove
	 * @return true if the value is removed from the collection (it existed in the
	 *         collection before removing), false otherwise
	 *
	 * @generated
	 */
	public boolean removeFromWorks(Work worksValue) {
		if (works.contains(worksValue)) {
			boolean result = works.remove(worksValue);
			return result;
		}
		return false;
	}

	/**
	 * Clears the <em>works</em> feature.
	 * 
	 * @generated
	 */
	public void clearWorks() {
		while (!works.isEmpty()) {
			removeFromWorks(works.iterator().next());
		}
	}

	/**
	 * Sets the '{@link PmgrPerson#getWorks() <em>works</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newWorks
	 *            the new value of the '{@link PmgrPerson#getWorks() works}'
	 *            feature.
	 * @generated
	 */
	public void setWorks(List<Work> newWorks) {
		clearWorks();
		for (Work value : newWorks) {
			addToWorks(value);
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
		return "PmgrPerson " + "{extends: " + super.toString() + "} ";
	}
}
