package staticInitialiser;

public class Bank3 {
static int dollar=-1;
/*
 * Bank3 is my own implementation of static initialisation. 
 * The static dollar is initialised to -1. 
 * A if statement in the constructor checks whether dollar is over zero before doing the initialisation of dollar.
 */
public Bank3(){
	if(dollar<0){
	dollar=6*6*6;
	}
}
public void setDollar(int a){
	dollar=a;
}
}
