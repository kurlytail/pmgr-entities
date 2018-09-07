package com.bst.pmgr.entities.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.bst.pmgr.entities.Activity;

@RepositoryRestResource
public interface ActivityRepository extends CrudRepository<Activity, Long> {
}
