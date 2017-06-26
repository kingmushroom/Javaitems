package staticInitialiser;

public class DoThings {

	public static void main(String[] args) {
		/* TODO Auto-generated method stub
		*This block represents why the static initialisation is necessary. The bank class 
		*Sets up dollar within its constructor
		*meaning that if we create a new bank after having manually set dollar
		*that it is reset as per the constructor.
		*We need something that will set up dollar the very first time it's used and then never again.
		*/
Bank Natwest=new Bank();
System.out.println("Bank");
System.out.println("Initial Dollar value: "+Bank.dollar);
Natwest.setDollar(666);
System.out.println("After setting value: "+Bank.dollar);
Bank HSBC=new Bank();
System.out.println("After creating new bank: "+Bank.dollar);
System.out.println();
/*
 * Bank2 makes use of static initialisation, so the calculation to initialise dollar
 * is only done once, this time when we make HSBC it has no effect on the dollar value;
 */
Bank2 Natwest2=new Bank2();
System.out.println("Bank2");
System.out.println("Initial Dollar value: "+Bank2.dollar);
Natwest2.setDollar(666);
System.out.println("After setting value: "+Bank2.dollar);
Bank2 HSBC2=new Bank2();
System.out.println("After creating new bank: "+Bank2.dollar);
System.out.println();
/*
 * Bank3 does a similar thing to static initialisation, ensuring that dollar will only be set the first time it is run.
 */
Bank3 Natwest3=new Bank3();
System.out.println("Bank3");
System.out.println("Initial Dollar value: "+Bank3.dollar);
Natwest3.setDollar(666);
System.out.println("After setting value: "+Bank3.dollar);
Bank3 HSBC3=new Bank3();
System.out.println("After creating new bank: "+Bank3.dollar);
System.out.println();
	}

}
