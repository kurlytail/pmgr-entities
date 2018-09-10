package com.bst.pmgr.entities.organization.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.bst.pmgr.entities.organization.LegalJurisdiction;

@RepositoryRestResource
public interface LegalJurisdictionRepository extends CrudRepository<LegalJurisdiction, Long>{

}