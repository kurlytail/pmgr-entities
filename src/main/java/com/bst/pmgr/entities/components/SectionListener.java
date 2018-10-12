package com.bst.pmgr.entities.components;

import javax.persistence.PrePersist;

import org.springframework.stereotype.Component;

import com.bst.pmgr.entities.Section;

@Component
public class SectionListener {
	
	@PrePersist
	public void prePersist(final Section section) throws Exception {
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
