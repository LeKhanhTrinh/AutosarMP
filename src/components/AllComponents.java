package components;

import java.io.File;
import java.util.ArrayList;
import jxl.Sheet;
import jxl.Workbook;

public class AllComponents {

	private String name;
	private ListObject listTasksISR = new ListObject();
	private ListApplication listApps = new ListApplication();
	private ListMemory listMemoryParts = new ListMemory();
	private ListTransition listTransitions = new ListTransition();
	
	public AllComponents(String fileName) throws Exception {
		// TODO Auto-generated constructor stub
		inputData(fileName);
	}

	public static void main(String[] args){
		try {
			AllComponents test = new AllComponents("Accession.xls");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void inputData(String fileName) throws Exception{		
		
		//Enter file, sheet 0
		Workbook workbook = Workbook.getWorkbook(new File(fileName));
        Sheet sheet = workbook.getSheet(0);
        
        //Read the first cell
        int nSubject = Integer.valueOf(sheet.getCell(0, 0).getContents().trim()).intValue();
        
		System.out.println("Input data: ");
		
		//Enter subject
		for (int i=0; i<nSubject; i++){
        	
        	String name = sheet.getCell(0, i+2).getContents().trim();
        	String type = sheet.getCell(2, i+2).getContents().trim();
        	String parent = sheet.getCell(3, i+2).getContents().trim();
        	//Print all subjects
        	//System.out.println(name + "\t" + type);
        	if (type.compareTo("app") == 0)
        		listApps.addApp(new OS_Application(name, parent));
        	else
        		listTasksISR.addObj(new OS_Object(name, parent));
        }
		
		//Enter Object
		int nObject = Integer.valueOf(sheet.getCell(0, nSubject+2).getContents().trim()).intValue();
		for (int i=0 ; i<nObject ; i++){
			String name = sheet.getCell(0, i+2+nSubject+2).getContents().trim();
        	String parent = sheet.getCell(2, i+2+nSubject+2).getContents().trim();
        	//Print all object
        	//System.out.println(name + "\t" + parent);
        	listMemoryParts.addMemory(new MemoryParts(name,parent));
		}
		
		//Enter Transition
		int nTransition = Integer.valueOf(sheet.getCell(0, nSubject+2 + nObject+2).getContents().trim()).intValue();
		System.out.println(nTransition);
		for (int i=0 ; i<nTransition ; i++){
			//cellString
			for (int j=0 ; j<nTransition ; j++){
				String cellEvent = sheet.getCell(j+1,i+2+nSubject+2+nObject+2).getContents().trim();	//Dich lai 1 cot
        		String s1name = sheet.getCell(0,i+2+nSubject+2+nObject+2).getContents().trim();
        		String s2name = sheet.getCell(j+1,1+nSubject+2+nObject+2).getContents().trim();	//Dich lai 1 cot
        		//Print cell
	        	//System.out.println(s1name + "\t" + s2name + ":" + cellEvent);
	        	
//        		Object from;
//				if (listApps.getAppByName(s1name) != null) {
//					from = listApps.getAppByName(s1name);
//				}else{
//					from = listTasksISR.getObjByName(s1name);
//				}
//				
//				Object to = listMemoryParts.getMemoryByName(s2name);
				
        		
        		if (cellEvent.compareTo("") == 0){
    				continue;
        		}else {
        			String[] result = cellEvent.split(";");
        			//System.out.println(result.length);
	        		for (int c=0; c<result.length; c++){
	        			String action = "";
	        			String reqNo = "";
	        			String permission = "";
	        			if (result[c].indexOf("[") < 0){
	        				//declare From
	        				action = result[c];
	        				//System.out.println("ONLY contains" + s1name + "\t" + s2name);
	        			}else{
	        				//System.out.println("REQUIREMENT" + s1name + "\t" + s2name);
	        				reqNo = result[c].substring(result[c].indexOf("[") + 1, result[c].indexOf(":"));
	        	    		action = result[c].substring(result[c].indexOf(":") + 1, result[c].indexOf("]"));
	        	    		permission = result[c].substring(result[c].indexOf("]") + 1);
	        			}
	        			//test
	        			//System.out.println(getFromTo(s1name).toString() + "\t" + getFromTo(s2name) + "\t" + action + " - " + reqNo + " - " + permission);
	        			//System.out.println(from.toString() + to.toString() + action + reqNo + permission);
	        			listTransitions.addTrans(new Transition(getFromTo(s1name), getFromTo(s2name), action, reqNo, permission));
	        		}
				}
			}
		}
		
		//listTransitions.printAllTrans();
		listTransitions.printAllRequirement();
	}
	
	public MemoryParts getFromTo(String fromName){
		MemoryParts from;
		//System.out.println(fromName);
		if (listApps.getAppByName(fromName) != null) {
			from = listApps.getAppByName(fromName);
		}else if (listTasksISR.getObjByName(fromName) != null){
			from = listTasksISR.getObjByName(fromName);
		}else{
			from = listMemoryParts.getMemoryByName(fromName);
		}
		
		return from;
	}
	
//	public void getCellInformation(String cell){
//		String action = "";
//		String permission = "";
//		String reqNo = "";
//		String[] result = cell.split(";");
//	    for (int c=0; c<result.length; c++){
//	    	 
//	    	if (result[c].indexOf("[") != -1){
//	    		reqNo = result[c].substring(result[c].indexOf("[") + 1, result[c].indexOf(":"));
//	    		action = result[c].substring(result[c].indexOf(":") + 1, result[c].indexOf("]"));
//	    		permission = result[c].substring(result[c].indexOf("]") + 1);
//	    		
//	    		// setAction(action); setPermission(permission); setReqNo(reqNo);
//	    		System.out.println(reqNo + "\t" + action + "\t" + permission);
//	    	}else{
//	    		action = result[c]);
//	    		System.out.println(getAction());
//	    	}
//	    }
//	}
}
