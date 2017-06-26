package inheritanceExamples;


public class Math2 extends Math{
	public int number=8;
	
	public float Division(float a, float b){
		float c=0;
		if(b>0){
		c=a/b;}else{System.out.println("Naughty, no dividing by zero");}
		return c;
	}
	public int Addition(int a,int b){
		
		
		System.out.println("The result of addition is: "+ a+b);
		
		return a+b;
	}
	public void showChars(){
		String output="";
		int counter=1;
		for(int a=0;a<300;a++){
			output=output+a+"="+(char) a+" ";
			counter++;
			if(counter>3){
				counter=0;
				output=output+"\n";
				
			}
		}
		System.out.println(output);
	}
	@Override
	public int subtraction(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}
	
}
