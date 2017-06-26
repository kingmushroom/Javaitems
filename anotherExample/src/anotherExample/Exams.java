package anotherExample;

public class Exams {
int phy;
int che;
int mat;
double total;
double per;


public void calc(){
	total=phy+che+mat;
}
public float individualPercentage(int mark){
	float percentage = ((float) mark*100)/150;
	return percentage;
}
public void showResults(){
	if(phy==-1||che==-1||mat==-1){
		System.out.println("Don't have all the marks, will not display results. Please input marks");
		//enterMarks();
	}else{
	calc();
	int passcount = 0;
	if(individualPercentage(phy)>=70){
		passcount++;
	}else System.out.println("failed physics");
	if(individualPercentage(che)>=70){
		passcount++;
	}else System.out.println("failed chemistry");
	if(individualPercentage(mat)>=70){
		passcount++;
	}else System.out.println("failed maths");
	
	
	switch(passcount) {
	case 2:
		System.out.println("retake exam");
		break;
	case 1:
		System.out.println("Repeat the course");
		break;
	case 0:
		System.out.println("Go Home");
		break;
	default:
		System.out.println("Total score = "+total);
		System.out.println("Percentage = "+per);
	}
	
if(per<70)System.out.println("MacDonalds!!!!!!");
	}
}
public int getPhy() {
	return phy;
}
public void setPhy(int phy) {
	this.phy = phy;
}
public int getChe() {
	return che;
}
public void setChe(int che) {
	this.che = che;
}
public int getMat() {
	return mat;
}
public void setMat(int mat) {
	this.mat = mat;
}
}
