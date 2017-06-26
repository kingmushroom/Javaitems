package numbertotexter;

public class numbertoText {
	public int startnumber;

	public numbertoText() {
		//startnumber = 5004;
		//System.out.println(getLength(startnumber));
	}

	public int getLength(int thnum) {
		int length = (int) (Math.log10(thnum) + 1);
		return length;

	}

	public String analyse(int startnumberer) {
		startnumber=startnumberer;
		String digit = "";
		switch (getLength(startnumber)) {
		case 1:
			digit = digit + OneDigit(startnumber);
			break;
		case 2:
			digit = digit + TwoDigit(startnumber);
			break;
		case 3:
			digit = digit + ThreeDigit(startnumber);
			break;
		case 4:
			digit = digit + fourDigit(startnumber);
			break;
		}
		return digit;
	}

	public String OneDigit(int startnumber) {
		String digit = digToText(startnumber);
		return digit;
	}

	public String TwoDigit(int startnumber) {
		String digit = "";

		int pos2 = (startnumber % 100);
		int tnddigit = (pos2 - startnumber % 10) / 10;
	//System.out.println(pos2);
		if (tnddigit == 1) {
			digit = teen(pos2);

		} else {
			digit = notTeen(pos2) + OneDigit(pos2 % 10);
		}
		return digit;
	}

	public String ThreeDigit(int startnumber) {
		String digit;
		int num1 = startnumber % 1000;
		int num2 = num1 % 100;
		int num3 = num1 % 10;
		int pos3 = (num1 - num2) / 100;
		int pos2 = (num2 - num3) / 10;
		int pos1 = (pos2 / 10);
	//System.out.println(num3);
		digit = digToText(pos3);
		if (pos3 != 0)
			digit = digit + " Hundred ";
		if ((pos2!=0 && num3!=0)||(pos2!=0 && num3==0)||(pos2==0 && num3!=0)){        digit=digit+ "and ";} 
		//if(pos2==0 && num3>0) digit=digit+"and ";
		digit = digit + TwoDigit(startnumber % 100);
		return digit;
	}

	public String fourDigit(int startnumber) {
		String digit = "";
		int num3 = startnumber / 1000;
		int num1 = startnumber % 1000;
		int num2 = num1 % 100;
		int num4 = num1 % 10;
		int pos3 = (num1 - num2) / 100;
		int pos2 = (num2 - num3) / 10;
	//	System.out.println(pos3 + "hh" + pos2);
		digit = digToText(num3);
		if (digit != "") {
			digit = digit + " thousand ";
			if ((pos3 == 0) || (pos3 == 0 && pos2 == 0)) {
				digit = digit + "and ";
			}
		}
		digit = digit + ThreeDigit(startnumber % 1000);
		return digit;
	}

	public String teen(int num) {
		String digit = "";
		int num3 = (num % 10);
		switch (num3) {
		case 0:
			digit = "ten";
			break;
		case 1:
			digit = "eleven";
			break;
		case 2:
			digit = "twelve";
			break;
		case 3:
			digit = "thirteen";
			break;
		case 4:
			digit = "fourteen";
			break;
		case 5:
			digit = "fifteen";
			break;
		case 6:
			digit = "sixteen";
			break;
		case 7:
			digit = "seventeen";
			break;
		case 8:
			digit = "eighteen";
			break;
		case 9:
			digit = "nineteen";
			break;

		}
		return digit;
	}

	public String notTeen(int num) {
		String digit = "";
		int pos2 = (num - num % 10) / 10;
		switch (pos2) {

		case 2:
			digit = "twenty ";
			break;
		case 3:
			digit = "thirty ";
			break;
		case 4:
			digit = "fourty ";
			break;
		case 5:
			digit = "fifty ";
			break;
		case 6:
			digit = "sixty ";
			break;
		case 7:
			digit = "seventy ";
			break;
		case 8:
			digit = "eighty ";
			break;
		case 9:
			digit = "ninety ";
			break;

		}
		return digit;
		// return digit;
	}

	public String digToText(int startnumber) {
		String digit = "";
		switch (startnumber) {
		
		case 1:
			digit = "one";
			break;
		case 2:
			digit = "two";
			break;
		case 3:
			digit = "three";
			break;
		case 4:
			digit = "four";
			break;
		case 5:
			digit = "five";
			break;
		case 6:
			digit = "six";
			break;
		case 7:
			digit = "seven";
			break;
		case 8:
			digit = "eight";
			break;
		case 9:
			digit = "nine";
			break;

		}
		return digit;
	}

}