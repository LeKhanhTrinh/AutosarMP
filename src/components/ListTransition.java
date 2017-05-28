package components;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class ListTransition {
	private ArrayList<Transition> listTrans;
	
	public ListTransition() {
		// TODO Auto-generated constructor stub
		listTrans = new ArrayList<Transition>();
	}
	
	public static void main(String[] args){
		ListTransition test = new ListTransition();
		//test.getAction("contains;[P086:read,write]Shall_Permit");
	}
	
	
	
	//Transition List
	public void addTrans(Transition e){
		listTrans.add(e);
	}
	
	public Transition getTransByIndex(int index){
		return listTrans.get(index);
	}
	
	public Transition getTransByName(String _name){
		for (int i=0 ; i<listTrans.size() ; i++){
			if (listTrans.get(i).getFrom().toString().compareTo(_name) == 0){
				return listTrans.get(i);
			}
		}
		return null;
	}
	
	public int getSize(){
		return listTrans.size();
	}
	
	public void printAllTrans(){
		for (int i=0 ; i<listTrans.size() ; i++){
			System.out.println(listTrans.get(i).toString());
		}
	}
	
}
