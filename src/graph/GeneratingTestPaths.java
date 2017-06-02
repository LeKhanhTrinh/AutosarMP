package graph;

import java.util.ArrayList;

import components.ListMemory;
import components.ListObject;
import components.ListTransition;

public class GeneratingTestPaths {

	boolean[] isUsed;
	//String [][] nameTransition;
	ArrayTransList arrTranLists;
	
	int numberStates;
	//ArrayList<String> listEndState;
	//ArrayList<String> listState;
	ArrayList<String> addMore;
	ArrayList<String> arrTemp;
	FiniteStateMachine fsm;
	ListTransition listTransition;
	ListObject listState;
	ListMemory listEndState;
	ListPath listPath;
	
	
	public GeneratingTestPaths(FiniteStateMachine _fsm) {
		// TODO Auto-generated constructor stub
		fsm = _fsm;
		listEndState = fsm.getEndStateList();
		listState = fsm.getStateList();
		listTransition = fsm.getTransitionList();
		arrTranLists = new ArrayTransList(listTransition);
		isUsed = new boolean[arrTranLists.arrayTrans.length];
		arrTemp = new ArrayList<>();
		listPath = new ListPath();
		//listPath
		
		for (int i=0 ; i<isUsed.length ; i++) isUsed[i] = false;
		
//		
//		System.out.println("STATE LIST: " + listState.getSize());
//		listState.printAllObjects();
//		
		System.out.println("ARRAY TRANSITION LIST: " + arrTranLists.getSize());
		arrTranLists.printAll();
//		//listTransition.printAllTrans();
		
//		System.out.println("END STATE LIST: " + listEndState.getSize());
//		listEndState.printAllMemoryParts();
		
		System.out.println("DFSS : " + fsm.getBeginState().getName());
		DFS(fsm.getBeginState().getName(), listPath);
	}
	
	public static void main(String[] args){
		
	}
	
	//Xoa phan sort va add
	public ListPath automatedGeneratingTestPath(){
		//ListPath PATH;
		//listPath = new ListPath();
		arrTemp.clear();
		arrTemp.add(fsm.getBeginState().getName());
		DFS(fsm.getBeginState().getName(), listPath);
		//addToPath(PATH);
		//PATH.sort();
		listPath.printPath();
		//printList();
		return listPath;
	}	
	
	//Search the tree
	private void DFS(String start, ListPath PATH){
		int t=0;
		//get all children of start
		ArrayList<Integer> startBy = getAllTransFromName(start);
		
		//System.out.println(t + " \t " + startBy);
		for (int i=0 ; i<startBy.size() ; i++){
			//System.out.println(arrTranLists.getByIndex(startBy.get(i)).getTo().getName());
			if (isUsed[startBy.get(i)] == false ){
				t++;
				isUsed[startBy.get(i)] = true;
				
				//System.out.println(startBy.get(i) + "\t" + arrTranLists.getByIndex(startBy.get(i)).getTo().getName());
				
				arrTemp.add(arrTranLists.getByIndex(startBy.get(i)).toString());
				//System.out.println("Size TEMP:" + i + "\t" + arrTemp.size());
				DFS(arrTranLists.getByIndex(startBy.get(i)).getTo().getName(), PATH);
				arrTemp.remove(arrTemp.size()-1);
			}else{
				continue;
			}
			
		}
		
		//System.out.println(arrTemp);
		if (t==0){
			//System.out.println(arrTemp);
			PATH.Add(arrTemp);
		}
		
	}
	
	public ArrayList<Integer> getAllTransFromName(String name){
		ArrayList<Integer> rs = new ArrayList<>();
		
		for (int i=0 ; i<arrTranLists.getSize() ; i++){
			//System.out.println(arrTranLists.getByIndex(i).getFrom().toString());
			if (arrTranLists.getByIndex(i).getFrom().getName().toString().compareTo(name) == 0){
				rs.add(i);
			}
		}
		
		return rs;
	}
}
