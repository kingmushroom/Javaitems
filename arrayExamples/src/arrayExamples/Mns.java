package arrayExamples;

public class Mns {
private Object[] theStack;
public Mns(int Size){
	stacksize=Size;
theStack=new Object[Size];
}
public int stacksize;
public int nextIndex=0;

	

	public int remove(Object o) {
		return nextIndex;
		
		
	}
public Object peek(){
	return  theStack[nextIndex-1];
	
}
public void push(Object item){
	add(item);
	
}
public void viewStack(){
	for(int i=0;i<theStack.length;i++){
		System.out.println(i+" - "+theStack[i]);
	}
}
public int largestItem(){
	int size=0;
	for(int i=0;i<theStack.length;i++){
		if(theStack[i]!=null){
		if(theStack[i].toString().length()>size){
			size=theStack[i].toString().length();
		}
	}}
	return size;
}
public void drawStack(){
	if(nextIndex>0){
	//for(int i=0;i<theStack.length;i++){
		System.out.println("        _ ");
		System.out.println("    /\\ |-|");
		System.out.println("   /XX\\| |");
		System.out.println("  /XXXX\\ |");
		System.out.println(" /XXXXXX\\ ");
		System.out.println("/XXXXXXXX\\ ");
		for(int a=0;a<largestItem()+2;a++){
			//System.out.println("Largest item is:"+largestItem());
			
			
		}
		String element="";
		for(Object o:theStack){
			element = (String) o;
			if(element!=null){
			for(int b=element.length();b<largestItem();b++){
				element=element+" ";
				
			}
			System.out.println("|"+element+"|");
		}}
		
	}else{
		System.out.println("nothing in stack");
	}
}
public void add(Object item){
	theStack[nextIndex]=item;
	nextIndex++;
	
}
public Object pop(){
	Object returnt = "Stack is empty";
	//System.out.println("Length "+theStack.length);
	if(nextIndex>0){
		returnt = theStack[nextIndex-1];
		theStack[nextIndex-1]=null;
		nextIndex-=1;
		}
	
		return returnt;
}
public int length(){
	int counter=0;

	for(int a=0;a<stacksize;a++){
		if(theStack[a]!=null)counter++;
}
	return counter;
}	
	public void clear() {
	for(int i=0;i<theStack.length;i++){
		theStack[i]=null;
	}
		nextIndex=0;
	}

}
