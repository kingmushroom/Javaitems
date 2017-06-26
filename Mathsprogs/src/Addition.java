import java.util.Scanner;
public class Addition {
int a;
int b;

public int AddNumbers(int x, int y){
	return x+y;
}
	public static void main(String args[]){
		int a = 0;
		int b = 5;
		Addition adder=new Addition();
		System.out.println(a+b);
		a=a+500;
		System.out.println(a/b);
		Scanner user_input = new Scanner( System.in );
		System.out.print("Enter First number");
		Integer first_num = Integer.parseInt(user_input.next( ));
		
		System.out.print("Enter Second number");
		Integer second_num = Integer.parseInt(user_input.next( ));
		
		System.out.println("Added is "+(first_num + second_num));
		
		System.out.println("Divided is "+(double) first_num / (double) second_num);
		
		System.out.println("Multiplied is "+(first_num * second_num));
		
		System.out.println("Subbed is "+(first_num - second_num));
		
		System.out.println("This is the 5th one"+((first_num - second_num)*first_num));
		System.out.println(adder.AddNumbers(5,5));
		
		for(int x=5;x<10;x++){
			adder.AddNumbers(1, x);
			System.out.println(x);
		}
		user_input.close();
	}
	
}
