package com.bst.pmgr.repositories;

import org.springframework.data.repository.CrudRepository;

import com.bst.pmgr.entities.Document;

public interface DocumentRepository extends CrudRepository<Document, Long> {
}
