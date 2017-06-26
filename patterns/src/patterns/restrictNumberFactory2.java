package patterns;

import java.util.Random;

/**
 * Second approach combines singleton method with it.
 * Instead of a reference to the object, this class holds an array of 3 references to the object.
 * create method checks to see if it has already filled this array, if so returns the most recent
 * @author Administrator
 *
 */
public class restrictNumberFactory2 {
	static private restrictNumberFactory2[] myObjects =new restrictNumberFactory2[3];
	static private int counter=0;
	
private restrictNumberFactory2(){
		System.out.println("New restrict number factory created");
	}
	public static restrictNumberFactory2 create(){
		restrictNumberFactory2 F=null;
		Boolean maxreached=true;
		for(int a=0;a<3;a++){
			if(myObjects[a]==null){
				maxreached=false;
			}
		}
	if(!maxreached){
		F = new restrictNumberFactory2();
		myObjects[counter]=F;
		counter++;
	}else{
		System.out.println("Max objects reached, returning most recent");
			Random ran = new Random();//This section gives a random number between 0 and 3
			int index=ran.nextInt(3);//Enabling the system to send one of the three factories
			System.out.println(index);//Instead of just the most recent
		F = myObjects[counter-1];
			F = myObjects[index];//
	}
	
		return F;
	}
	public void doStuff(){
		System.out.println(this);
	}
}
