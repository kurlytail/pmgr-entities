package com.bst.pmgr.entities.strategy;

import org.springframework.stereotype.Component;

import com.bst.pmgr.entities.Work;

@Component
public class GenericSelectionStrategy extends AbstractSelectionStrategy {

	@Override
	public StrategyDescriptor computeSelection(Work work) {
		StrategyDescriptor strategy = new StrategyDescriptor();

		return strategy;
	}

	@Override
	public Long computeStrategyScore(Work work) {
		return 0L;
	}

}
