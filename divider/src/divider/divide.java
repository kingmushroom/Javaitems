package divider;

import java.lang.Character.Subset;

public class divide {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
Double a=0.0,b=0.0,c=0.0;
try{
a=Double.parseDouble(args[0]);
b=Double.parseDouble(args[1]);
c=a/b;
System.out.println("Result: "+ c);
}catch(ArrayIndexOutOfBoundsException x){
	System.out.println("need more arguments");
}
catch(ArithmeticException x){
	System.out.println("don't divide by zero");
}
catch(NumberFormatException x){
	System.out.println("can only divide numbers");
}catch(Exception x){
	System.out.println("can only divide numbers");
}
finally{
	System.out.println("Take some time to think about it, then try again");
	String waiter=".";
	for(int a2=0; a2<100;a2++){
		System.out.println(waiter);
		waiter=waiter+".";
		Thread.sleep(50);
	}
	Thread.sleep(20);
	System.out.println("Now you can try");
}
	}
	public static void michael() throws InterruptedException{
		System.out.println();
		String waiter=".";
		for(int a2=0; a2<50;a2++){
			System.out.println(waiter);
			waiter=waiter+".";
			Thread.sleep(50);
		}
		System.out.println("------------------------MIKE----------------------");
		for(int a3=0; a3<50;a3++){
			System.out.println(waiter);
			if(waiter.length()<2)
			waiter=waiter.substring(0, (waiter.length()-2));
			Thread.sleep(50);
		}
	}

}
