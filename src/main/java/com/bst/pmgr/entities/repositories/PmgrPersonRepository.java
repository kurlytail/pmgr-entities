package com.bst.pmgr.entities.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.bst.pmgr.entities.PmgrPerson;

@Transactional(readOnly = true)
public interface PmgrPersonRepository extends CrudRepository<PmgrPerson, Long>, PmgrPersonRepositoryCustom {
}
