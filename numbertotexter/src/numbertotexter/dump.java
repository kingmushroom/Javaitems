package numbertotexter;

public class dump {

	public void analyseNumber(int startnumber){
		//if position 2 is number 1, goto teen numbers
		int num1=startnumber%1000;
		
		int num2=num1%100;
		int num3=num1%10;
		int pos2=(num2-num3)/10;//get position 2
		String result;
		if(pos2==1){
			result=forthDigit(startnumber)+thirdDigit(startnumber)+teennumber(num2);
			
			
		}else{
			result=forthDigit(startnumber)+thirdDigit(startnumber)+secondDigit(num2)+firstDigit(startnumber);
		}
		System.out.println(result);
	}
	public String teennumber(int num2){
		int num3=num2%10;
		System.out.println(num3);
		String digit="";
		switch(num3){
		case 0:digit="ten";break;
		case 1:digit="eleven";break;
		case 2:digit="twelve";break;
		case 3:digit="thirteen";break;
		case 4:digit="fourteen";break;
		case 5:digit="fifteen";break;
		case 6:digit="sixteen";break;
		case 7:digit="seventeen";break;
		case 8:digit="eighteen";break;
		case 9:digit="nineteen";break;
	
		}
		return digit;
		
	}
	public String firstDigit(int startnumber){
		int num1=startnumber%1000;
		int num2=num1%100;
		int num3=num2%10;
		
		String digit=digToText(num3);
		
		return digit;
	}
	public String secondDigit(int startnumber){
		int num1=startnumber%1000;
		int num2=num1%100;
		int num3=num1%10;
		int pos2=(num2-num3)/10;
		String digit="";
		switch(pos2){
		
		case 2:digit="twenty ";break;
		case 3:digit="thirty ";break;
		case 4:digit="fourty ";break;
		case 5:digit="fifty ";break;
		case 6:digit="sixty ";break;
		case 7:digit="seventy ";break;
		case 8:digit="eighty ";break;
		case 9:digit="ninety ";break;
	
		
		}
		return digit;
	}
	public String thirdDigit(int startnumber){
		int num1=startnumber%1000;
		int num2=num1%100;
		int num3=num1%10;
		int pos3=(num1-num2)/100;
		System.out.println(pos3);
		String digit=digToText(pos3);
		if(digit!="")
		digit=digit+ " hundred and ";
		return digit;
	}
	private String digToText(int pos3) {
		// TODO Auto-generated method stub
		return null;
	}
	public String forthDigit(int startnumber){
		int num3 = startnumber/1000;
		int num1=startnumber%1000;
		int num2=num1%100;
		int num4=num1%10;
		if(getLength(startnumber)<5)num3=0;
		int pos3=(num1-num2)/100;
		int pos2=(num2-num3)/10;
		System.out.println(pos3+"hh"+pos2);
		String digit=digToText(num3);
		if(digit!=""){digit=digit+" thousand ";
		if((pos3==0)||(pos3 == 0 && pos2==0)){
			digit=digit+"and ";}}
		
		return digit;
	}
	private int getLength(int startnumber) {
		// TODO Auto-generated method stub
		return 0;
	}
}
