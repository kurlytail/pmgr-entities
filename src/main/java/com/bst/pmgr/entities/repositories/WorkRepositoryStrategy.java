package com.bst.pmgr.entities.repositories;

import com.bst.pmgr.entities.Work;

public interface WorkRepositoryStrategy {
	Work process(Work work);
}
