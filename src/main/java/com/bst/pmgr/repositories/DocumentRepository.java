package com.bst.pmgr.repositories;

import org.springframework.data.repository.CrudRepository;

import com.bst.pmgr.entities.GenericDocument;

public interface DocumentRepository extends CrudRepository<GenericDocument, Long> {
}
