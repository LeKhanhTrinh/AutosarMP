package graph;

import java.util.ArrayList;

import components.ListMemory;
import components.ListObject;
import components.ListTransition;
import components.OS_Application;
import components.OS_Object;
import components.Transition;

public class FiniteStateMachine {
	private String name;
	private ListObject stateList;
	private ListTransition transitionList;
	private OS_Object beginState;
	private ListMemory endStateList;
	
	public FiniteStateMachine(String _name, ListObject _stateList, ListTransition _transitionList, OS_Object _beginState, ListMemory _endStateList) {
		// TODO Auto-generated constructor stub
		name = _name;
		stateList = _stateList;
		transitionList = _transitionList;
		beginState = _beginState;
		endStateList = _endStateList;
		
		System.out.println("BEGIN STATE: " + beginState);
		System.out.println("END STATES: ");
		endStateList.printAllMemoryParts();
		System.out.println("STATE LISTS: ");
		stateList.printAllObjects();
		System.out.println("TRANSITION: ");
		transitionList.printAllTrans();
	}
	
	//Get transitions from a state
	public ArrayList<Transition> getAllTransitionFrom (String stateName) {
		ArrayList<Transition> rs = new ArrayList<Transition>();
		for (int i=0 ; i<transitionList.getSize() ; i++){
			if (transitionList.getTransByIndex(i).getFrom().getName().compareTo(stateName) == 0){
				rs.add(transitionList.getTransByIndex(i));
			}
		}
		return rs;
	}
	
	//Get transitions to a state
	public ArrayList<Transition> getAllTransitionTo(String stateName){
		ArrayList<Transition> rs = new ArrayList<Transition>();
		for (int i=0 ; i<transitionList.getSize() ; i++){
			if (transitionList.getTransByIndex(i).getTo().getName().compareTo(stateName) == 0){
				rs.add(transitionList.getTransByIndex(i));
			}
		}
		return rs;
	}
	
	/**
	 * Show number of elements
	 * */
	public int getNumberOfState(){
		return stateList.getSize();
	}
	
	public int getNumberOfTransition(){
		return transitionList.getSize();
	}
	
	public ListTransition getListTransition(){
		return transitionList;
	}
	
	public int getNumberOfFinalState(){
		return endStateList.getSize();
	}
	
	/**
	 * Getters and setters
	 * */
	public ListObject getStateList() {
		return stateList;
	}

	public void setStateList(ListObject stateList) {
		this.stateList = stateList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ListTransition getTransitionList() {
		return transitionList;
	}

	public void setTransitionList(ListTransition transitionList) {
		this.transitionList = transitionList;
	}

	public OS_Object getBeginState() {
		return beginState;
	}

	public void setBeginState(OS_Application beginState) {
		this.beginState = beginState;
	}

	public ListMemory getEndStateList() {
		return endStateList;
	}

	public void setEndStateList(ListMemory endStateList) {
		this.endStateList = endStateList;
	}

	public void printTransition(){
		System.out.println("Transition: ");
		for (int i=0 ; i<transitionList.getSize() ; i++){
			System.out.println(i + ":");
			System.out.println(transitionList.getTransByIndex(i).toString());
		}
	}
	
	public void printAll(){
		System.out.println("G - State number:" + stateList.getSize());
		System.out.println("G - Transition number:" + transitionList.getSize());
	}
	
	
	public void printBeginState(){
		System.out.println("BEGIN STATE:\t" + beginState.getName() + "\n");
	}
	
	public void printEndState(){
		System.out.print("End state:\t");
		for (int i=0 ; i<endStateList.getSize() ; i++){
			System.out.print(endStateList.getMemoryByIndex(i).getName() + "\t");
		}
		System.out.println();
	}
	
	public void printState(){
		stateList.printAllObjects();
	}
}
