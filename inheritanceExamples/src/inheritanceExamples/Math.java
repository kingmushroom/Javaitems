package inheritanceExamples;

abstract public class Math {

	abstract public int Addition(int a, int b);
	
 abstract public int subtraction(int a, int b);
	
	public void doDrawing(Math m){
		m.Addition(5, 2);
	}
	
	
	
	
}
