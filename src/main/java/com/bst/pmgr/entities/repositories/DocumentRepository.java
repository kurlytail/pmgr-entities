package com.bst.pmgr.entities.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bst.pmgr.entities.Document;

@Repository
public interface DocumentRepository extends CrudRepository<Document, Long> {
}
