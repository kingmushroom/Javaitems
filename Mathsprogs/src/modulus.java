import java.util.LinkedList;

public class modulus {
	public static void main(String x[]) {
		int no, num1, num2;
		no = 123456789;
		num1 = no / 10;
		num2 = no % 10;
		// System.out.println(num1+num2);

		int new1, new2, new3;
		new1 = no / 100;
		int new4 = no / 10;
		new2 = new4 % 10;
		new3 = no % 10;
		System.out.println(new1 + new2 + new3);

		String pieces[] = Integer.toString(no).split("");
		int totalcounter = 0;
		for (String f : pieces) {
			totalcounter += Integer.parseInt(f);
		}
		System.out.println("total for " + no + " = " + totalcounter);

		int number = 123456; // = and int
		LinkedList<Integer> stack = new LinkedList<Integer>();
		while (number > 0) {
			stack.push(number % 10);
			number = number / 10;
		}
		int total = 0;
		while (!stack.isEmpty()) {
			total = total + stack.pop();
		}
		System.out.println("total for " + 123456 + " = " + total);
	}

	public void print(String message) {
		System.out.println(message);
	}
}
