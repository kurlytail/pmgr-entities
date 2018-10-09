package com.bst.pmgr.entities.strategy;

import org.springframework.stereotype.Service;

import com.bst.pmgr.entities.Work;

@Service
public class ActivityExecutionStrategy extends AbstractExecutionStrategy {

	@Override
	public Long computeStrategyScore(final Work work) {
		return 0L;
	}

	@Override
	public void execute(final Work work, final StrategyDescriptor strategy) {
	}
	
}
