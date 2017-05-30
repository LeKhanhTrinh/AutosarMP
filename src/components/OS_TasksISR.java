package components;

public class OS_TasksISR extends OS_Object{
	
	//private String name;
	private String parent;
	private String dataSection;
	private String stack;
	private String init;
	
	
	public OS_TasksISR(String _name, String _parent) {
		// TODO Auto-generated constructor stub
		super(_name);
		parent = _parent;
	}
	
	public OS_TasksISR(String _name, String _pr, String _ds, String _st){
		super(_name);
		parent = _pr;
		dataSection = _ds;
		stack = _st;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return parent + "." + getName();
	}
	
	public String getInit() {
		return init;
	}

	public void setInit(String init) {
		this.init = init;
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
		return stack;
	}
	public void setStack(String stack) {
		stack = stack;
	}
	
	
}
