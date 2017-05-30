package components;

public class OS_Object extends MemoryParts{
	
	private String name;
	private String parent;
	private String dataSection;
	private String Stack;
	private String init;
	
	
	public OS_Object(String _name, String _parent) {
		// TODO Auto-generated constructor stub
		name = _name;
		parent = _parent;
	}
	
	public OS_Object(String _name, String _pr, String _ds, String _st){
		name = _name;
		parent = _pr;
		dataSection = _ds;
		Stack = _st;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return parent + "." + name;
	}
	
	public String getInit() {
		return init;
	}

	public void setInit(String init) {
		this.init = init;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getParent() {
		return parent;
	}
	public void setParent(String parent) {
		this.parent = parent;
	}
	public String getDataSection() {
		return dataSection;
	}
	public void setDataSection(String dataSection) {
		this.dataSection = dataSection;
	}
	public String getStack() {
		return Stack;
	}
	public void setStack(String stack) {
		Stack = stack;
	}
	
	
}
