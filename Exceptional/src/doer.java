
public class doer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
exceptionTester tester=new exceptionTester();
//tester.divbyzero();
try {
	tester.divider(3, 5);
} catch (MikeException e) {
	System.out.println("NO");
	System.out.println("BAD");
	System.out.println("First number should be higher than second");
}
	}

}
