package components;

public class Transition {

	//private String name;
	private Object from;
	private Object to;
	private String action;
	private String permission;
	private String reqNo;
	
	public Transition() {
		// TODO Auto-generated constructor stub
	}
	
	public Transition(Object _from, Object _to, String _action, String _reqNo, String _permis) {
		from = _from;
		to = _to;
		action = _action;
		reqNo = _reqNo;
		permission = _permis;
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args){
		//Transition test = new Transition(new OS_Application("app1"), new Memory("Datasect1", "app1"), "contains;[P086:read,write]Shall_Permit");
		//test.getCellInformation("contains;[P086:read,write]Shall_Permit");
	}

	
	public String toString(){
		return from.toString() + "-->" + to.toString() + " ( " + reqNo + " :" + action + " / " + permission + ")";
	}
	
	public String getReqNo() {
		return reqNo;
	}

	public void setReqNo(String reqNo) {
		this.reqNo = reqNo;
	}

	public Object getFrom() {
		return from;
	}

	public void setFrom(Object from) {
		this.from = from;
	}

	public Object getTo() {
		return to;
	}

	public void setTo(Object to) {
		this.to = to;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getPermission() {
		return permission;
	}

	public void setPermission(String permission) {
		this.permission = permission;
	}
	
	
}
