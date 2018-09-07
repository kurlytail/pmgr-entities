package com.bst.pmgr.entities.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.bst.pmgr.entities.Document;

@RepositoryRestResource
public interface DocumentRepository extends CrudRepository<Document, Long> {
}
