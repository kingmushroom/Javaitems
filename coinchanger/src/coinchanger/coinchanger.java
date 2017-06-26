package coinchanger;
import java.util.Scanner;
import java.io.Console;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class coinchanger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> output = new ArrayList<String>();
		double amounttendered = 32515;
		double coinvalues[] = { 50, 20, 10, 5, 2, 1, 0.5, 0.2, 0.1, 0.05, 0.02, 0.01 };
	//	double num=0;
		//DataInputStream dis = new DataInputStream(System.in);
		System.out.println("Enter amount tendered");
		// while(dis.available()>0) { num=  dis.readDouble();}
		 
		Scanner scan = new Scanner(System.in);
		
		double num = scan.nextDouble();
		amounttendered=num;
		System.out.println(num);
		for (double v : coinvalues) {

			if (v <= amounttendered) {
				if ((amounttendered - v) >= v) {
					int divide = (int) (amounttendered / v);
					String coinamount;
					coinamount=formatcoins(v);
					output.add("Demonination: " + coinamount + " x " + divide);
					amounttendered -= v*divide;
				} else {
					String coinamount;
					coinamount=formatcoins(v);
					amounttendered -= v;
					output.add("Demonination: " + coinamount + " x 1");
				}
				
			}
		}
		for (String x : output) {
			System.out.println(x);
		}
	}
	
	public static String formatcoins(double v){
		String coinamount;
		if(v<1){
			coinamount = Double.toString(v)+"p";
		}else{
			int g = (int) v;
			coinamount= "£"+Integer.toString(g);
			
		}	
		return coinamount;
				}
}
