package com.bst.pmgr.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.bst.pmgr.entities.Process;

@RepositoryRestResource
public interface ProcessRepository extends CrudRepository<Process, Long> {
}
