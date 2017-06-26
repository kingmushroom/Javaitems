package familial;

public class Two extends One {

	public Two(){
		//One doesnt have a constructor that doesn't take a parameter, so we have to specify which constructor to use with super.
		//Otherwise there would be an error as One() would be called when it doesn't exist(no default constructor because other constructors have been specified..
		super(5,6);
		System.out.println("a");
	}
	
	public Two(int a){
		super(a);
		System.out.println("b");
	}
	
}
