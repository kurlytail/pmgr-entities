package com.bst.pmgr.entities.components;

import org.springframework.stereotype.Service;

import com.bst.pmgr.entities.Work;

@Service
public class WorkService {
		
	public Work create(final String name) {
		return new Work();
	}

}
