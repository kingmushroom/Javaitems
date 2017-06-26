package patterns;
/**
 * Basic factory, constructor is private so can't be called
 * create method calls constructor and returns object
 * @author Administrator
 *
 */
public class basicFctory {
	static int counter=0;
	String name;
	private basicFctory(){
		
	}
	
	public static basicFctory create(){
		basicFctory F = new basicFctory();
		F.name="Factory number: " + counter; //this section gives each object a unique name, for purposes of testing
		counter++;
		return F;
	}
	public void doStuff(){
		System.out.println(this);
	}
}
