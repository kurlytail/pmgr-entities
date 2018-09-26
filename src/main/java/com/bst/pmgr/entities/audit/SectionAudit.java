package com.bst.pmgr.entities.audit;

import javax.persistence.PrePersist;

import com.bst.pmgr.entities.Section;

public class SectionAudit {
	
	@PrePersist
	public void beforeAnyOperation(Section section) {
		if (section.getDocument() == null) {
			throw new IllegalStateException("Section.document should be set");
		}
		
		if (section.getParentSection() != null) {
			if (section.getDocument() != section.getParentSection().getDocument()) {
				throw new IllegalStateException("Section.parentSection.document must be the same as Section.document");
			}
		}
	}
}
