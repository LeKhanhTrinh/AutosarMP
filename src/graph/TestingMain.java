package graph;

import components.AllComponents;
import components.OS_Application;

public class TestingMain {

	public static void main(String[] args){
		try {
			AllComponents inputComponents = new AllComponents("Accession.xls");
			FiniteStateMachine theFSM = new FiniteStateMachine("My FSM", inputComponents.getListOSObject(), inputComponents.getListTransitions(), 
						inputComponents.getListOSObject().getObjectByName("System"), inputComponents.getListMemoryParts());
			GeneratingTestPaths test = new GeneratingTestPaths(theFSM);
			test.automatedGeneratingTestPath();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
