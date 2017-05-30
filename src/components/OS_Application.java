package components;

import java.util.ArrayList;

public class OS_Application extends MemoryParts{

	private String name;
	private ArrayList<OS_Object> containing;
	private MemoryParts dataSection;
	private String parent;
	

	public OS_Application(String _name, String _parent) {
		// TODO Auto-generated constructor stub
		name = _name;
		parent = _parent;
	}
	
	public OS_Application(String _name, MemoryParts _ds, ArrayList<OS_Object> listOBJ, String _parent){
		name = _name;
		dataSection = _ds;
		containing = listOBJ;
		parent = _parent;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		if (parent != null)
			return parent + "." + name;
		return name;
	}
	
	public void setParent(String parent) {
		this.parent = parent;
	}

	public String getParent() {
		return parent;
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

	public MemoryParts getDataSection() {
		return dataSection;
	}

	public void setDataSection(MemoryParts dataSection) {
		this.dataSection = dataSection;
	}
}
