
public class markstester {
	public static void main(String args[]){
		results peter,smith;
		peter=new results();
		smith=new results();
		
		
		peter.physics(15);
		peter.chemistry(15);
		peter.maths(15);
		
	peter.showResults();
	System.out.println("\n");
	peter.physics(150);
	peter.chemistry(15);
	peter.maths(15);
	peter.showResults();
	System.out.println("\n");
	peter.physics(150);
	peter.chemistry(150);
	peter.maths(15);
	peter.showResults();
	System.out.println("\n");
	peter.physics(150);
	peter.chemistry(150);
	peter.maths(150);
	peter.showResults();
	System.out.println("\n Finally, invalid inputs:");
	
	peter.physics(-1);
	peter.chemistry(-150);
	peter.maths(-150);
	peter.showResults();
	
	peter.user_input.close();
	}
}
