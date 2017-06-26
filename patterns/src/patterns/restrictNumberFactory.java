package patterns;
/**
 * Extension to simple factory
 * The use of a counter means that only three can be created.
 * @author Administrator
 *
 */
public class restrictNumberFactory {
	static private int counter=0;
	
private restrictNumberFactory(){
		System.out.println("New restrict number factory created");
	}
	public static restrictNumberFactory create(){
		restrictNumberFactory F=null;
		if(counter<3){
		F = new restrictNumberFactory();
		counter++;
		}else{
			System.out.println("Maximum objects reached ("+counter+")");
		}
		return F;
	}
	public void doStuff(){
		System.out.println(this);
	}
}
