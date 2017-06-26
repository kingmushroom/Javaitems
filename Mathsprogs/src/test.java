
public class test {
	ONE one= new ONE();
	public static void main(String args[]){
		test mike = new test();
		mike.one.sayHello("finally");
		
	
	}
	public class ONE{
		int a=50;
		String string = "Argh";
	
		
		public void sayHello(String message){
			System.out.println(message);
		}
	}


}
	

