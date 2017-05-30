package components;

import java.util.ArrayList;

public class ListApplication {
	private ArrayList<OS_Application> listApp;
	
	public ListApplication() {
		// TODO Auto-generated constructor stub
		listApp = new ArrayList<OS_Application>();
	}
	
	public void addApp(OS_Application e){
		listApp.add(e);
	}
	
	public OS_Application getAppByIndex(int index){
		return listApp.get(index);
	}
	
	public OS_Application getAppByName(String _name){
		try{
			for (int i=0 ; i<listApp.size() ; i++){
				if (listApp.get(i).getName().compareTo(_name) == 0){
					return listApp.get(i);
				}
			}
		}catch(Exception ex){
			System.out.println("No App have this name: " + _name);
		}
		return null;
	}
	
	public ArrayList<OS_Application> getListApp() {
		return listApp;
	}

	public void setListApp(ArrayList<OS_Application> listApp) {
		this.listApp = listApp;
	}

	public int getSize(){
		return listApp.size();
	}
}
