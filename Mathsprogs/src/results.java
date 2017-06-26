import java.util.Scanner;

import java.io.*;
import java.lang.*;


public class results {
private int phy,che,mat= -1;
float total, per;
public Scanner user_input = new Scanner(System.in);
private void calculations(){
	total = phy+che+mat;
	per=(total*100)/450;
}
public float individualPercentage(int mark){
	float percentage = ((float) mark*100)/150;
	return percentage;
}
boolean validateNumbers(Object input){
boolean text = false;
try{}
catch (NullPointerException e) {
String[] inputarray = input.toString().split(null);
for(String s:inputarray){
	char c = s.charAt(0);
	print("c");
	if(Character.isDigit(c)){
		
	}else{
		text = true;
	}
}}
return text;
}
public void enterMarks(){
	print("enter physics mark");
	if(user_input.hasNext()){
		Object physics = user_input.next();
		validateNumbers(physics);
	physics(user_input.nextInt( ));}
	print("enter chemistry mark");
	if(user_input.hasNext()){
	chemistry(user_input.nextInt( ));}
	print("enter maths mark");
	if(user_input.hasNext()){
	maths(user_input.nextInt( ));}
	
	showResults();
}

	public void showResults(){
		if(phy==-1||che==-1||mat==-1){
			print("Don't have all the marks, will not display results. Please input marks");
			enterMarks();
		}else{
		calculations();
		int passcount = 0;
		if(individualPercentage(phy)>=70){
			passcount++;
		}else print("failed physics");
		if(individualPercentage(che)>=70){
			passcount++;
		}else print("failed chemistry");
		if(individualPercentage(mat)>=70){
			passcount++;
		}else print("failed maths");
		
		
		switch(passcount) {
		case 2:
			print("retake exam");
			break;
		case 1:
			print("Repeat the course");
			break;
		case 0:
			print("Go Home");
			break;
		default:
			print("Total score = "+total);
		print("Percentage = "+per);
		}
		
	if(per<70)print("MacDonalds!!!!!!");
		}
	}
	
	public void print(String message){
		System.out.println(message);
	}
	
	public void physics(int mark){
		mark = validateMarks(mark);
		phy=mark;
		}
	
	public void chemistry(int mark){
		mark = validateMarks(mark);
		
		che=mark;
		
	}
	public int validateMarks(int mark){
		boolean valid=false;
		StackTraceElement[] stack = Thread.currentThread().getStackTrace();
		
		while(!valid){
			
		if(!(mark>=0 && mark<=150)){
			
			System.out.println("Invalid Mark, please input again ( "+stack[2]+" ) - or skip with '-1'");
			
			if(user_input.hasNext()){
			String marks = user_input.next( );
			//if(validateNumbers(marks)){ mark = Integer.parseInt(marks);
			mark = Integer.parseInt(marks);
			}//}
			if((int) mark==-1)break;
			
		}else{valid=true;} 
		}
		
		return mark;
		
		}
	public void maths(int mark){
		mark = validateMarks(mark);
		mat=mark;
	
	}
	
}



