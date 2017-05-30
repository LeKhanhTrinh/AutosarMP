package components;

import java.util.ArrayList;

public class OS_Application extends OS_Object{

	//private String name;
	private ArrayList<OS_TasksISR> containing;
	private MemoryParts dataSection;
	private String parent;
	
	public OS_Application(String _name, String _parent) {
		// TODO Auto-generated constructor stub
		super(_name);
		parent = _parent;
	}
	
	public OS_Application(String _name, MemoryParts _ds, ArrayList<OS_TasksISR> listOBJ, String _parent){
		super(_name);
		dataSection = _ds;
		containing = listOBJ;
		parent = _parent;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		if (parent != null)
			return parent + "." + getName();
		return getName();
	}
	
	public void setParent(String parent) {
		this.parent = parent;
	}

	public String getParent() {
		return parent;
	}

	public ArrayList<OS_TasksISR> getContaining() {
		return containing;
	}

	public void setContaining(ArrayList<OS_TasksISR> containing) {
		this.containing = containing;
	}

	public MemoryParts getDataSection() {
		return dataSection;
	}

	public void setDataSection(MemoryParts dataSection) {
		this.dataSection = dataSection;
	}
}
