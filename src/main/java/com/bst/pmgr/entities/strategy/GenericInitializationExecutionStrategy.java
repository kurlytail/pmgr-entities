package com.bst.pmgr.entities.strategy;

import org.springframework.stereotype.Component;

import com.bst.pmgr.entities.Work;

@Component
public class GenericInitializationExecutionStrategy extends AbstractExecutionStrategy {

	@Override
	public Long computeStrategyScore(Work work) {
		if (work.getActivities().size() != 0) {
			return -1L;
		}
		return 0L;
	}

	@Override
	public void execute(Work work, StrategyDescriptor strategy) {
		// TODO Auto-generated method stub
	}

}
