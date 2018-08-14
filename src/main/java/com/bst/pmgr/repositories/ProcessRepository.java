package com.bst.pmgr.repositories;

import org.springframework.data.repository.CrudRepository;

import com.bst.pmgr.entities.Process;

public interface ProcessRepository extends CrudRepository<Process, Long> {
}
