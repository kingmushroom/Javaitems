package inners;

public class Tester {
	static int fixed; //set once
	static Tester michael;
	static Mike mike;

static{
	fixed=400;
	michael=new Tester();
	
	
	
}

public static void main(String args[]){
	//Tester mikee = new Tester();
	//michael = mikee;
	mike = makeMike();
	mike.greeting();
}
public static Mike makeMike(){
	michael = new Tester();
	Mike mikee = michael.new Mike();
	return mikee;
	
}
class Mike{
	public void greeting(){
		System.out.println("Hello from Mike");
	}
}

}