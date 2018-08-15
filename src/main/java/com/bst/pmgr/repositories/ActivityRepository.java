package com.bst.pmgr.repositories;

import org.springframework.data.repository.CrudRepository;

import com.bst.pmgr.entities.GenericActivity;

public interface ActivityRepository extends CrudRepository<GenericActivity, Long> {
}
