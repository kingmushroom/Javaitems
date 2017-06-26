package staticInitialiser;
/*
 * Bank2 makes use of static initialisation, so the calculation to initialise dollar
 * is only done once(the first time the class is used). Making new banks after this point will make no difference to dollar price.
 */
public class Bank2 {
static int dollar;
static{
	dollar=6*6*6;
}
public void setDollar(int a){
	dollar=a;
}
}
