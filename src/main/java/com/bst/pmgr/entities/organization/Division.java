package com.bst.pmgr.entities.organization;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.bst.pmgr.entities.documents.EnterpriseEnvironmentalFactors;

@Entity
public class Division {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@ManyToOne
    private EnterpriseEnvironmentalFactors enterpriseEnvironmentalFactors;

	public EnterpriseEnvironmentalFactors getEnterpriseEnvironmentalFactors() {
		return enterpriseEnvironmentalFactors;
	}

	public void setEnterpriseEnvironmentalFactors(EnterpriseEnvironmentalFactors enterpriseEnvironmentalFactors) {
		this.enterpriseEnvironmentalFactors = enterpriseEnvironmentalFactors;
	}
	
	public List<PhysicalLocation> getPhysicalLocations() {
		return physicalLocations;
	}

	public void setPhysicalLocations(List<PhysicalLocation> physicalLocations) {
		this.physicalLocations = physicalLocations;
	}

	public List<FunctionalStrength> getFunctionalStrengths() {
		return functionalStrengths;
	}

	public void setFunctionalStrengths(List<FunctionalStrength> functionalStrengths) {
		this.functionalStrengths = functionalStrengths;
	}

	public List<LegalJurisdiction> getLegalJurisdictions() {
		return legalJurisdictions;
	}

	public void setLegalJurisdictions(List<LegalJurisdiction> legalJurisdictions) {
		this.legalJurisdictions = legalJurisdictions;
	}

	@ManyToMany(mappedBy = "divisions")
	private List<PhysicalLocation> physicalLocations;
	
	@ManyToMany(mappedBy = "divisions")
	private List<FunctionalStrength> functionalStrengths;
	
	@ManyToMany(mappedBy = "divisions")
	private List<LegalJurisdiction> legalJurisdictions;
	
	@ManyToOne
    private Organization organization;

	public Organization getOrganization() {
		return organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}
}
