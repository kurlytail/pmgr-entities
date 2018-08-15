package com.bst.pmgr.repositories;

import org.springframework.data.repository.CrudRepository;

import com.bst.pmgr.entities.GenericProject;

public interface ProjectRepository extends CrudRepository<GenericProject, Long> {
}
