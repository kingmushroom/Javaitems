package arrayExamples;

import java.util.HashMap;
import java.util.Map;

public class map {
static HashMap<String,String> myMap = new HashMap();
public static void main(String args[]){
	doStuff();
	
	
}
public static void doStuff(){
	myMap.put("Mike", "Is Awesome");
	System.out.println(myMap.get("Mike"));
}
}
