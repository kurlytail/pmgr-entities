package com.bst.pmgr.entities.components;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import org.kohsuke.randname.RandomNameGenerator;
import org.springframework.stereotype.Component;

import com.bst.pmgr.entities.Document;

@Component
public class DocumentListener {

	private final RandomNameGenerator rnd = new RandomNameGenerator(0);

	@PreUpdate
	@PrePersist
	public void prePersist(final Document document) throws Exception {
		if (document.getName() == null) {
			document.setName(this.rnd.next());
		}

		if (document.getMetaName() == null) {
			throw new Exception("Document does not have a meta name");
		}
	}

}
