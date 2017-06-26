package numtobin;

public class doIt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
numtobinfunc boris = new numtobinfunc();
convertBin("01000010");
//System.out.println(bert.binconverter("11100111"));
System.out.println("65 in Binary is "+boris.convertNum(65));
//System.out.println(boris.convertChar('t'));
System.out.println(boris.convertWords("B"));
	}
	public static void convertBin(String bin){
		bintonum bert=new bintonum();
		System.out.println(bin+" in decimal is: "+bert.binconverter(bin)+"\n as a character it is: "+(char)bert.binconverter(bin)+"\n");
	}

}
