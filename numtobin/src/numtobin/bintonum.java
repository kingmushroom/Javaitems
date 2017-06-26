package numtobin;
public class bintonum {
//String bin="00101001";
public int binconverter(String bin){
	bin=reversal(bin);
String[] NumArray = bin.split("");
int BinValue=1;
int total=0;
for (String num : NumArray) {
	total+= BinValue*Integer.parseInt(num);
			BinValue*=2;
}
	return total;
}
public String reversal(String word){
	String backword="";
	   for (int i = (word.length() - 1); i >= 0; i--) {
	        backword=backword+word.charAt(i);
	    }
	   return backword;
}
}
