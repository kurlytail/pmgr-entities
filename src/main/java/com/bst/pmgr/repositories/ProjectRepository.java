package com.bst.pmgr.repositories;

import org.springframework.data.repository.CrudRepository;

import com.bst.pmgr.entities.Project;

public interface ProjectRepository extends CrudRepository<Project, Long> {
}
