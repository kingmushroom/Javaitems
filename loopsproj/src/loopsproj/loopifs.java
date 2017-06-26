package loopsproj;

public class loopifs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
wierdCounter();
		
		
		
		//int a=1;
	//	do
	//	{
		//	System.out.println(a);
		//	if(a%2==0){
				//true
		//		System.out.println("even");
		//		if(a>5){System.out.println("-");}else{System.out.println("*");}
		//	}else{
		//		System.out.println("odd");
		//		if(a>5){System.out.println("!");}else{System.out.println("?");}
		//	}
		//	a++;
			
			
	//	}while(a<10);
		
		//int b;
		//int a=1;
		//do{
		//b=1;
	//	do{
	//	System.out.println(b);
	//		b++;
	//	}while(b<=10);
	//	a++;
	//	}while(a<=10);
		
		
		
		
		
		
		
		
	}
	
	
public static void wierdCounter(){
	int b;
	String c="";
	for(int a=1;a<20;a++){
		if(a%2==0){
			System.out.println(a);
		}else{
			c="";
			for(b=1;b<=a;b++){
				c=c+b;
			}
			System.out.println(c);
		}
	}
}
}
