package com.bst.pmgr.repositories;

import org.springframework.data.repository.CrudRepository;

import com.bst.pmgr.entities.Manager;

public interface ManagerRepository extends CrudRepository<Manager, Long> {
}
