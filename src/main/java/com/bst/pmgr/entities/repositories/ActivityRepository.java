package com.bst.pmgr.entities.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

import com.bst.pmgr.entities.Activity;

@RepositoryRestResource
@Transactional(readOnly = true)
public interface ActivityRepository extends CrudRepository<Activity, Long> {
}
