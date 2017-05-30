package components;

public class MemoryParts extends OS_Object{

	//private String name;
	private String parent;

	public MemoryParts(String _name, String _parent){
		super(_name);
		parent = _parent;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return parent + "." + getName();
	}

	public String getType() {
		return parent;
	}

	public void setType(String type) {
		this.parent = type;
	}
	
	
}
