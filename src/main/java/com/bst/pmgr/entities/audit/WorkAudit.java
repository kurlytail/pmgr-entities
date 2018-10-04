package com.bst.pmgr.entities.audit;

import javax.persistence.PrePersist;

import com.bst.pmgr.entities.Work;

public class WorkAudit {
	@PrePersist
	private void beforeAnyOperation(Work object) {
		if(object.getName() == null) {
			object.setName("Work");
		}
	}
}
