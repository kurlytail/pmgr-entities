package com.bst.pmgr.entities.services;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bst.pmgr.entities.Document;
import com.bst.pmgr.entities.Work;

@Service
public class DocumentService {
	
	@Transactional
	public Document getDocument(Work work, String documentMeta) {
		return null;
	}
	
	@Transactional
	public void setDocumentCompletion(Document document)
	{
		
	}
}
