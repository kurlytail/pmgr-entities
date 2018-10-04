package com.bst.pmgr.entities.audit;

import javax.persistence.PrePersist;

import com.bst.pmgr.entities.Document;

public class DocumentAudit {
	@PrePersist
	private void beforeAnyOperation(Document object) {
		if(object.getName() == null) {
			object.setName("Document");
		}
	}
}
