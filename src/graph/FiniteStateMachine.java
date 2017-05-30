package graph;

import components.ListTaskOrISR;
import components.ListTransition;
import components.OS_Application;

public class FiniteStateMachine {
	private String name;
	private int numOfTest;
	public ListState stateList;
	private ListTransition transitionList;
	private OS_Application beginState;
	private ListTaskOrISR endStateList;
}
