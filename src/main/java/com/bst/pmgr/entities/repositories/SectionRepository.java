package com.bst.pmgr.entities.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bst.pmgr.entities.Section;

@Repository
public interface SectionRepository<T extends Section> extends CrudRepository<T, Long> {
	  public List<T> findAll();
}
