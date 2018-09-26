package com.bst.pmgr.entities.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bst.pmgr.entities.Document;

@Repository
public interface DocumentRepository<T extends Document> extends CrudRepository<T, Long> {
	  public List<T> findAll();
}
