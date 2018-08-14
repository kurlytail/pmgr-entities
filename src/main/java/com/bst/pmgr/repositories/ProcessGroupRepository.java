package com.bst.pmgr.repositories;

import org.springframework.data.repository.CrudRepository;

import com.bst.pmgr.entities.ProcessGroup;

public interface ProcessGroupRepository extends CrudRepository<ProcessGroup, Long> {
}
