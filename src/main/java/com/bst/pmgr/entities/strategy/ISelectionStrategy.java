package com.bst.pmgr.entities.strategy;

import org.springframework.beans.factory.BeanNameAware;

import com.bst.pmgr.entities.Work;

public interface ISelectionStrategy extends BeanNameAware {
	StrategyDescriptor computeSelection(Work work);

	Long computeStrategyScore(Work work);
}
