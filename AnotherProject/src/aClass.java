import java.util.Scanner;

public class aClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		maths3 bob = new maths3();
		System.out.println("Add 4 and 5 = "+bob.add(4, 5));
		System.out.println("Subtract 9 from 6 = "+bob.subtract(6, 9));
		System.out.println("Multiply 2 by 2 = "+bob.multi(2, 2));
		System.out.println("Divide 4 by 2 = "+bob.divide(4, 2));
		Scanner scan = new Scanner(System.in);
		boolean t=false;
		while(t==false){
			
			
			int num=0;
			System.out.println("Mikes Calc, enter selection: \n 1 - Add \n 2 - Subtract \n 3 - Multiply \n 4 - Divide\n 5 - QUIT");
			if(scan.hasNextInt()){
			num = scan.nextInt();
			}
			switch (num){
			case 1: CallAdd(bob,scan);
				break;
			case 2: CallSub(bob,scan);
				break;
			case 3: CallMul(bob,scan);
				break;
			case 4: CallDiv(bob,scan);
				break;
			case 5:
				System.out.println("Bye Bye"); 
				t=true;
				break;
			}
				
		}
		
		scan.close();
		
		
		
	}
	public static void CallAdd(maths3 bob,Scanner scan){
		int num1=0,num2=0;
		System.out.println("Enter first Number");
		if(scan.hasNextInt()){
		num1 = scan.nextInt();
		}System.out.println("Enter Second Number");
		if(scan.hasNextInt()){
		num2 = scan.nextInt();
		}
		System.out.println("Add:"+num1+" and "+num2+ " - Answer = " +bob.add(num1, num2));
	}
	public static void CallSub(maths3 bob,Scanner scan){
		int num1=0,num2=0;
		System.out.println("Enter first Number");
		if(scan.hasNextInt()){
		num1 = scan.nextInt();
		}System.out.println("Enter Second Number");
		if(scan.hasNextInt()){
		num2 = scan.nextInt();
		}
		System.out.println("Subtract:"+num1+" and "+num2+ " - Answer = " +bob.subtract(num1, num2));
	}
	public static void CallMul(maths3 bob,Scanner scan){
		int num1=0,num2=0;
		System.out.println("Enter first Number");
		if(scan.hasNextInt()){
		num1 = scan.nextInt();
		}System.out.println("Enter Second Number");
		if(scan.hasNextInt()){
		num2 = scan.nextInt();
		}
		System.out.println("Multi:"+num1+" and "+num2+ " - Answer = " +bob.multi(num1, num2));
	}
	public static void CallDiv(maths3 bob,Scanner scan){
		float num1=0,num2=0;
		System.out.println("Enter first Number");
		if(scan.hasNextFloat()){
		num1 = scan.nextFloat();
		}System.out.println("Enter Second Number");
		if(scan.hasNextFloat()){
		num2 = scan.nextFloat();
		}
		System.out.println("Divide:"+num1+" and "+num2+ " - Answer = " +bob.divide(num1, num2));
	}
}
