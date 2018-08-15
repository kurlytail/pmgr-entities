package com.bst.pmgr.repositories;

import org.springframework.data.repository.CrudRepository;

import com.bst.pmgr.entities.GenericTool;

public interface ToolRepository extends CrudRepository<GenericTool, Long> {
}
