
public class exceptionTester {

	public void divider(int a, int b) throws MikeException{
		if(a<b){
			MikeException mike = new MikeException();
			throw mike;
		}
	}
	
	
	public void divbyzero(){
		try{
			int a=5;
			int b=0;
			//int c=a/b;
			int[] bob=new int[1];
			bob[8]=7;
		}catch(ArithmeticException a){
			System.out.println(a.getCause());
			System.out.println(a.getMessage());
			//a.printStackTrace();
			System.out.println(a.getStackTrace());
			System.out.println(a.getLocalizedMessage());
			System.out.println(a.toString());
		
			System.out.println("No dividing by zero");
			int[] bob=new int[1];
			try{
			//bob[8]=7;
			}catch(ArrayIndexOutOfBoundsException b){
				System.out.println();
				System.out.println(b.getMessage());
				System.out.println("Array out of bounds");
			}
		}catch(ArrayIndexOutOfBoundsException a){
			System.out.println(a.getMessage());
			//System.out.println(a.getCause());
			System.out.println("Array out of bounds");
		}finally{
			System.out.println("You berk");
		}
	}
	
}
