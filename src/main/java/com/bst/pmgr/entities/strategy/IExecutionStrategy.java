package com.bst.pmgr.entities.strategy;

import org.springframework.beans.factory.BeanNameAware;

import com.bst.pmgr.entities.Work;

public interface IExecutionStrategy extends BeanNameAware {
	Long computeStrategyScore(Work work);

	void execute(Work work, StrategyDescriptor strategy);
}
