package graph;
import components.ListTransition;
import components.Transition;

public class ArrayTransList {

	Transition[] arrayTrans;
	
	public ArrayTransList(ListTransition listTrans){
		arrayTrans = new Transition[listTrans.getSize()];
		for (int i=0 ; i<listTrans.getSize() ; i++){
			arrayTrans[i] = listTrans.getTransByIndex(i);
		}
	}
	
	public Transition[] getArrayTrans() {
		return arrayTrans;
	}

//	public Transition[] getTransitionOfFrom(String name){
//		Transition[] rs = new Transition[100];
//		for (int i=0 ; i<arrayTrans.length ; i++){
//			if ()
//		}
//	}
	
	public void setArrayTrans(Transition[] arrayTrans) {
		this.arrayTrans = arrayTrans;
	}

	public void Add(Transition element){
		//arrList.add(element);
		Transition[] newTransArr = new Transition[arrayTrans.length + 1];
		for (int i=0 ; i<arrayTrans.length ; i++)
			newTransArr[i] = arrayTrans[i];
		newTransArr[arrayTrans.length] = element;
		arrayTrans = newTransArr;
	}
	
	public void RemoveHead(){
		for (int i=1 ; i<arrayTrans.length ; i++){
			arrayTrans[i-1] = arrayTrans[i];
		}
		arrayTrans[arrayTrans.length-1] = null;
	}
	
	public boolean IsEmpty(){
		return arrayTrans.length == 0;
	}
	
	public void printAll(){
		for (int i=0 ; i<arrayTrans.length ; i++)
			System.out.println(i + "\t" + arrayTrans[i].toString());
	}
	
	public int getSize(){
		return arrayTrans.length;
	}
	
	public Transition getByIndex(int i){
		return arrayTrans[i];
	}
}
