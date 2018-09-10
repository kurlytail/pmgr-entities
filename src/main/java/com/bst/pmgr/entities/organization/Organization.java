package com.bst.pmgr.entities.organization;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Organization {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

	public Long getId() {
		return id;
	}
	
	@OneToMany(mappedBy = "organization")
	private List<Division> divisions;

	public List<Division> getDivisions() {
		return divisions;
	}

	public void setDivisions(List<Division> divisions) {
		this.divisions = divisions;
	}
	
	@OneToMany(mappedBy = "organization")
	private List<FunctionalStrength> functionalStrengths;
	
	
	@OneToMany(mappedBy = "organization")
	private List<FunctionalStrength> legalJurisdictions;
	
	
	@OneToMany(mappedBy = "organization")
	private List<FunctionalStrength> physicalLocations;

	public List<FunctionalStrength> getFunctionalStrengths() {
		return functionalStrengths;
	}

	public void setFunctionalStrengths(List<FunctionalStrength> functionalStrengths) {
		this.functionalStrengths = functionalStrengths;
	}

	public List<FunctionalStrength> getLegalJurisdictions() {
		return legalJurisdictions;
	}

	public void setLegalJurisdictions(List<FunctionalStrength> legalJurisdictions) {
		this.legalJurisdictions = legalJurisdictions;
	}

	public List<FunctionalStrength> getPhysicalLocations() {
		return physicalLocations;
	}

	public void setPhysicalLocations(List<FunctionalStrength> physicalLocations) {
		this.physicalLocations = physicalLocations;
	}
	
	
}
