package com.bst.pmgr.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.bst.pmgr.entities.Manager;

@RepositoryRestResource
public interface ManagerRepository extends CrudRepository<Manager, Long> {
}
