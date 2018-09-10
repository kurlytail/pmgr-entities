package com.bst.pmgr.entities.repositories;

import org.springframework.data.repository.CrudRepository;

import com.bst.pmgr.entities.Project;
import com.google.common.base.Optional;

public interface ProjectRepository extends CrudRepository<Project, Long> {
	Optional<Project> findByName(final String name);
}
