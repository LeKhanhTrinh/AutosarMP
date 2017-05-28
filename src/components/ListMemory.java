package components;

import java.util.ArrayList;

public class ListMemory {
	private ArrayList<Object> listMems;
	
	public ListMemory() {
		// TODO Auto-generated constructor stub
		listMems = new ArrayList<Object>();
	}
	
	public void addMemory(Object e){
		listMems.add(e);
	}
	
	public Object getMemoryByIndex(int index){
		return listMems.get(index);
	}
	
	public Object getMemoryByName(String _name){
		for (int i=0 ; i<listMems.size() ; i++){
			if (listMems.get(i).getName().compareTo(_name) == 0){
				return listMems.get(i);
			}
		}
		return null;
	}
	
	
	public int getSize(){
		return listMems.size();
	}
}
