package com.bst.pmgr.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.bst.pmgr.entities.Project;

@RepositoryRestResource
public interface ProjectRepository extends CrudRepository<Project, Long> {
}
