package com.bst.pmgr.entities.organization;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
}
