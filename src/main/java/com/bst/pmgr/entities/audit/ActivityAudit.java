package com.bst.pmgr.entities.audit;

import javax.persistence.PrePersist;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;

public class ActivityAudit {
	@PrePersist
	@PreUpdate
	@PreRemove
	private void beforeAnyOperation(Object object) {
	}

}
