package com.bst.pmgr.entities.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.bst.pmgr.entities.Work;
import com.google.common.base.Optional;

@RepositoryRestResource
public interface WorkRepository extends CrudRepository<Work, Long>, WorkRepositoryStrategy {
	Optional<Work> findByName(final String name);
}
