package components;

public class Object {

	private String name;
	private String parent;
	
	public Object() {
		// TODO Auto-generated constructor stub
	}

	public Object(String _name, String _parent){
		name = _name;
		parent = _parent;
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

	public String getType() {
		return parent;
	}

	public void setType(String type) {
		this.parent = type;
	}
	
	
}
