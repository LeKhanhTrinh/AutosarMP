package components;

import java.util.ArrayList;

public class ListMemory {
	private ArrayList<MemoryParts> listMems;
	
	public ListMemory() {
		// TODO Auto-generated constructor stub
		listMems = new ArrayList<MemoryParts>();
	}
	
	public void addMemory(MemoryParts e){
		listMems.add(e);
	}
	
	public MemoryParts getMemoryByIndex(int index){
		return listMems.get(index);
	}
	
	public MemoryParts getMemoryByName(String _name){
		for (int i=0 ; i<listMems.size() ; i++){
			if (listMems.get(i).getName().compareTo(_name) == 0){
				return listMems.get(i);
			}
		}
		return null;
	}
	
	public void printAllMemoryParts(){
		for (int i=0 ; i<listMems.size() ; i++){
			System.out.println(listMems.get(i));
		}
	}
	
	public ArrayList<MemoryParts> getListMems() {
		return listMems;
	}

	public void setListMems(ArrayList<MemoryParts> listMems) {
		this.listMems = listMems;
	}

	public int getSize(){
		return listMems.size();
	}
}
