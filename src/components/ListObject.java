package components;

import java.util.ArrayList;

public class ListObject {
	private ArrayList<OS_Object> listObj;
	
	public ListObject() {
		// TODO Auto-generated constructor stub
		listObj = new ArrayList<OS_Object>();
	}
	
	public void addObj(OS_Object e){
		listObj.add(e);
	}
	
	public OS_Object getObjByIndex(int index){
		return listObj.get(index);
	}
	
	public OS_Object getObjByName(String _name){
		for (int i=0 ; i<listObj.size() ; i++){
			if (listObj.get(i).getName().compareTo(_name) == 0){
				return listObj.get(i);
			}
		}
		return null;
	}
	
	
	public int getSize(){
		return listObj.size();
	}
}
