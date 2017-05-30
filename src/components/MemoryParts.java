package components;

public class MemoryParts {

	private String name;
	private String parent;
	
	public MemoryParts() {
		// TODO Auto-generated constructor stub
	}

	public MemoryParts(String _name, String _parent){
		name = _name;
		parent = _parent;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return parent + "." + name;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return parent;
	}

	public void setType(String type) {
		this.parent = type;
	}
	
	
}
