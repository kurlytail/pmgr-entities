package com.bst.pmgr.repositories;

import org.springframework.data.repository.CrudRepository;

import com.bst.pmgr.entities.Activity;

public interface ActivityRepository extends CrudRepository<Activity, Long> {
}
