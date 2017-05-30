package graph;

import java.util.ArrayList;

public class ListPath {

	private ArrayList<ArrayList<String>> listPaths;
	
	public ListPath() {
		// TODO Auto-generated constructor stub
		listPaths = new ArrayList<ArrayList<String>>();
	}
	
	//getSize of List
	public int getSize(){
		return listPaths.size();
	}
	
	//Add a path into List Path
	public void Add(ArrayList<String> arr){
		ArrayList<String> temp = new ArrayList<String>();
		for (int i=0; i<arr.size(); i++){
			temp.add(arr.get(i));
		}
		listPaths.add(temp);
	}
	
	//Print all paths
	public void printPath(){
		for (int i=0; i<listPaths.size(); i++){
			System.out.print((i+1)+". ");
			ArrayList<String> temp = listPaths.get(i);
			for (int k=0; k<temp.size(); k++){
				System.out.print(temp.get(k) + " ");
				
			}
			System.out.println();
			
		}
	}
	
	public ArrayList<String> getPathByIndex(int index){
		return listPaths.get(index);
	}
	
	public int getSizeOfPath(int index){
		return listPaths.get(index).size();
	}
	
	public String getLastStateFromPathNumber(int index){
		return listPaths.get(index).get(listPaths.get(index).size()-1);
	}
}
