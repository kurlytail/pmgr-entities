package com.bst.pmgr.repositories;

import org.springframework.data.repository.CrudRepository;

import com.bst.pmgr.entities.GenericManager;

public interface ManagerRepository extends CrudRepository<GenericManager, Long> {
}
