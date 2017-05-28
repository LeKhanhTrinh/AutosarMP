package components;

import java.util.ArrayList;

public class OS_Application extends Object{

	private String name;
	private ArrayList<OS_Object> containing;
	private Object dataSection;
	
	public OS_Application(String _name) {
		// TODO Auto-generated constructor stub
		name = _name;
	}
	
	public OS_Application(String _name, Object _ds, ArrayList<OS_Object> listOBJ){
		name = _name;
		dataSection = _ds;
		containing = listOBJ;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<OS_Object> getContaining() {
		return containing;
	}

	public void setContaining(ArrayList<OS_Object> containing) {
		this.containing = containing;
	}

	public Object getDataSection() {
		return dataSection;
	}

	public void setDataSection(Object dataSection) {
		this.dataSection = dataSection;
	}
}
