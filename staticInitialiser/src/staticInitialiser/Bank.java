package staticInitialiser;

public class Bank {
static int dollar;
/*
 * The bank class 
*Sets up dollar within its constructor
*meaning that if we create a new bank after having manually set dollar
*that it is reset as per the constructor.
 */
public Bank(){
	dollar=6*6*6;
}
public void setDollar(int a){
	dollar=a;
}
}
