package numtobin;

public class numtobinfunc {

	public String convertNum(int num){
		String Bin="";
			int a=num;
			while(a>1){
				Bin=(a%2)+ Bin;
				a=a/2;
				}
			if(a==1)Bin="1"+Bin;
			//Bin=reversal(Bin);
			
while(Bin.length()<8){
				Bin="0"+Bin;
						}
			return Bin;
	}
	public String reversal(String word){
		String backword="";
		   for (int i = (word.length() - 1); i >= 0; i--) {
		        backword=backword+word.charAt(i);
		    }
		   return backword;
	}
	public String convertChar(char Char){
		String bin="";
		bin=convertNum((int) Char);
		return bin;
	}
	public String convertWords(String word){
		String bin=word+" In Binary is ";
		char[] stringToCharArray = word.toCharArray();
		for (char output : stringToCharArray) {
			bin=bin+" "+convertChar(output);
		}
		return bin;
	}
}
