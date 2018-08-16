package com.bst.pmgr.repositories;

import org.springframework.data.repository.CrudRepository;

import com.bst.pmgr.entities.Tool;

public interface ToolRepository extends CrudRepository<Tool, Long> {
}
