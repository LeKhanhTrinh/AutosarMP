package components;

import java.util.ArrayList;

public class ListTaskOrISR {
	private ArrayList<OS_TasksISR> listObj;
	
	public ListTaskOrISR() {
		// TODO Auto-generated constructor stub
		listObj = new ArrayList<OS_TasksISR>();
	}
	
	public void addObjTS(OS_TasksISR e){
		listObj.add(e);
	}
	
	public OS_TasksISR getObjTSByIndex(int index){
		return listObj.get(index);
	}
	
	public OS_TasksISR getObjTSByName(String _name){
		try{
			for (int i=0 ; i<listObj.size() ; i++){
				if (listObj.get(i).getName().compareTo(_name) == 0){
					return listObj.get(i);
				}
			}
		}catch(Exception ex){
			System.out.println("No Task has this name: " + _name);
		}
		
		return null;
	}
	
	
	public ArrayList<OS_TasksISR> getListObj() {
		return listObj;
	}

	public void setListObj(ArrayList<OS_TasksISR> listObj) {
		this.listObj = listObj;
	}

	public int getSize(){
		return listObj.size();
	}
}
