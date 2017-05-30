package graph;

import java.util.ArrayList;

public class ArrayTransList {

	ArrayList<String> arrList;

	public ArrayTransList() {
		// TODO Auto-generated constructor stub
		arrList = new ArrayList<String>();
	}
	
	public ArrayTransList(ArrayList<String> arrList){
		this.arrList = arrList;
	}
	
	public void Add(String element){
		arrList.add(element);
	}
	
	public void RemoveHead(){
		arrList.remove(0);
	}
	
	public boolean IsEmpty(){
		return arrList.isEmpty();
	}
	
	public String printAll(){
		String rs = "{";
		if (arrList.size() > 0){
			for (int i=0 ; i<arrList.size()-1 ; i++){
				rs += arrList.get(i) + ", ";
			}
			rs += arrList.get(arrList.size()-1);
		}
		rs += "}";
		return rs;
	}
	
	public int getSize(){
		return arrList.size();
	}
	
	public String getByIndex(int i){
		return arrList.get(i);
	}
}
