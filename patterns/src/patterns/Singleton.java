package patterns;

public class Singleton {
static Singleton S;
int a;
private Singleton(){
	
}
/**
 * Demonstration of singleton pattern. 
 * Class holds a reference to Singleton object
 * the create method will only create a new Singleton if that object is empty
 * it will return the Singleton reference.
 * @return Singleton Object
 */
public static Singleton create(){
	if(S == null){
		S=new Singleton();
	}
	return S;
}
}
