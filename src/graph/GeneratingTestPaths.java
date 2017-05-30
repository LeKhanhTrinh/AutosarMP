package graph;

import java.util.ArrayList;

public class GeneratingTestPaths {

	boolean [][] isUsed;
	String [][] nameTransition;
	ArrayTransList[][] arrTranLists;
	int numberStates;
	ArrayList<String> listEndState;
	ArrayList<String> listState;
	ArrayList<String> addMore;
	ArrayList<String> arrTemp;
	
	public GeneratingTestPaths(FiniteStateMachine fsm){
		arrTemp = new ArrayList<String>();
		listEndState = new ArrayList<String>();
		listState = new ArrayList<String>();
		addMore = new ArrayList<String>();
		numberStates = fsm.getNumberOfState();
		
		//get all Transition
		int countTrans = 0;
		for (int i=0 ; i<fsm.getNumberOfState() ; i++){
			for (int j=0 ; j<fsm.getNumberOfState() ; j++){
				//nameTransition[i][j] = fsm.getListTransition().getTransByIndex(countTrans).toString();
				arrTranLists[i][j].Add(fsm.getListTransition().getTransByIndex(countTrans).toString());
				
			}
		}
		
		//get final states
		for (int i=0 ; i<fsm.getNumberOfFinalState() ; i++){
			listEndState.add(fsm.getEndStateList().getMemoryByIndex(i).toString());
		}
		
		//get all state
		System.out.println("Num of State: " + fsm.getNumberOfState());
		for (int i=0 ; i<fsm.getNumberOfState() ; i++){
			listState.add(fsm.getListTransition().getTransByIndex(i).getTo().toString());
		}
		
		//Assign all state are unused
		isUsed = new boolean[numberStates][];

		for (int i=0; i<numberStates; i++){ 
			
			isUsed[i] = new boolean[numberStates];
			for (int j=0 ; j<numberStates ; j++){
				isUsed[i][j] = false;
			}
		}
		
		//arrTransition = null
		arrTranLists = new ArrayTransList[numberStates][];
		for (int i=0; i<numberStates; i++){ 
			
			arrTranLists[i] = new ArrayTransList[numberStates];
			for (int j=0 ; j<numberStates ; j++){
				arrTranLists[i][j] = new ArrayTransList();
			}
		}
				
		//nameTransition = null
		nameTransition = new String[numberStates][];
		for (int i=0; i<numberStates; i++){ 
			
			nameTransition[i]=new String[numberStates];
			for (int j=0 ; j<numberStates ; j++){
				nameTransition[i][j] = "";
			}
		}
				
		System.out.println("STATE LIST: " + listState.size());
		for (int i=0 ; i<listState.size() ; i++){
			System.out.println(listState.get(i));
		}
		
		System.out.println("ARRAY TRANSITION LIST: " + numberStates);
		for (int i=0; i<numberStates; i++){
			for (int j=0; j<numberStates; j++){
				if (arrTranLists[i][j].getSize() > 0){
					System.out.println(i + "; " + j + ": " + arrTranLists[i][j].printAll());
				}
			}
		}
		
		System.out.println("END STATE LIST: " + listEndState.size());
		for (int i=0 ; i<listEndState.size() ; i++){
			System.out.println(listEndState.get(i));
		}
	}
	
	public static void main(String[] args){
		
	}
	
	//Search the tree
	private void DFS(int i, ListPath PATH){
		int t=0;
		
		for (int j=0; j<numberStates; j++){
			
			if (arrTranLists[i][j].getSize()>0 && isUsed[i][j] == false){
				t++;
				
				//overState[j]=1;
				arrTranLists[i][j].RemoveHead();
				if (arrTranLists[i][j].IsEmpty()){
					isUsed[i][j] = true;
				}
				arrTemp.add(listState.get(j));
		
				DFS(j, PATH);
				arrTemp.remove(arrTemp.size()-1);
				
			}
		}

		if (t==0){
			System.out.println();
			PATH.Add(arrTemp);

		}
		
	}
}
