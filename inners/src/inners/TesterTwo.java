package inners;

public class TesterTwo {

	
	public void doThat(){
		this.new test3().doThis();
	}
	public static void main(String args[]){
		TesterTwo t2 = new TesterTwo();
		t2.doThat();
		in bob = new in(){

			public void doThis() {
				System.out.println("Not Mike");
				
			}
			
		};
		bob.doThis();
	}
	private class test3 implements in{
		

	@Override
	public
	 void doThis() {
		// TODO Auto-generated method stub
		System.out.println("Mike");
	}
	}
}
