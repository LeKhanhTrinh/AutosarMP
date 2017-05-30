package components;

import java.util.ArrayList;

public class ListObject {

	private ArrayList<OS_Object> listObject;
	
	public ListObject() {
		// TODO Auto-generated constructor stub
		listObject = new ArrayList<OS_Object>();
	}
	
	public void addObject(OS_Object e){
		listObject.add(e);
	}
	
	public OS_Object getObjectByIndex(int index){
		return listObject.get(index);
	}
	
	public Object getObjectByName(String _name){
		for (int i=0 ; i<listObject.size() ; i++){
			if (((OS_Object) listObject.get(i)).getName().compareTo(_name) == 0){
				return listObject.get(i);
			}
		}
		return null;
	}
	
	
	public int getSize(){
		return listObject.size();
	}
	
	public void printAllObjects(){
		for (OS_Object os_obj : listObject){
			System.out.println(os_obj);
		}
	}
}
