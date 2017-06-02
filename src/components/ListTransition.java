package components;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class ListTransition {
	private ArrayList<Transition> listTrans;
	private ArrayList<Transition> listRequirementTrans;
	
	public ListTransition() {
		// TODO Auto-generated constructor stub
		listTrans = new ArrayList<Transition>();
		//listRequirementTrans = new ArrayList<Transition>();
	}
	
	public static void main(String[] args){
		ListTransition test = new ListTransition();
		//test.getAction("contains;[P086:read,write]Shall_Permit");
	}
	
	
	public ArrayList<Transition> getListTrans() {
		return listTrans;
	}

	public void setListTrans(ArrayList<Transition> listTrans) {
		this.listTrans = listTrans;
	}

	public int getIndexOfTransition(Transition trans){
		for (int i=0 ; i<listTrans.size() ; i++){
			if (listTrans.get(i).toString().compareTo(trans.toString()) == 0)
				return i;
		}
		
		return -1;
	}
	
	public ArrayList<Transition> getListRequirementTrans() {
		ArrayList<Transition> tempList = new ArrayList<Transition>();
		for (int i=0 ; i<listTrans.size() ; i++){
			if (listTrans.get(i).getPermission().compareTo("") != 0){
				tempList.add(listTrans.get(i));
			}
		}
		return tempList;
	}

	public void setListRequirementTrans(ArrayList<Transition> listRequirementTrans) {
		this.listRequirementTrans = listRequirementTrans;
	}

	//Transition List
	public void addTrans(Transition e){
		listTrans.add(e);
	}
	
	public Transition getTransByIndex(int index){
		return listTrans.get(index);
	}
	
	public ArrayList<Transition> getTransByNameFrom(String _name){
		
		ArrayList<Transition> rs = new ArrayList<>();
		for (int i=0 ; i<listTrans.size() ; i++){
			if (listTrans.get(i).getFrom().toString().compareTo(_name) == 0){
				rs.add(listTrans.get(i));
			}
		}
		return rs;
	}
	
	public Transition getTransByNameTo(String _name){
		for (int i=0 ; i<listTrans.size() ; i++){
			if (listTrans.get(i).getTo().toString().compareTo(_name) == 0){
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
			System.out.println(listTrans.get(i).toString() + "\n");
		}
	}
	
	public void printAllRequirement(){
		listRequirementTrans = getListRequirementTrans();
		for (int i=0 ; i<listRequirementTrans.size() ; i++){
			System.out.println(listRequirementTrans.get(i).toString());
		}
	}
	
}
