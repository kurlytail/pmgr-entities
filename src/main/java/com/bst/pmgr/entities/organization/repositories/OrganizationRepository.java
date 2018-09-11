package com.bst.pmgr.entities.organization.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.bst.pmgr.entities.organization.Organization;

@RepositoryRestResource
public interface OrganizationRepository extends CrudRepository<Organization, Long>{

}
