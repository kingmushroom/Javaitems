
public class ifexample{
	
public static void main(String x[]){
	int a = 1501;
	if(a>2000){
		System.out.println("a");
		if(a>5000){
			System.out.println("c");
		}else{
			System.out.println("d");
		}System.out.println("e");
	}else{
		System.out.println("b");
		if(a>1500)System.out.println("2");
	}
	
	System.out.println("----\n");
	
	int no =4900;
	if(no>4000){
		System.out.println("a");
		no=no+100;
		if(no>5000){
			System.out.println("b");
			System.out.println("c");
		}else{
			System.out.println("d");
		}
		System.out.println("e");
	}else{
		no=no+1000;
		System.out.println("f");
		System.out.println("g");
		if(no<500){System.out.println("j");}
		else{
			System.out.println("h");
			System.out.println("i");
		}
		System.out.println("k");
		
		}
	System.out.println("l");
	}
	
	
	
	
}


