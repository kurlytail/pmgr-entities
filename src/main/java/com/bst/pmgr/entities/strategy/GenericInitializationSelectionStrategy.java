package com.bst.pmgr.entities.strategy;

import org.springframework.stereotype.Component;

import com.bst.pmgr.entities.Work;

@Component
public class GenericInitializationSelectionStrategy extends AbstractSelectionStrategy {

	@Override
	public StrategyDescriptor computeSelection(Work work) {
		StrategyDescriptor strategy = new StrategyDescriptor();

		return strategy;
	}

	@Override
	public Long computeStrategyScore(Work work) {
		if (work.getActivities().size() != 0) {
			/* Already initialized */
			return -1L;
		}
		
		/* Lowest priority for any kind of work */
		return 0L;
	}

}
