package components;

public class OS_Object {
	private String name;
	
	public OS_Object(String _name) {
		// TODO Auto-generated constructor stub
		name = _name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
}
