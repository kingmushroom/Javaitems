
public class Bank {

	static int dollar=4;
	int LocalRate;
	int x;
	public Bank(){
		this("mike","isawesome");
		System.out.println("no params");
		
	}
	public Bank(String param){
		
		System.out.println(param);
	}
	public Bank(String param, String param2){
		this(param+param2);
	}
	public static void setDollar(int a){
		dollar=a;
	new Bank().dollarRate();
	}
	public void convertMoney(int m){
		System.out.println(dollar*m);
	}
	public void dollarRate(){
		System.out.println("Dollars: "+dollar);
	
	}
	public void test(){
		System.out.println("B soc");
	
	}
	public void test(String bob){
		System.out.println(bob);
	}
	public void test(int bob){
		System.out.println(bob*2);
	}
	public void test(Object bob){
		System.out.println(bob+"mike");
	}
	/**
	 * @author CaptainMike
	 * @param bob
	 * @param bobb
	 * @param bobc
	 * {@link}
	 */
	public void test(String bob,String bobb,String bobc){
		
		System.out.println(bob+bobb+bobc);
		test(bob);
	}
	
}
