package substringer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class functions {

	public void subber(String string){
		for(int a=0;a<string.length();a++)System.out.println(string.substring(a, a+1));
	}
	public void wordCounter(String sentence){
		int counter=1;
		for(String g:sentence.split("")){
			if(g.contains(" "))counter++;}
		System.out.println("There are "+counter+" words");
	}
	public void wordCounter2(String sentence){
		int counter=1;
		for(int a=0;a<sentence.length();a++){
			if((sentence.substring(a, a+1).equals(" "))&&!(sentence.substring(a+1, a+2).equals(" ")))counter++;}
		System.out.println("There are "+counter+" words");
	}
	public void wordCounter3(String sentence){
		int counter=1;
		String sent="";
		for(int a=0;a<sentence.length();a++){
			if((sentence.charAt(a) == (char)' ')&&(sentence.charAt(a+1) != (char)' ')){
				
			sent="\n"+sent;
			}else{
				sent=sentence.substring(a, a+1)+sent;
			}}
		System.out.println(sent);
	}
	public void wordReverser(String sentence){
		List<String> words=new ArrayList<String>();
		String thisword ="";
		for(int a=0;a<sentence.length();a++){
		thisword=thisword+sentence.charAt(a);
		if((sentence.charAt(a) == (char)' ')&&(sentence.charAt(a+1) != (char)' ')){
				words.add(thisword+"\n");
				thisword="";
			}
			}words.add(thisword);
			String newsentence="";
		for(String out:words){
			newsentence=out+newsentence;
		}
		System.out.println(newsentence);
	}
	
	
	public void wordReverser2(String sentence){
		String[] words=sentence.split(" ");
		for (int i = words.length-1; i > 0; i--){
			System.out.println(words[i]);
		}
	}
	public void wordSearcher(String sentence,String word, String rep){
		int wordCounter=0;
		String positions="";
		String wordString = "";
		String outputSentence=" ";
		int wordSize=word.length();//length of search term
		for(int a=0;a<sentence.length();a++){
			
			//build wordstring by taking a letter at a time until we have a string as large as the search word
			wordString=wordString+sentence.substring(a, a+1);
			//once the wordstring is correct length
			if(wordString.length()==wordSize){
				//check this wordString against searchword
				if(wordString.equals(word)){
					wordCounter++;
					positions=positions+a+", ";
					
					outputSentence = outputSentence.substring(0, (outputSentence.length()-(word.length()-1)));
					outputSentence=outputSentence+rep;
					//for(int b=0;b<word.length();b++){
					//	a++;
				//	}
					
				}else{
					outputSentence=outputSentence+sentence.substring(a, a+1 );
				}
				//remove leftmost letter from wordString before adding next one(to keep it two characters)
				wordString=wordString.substring(1, wordString.length());
			}else{outputSentence=outputSentence+sentence.substring(a, a+1);}
			//outputSentence=outputSentence+sentence.substring(a, a+1);
		}
		positions=positions.substring(0, positions.length()-2);
		System.out.println(outputSentence);
		System.out.println("Word Count: "+wordCounter);
		System.out.println("Word Positions: "+positions);
	}	
			
			
//			if(sentence.contains(word)){
//		positions=positions+sentence.indexOf(word)+", ";
//		wordCounter++;
//		sentence=sentence.substring(sentence.indexOf(word)+1);
//	}else if(sentence.indexOf(word)==-1){
//		complete=true;
//	}
//		}
//		positions=positions.substring(0, positions.length()-2);
	
	
	public void wordSearcher2(String sentence,String word){
		int wordCounter=0;
		String positions="";
		
		Boolean complete=false;
		while(!complete){
	if(sentence.contains(word)){
		//if word is in sentence: count it, mark its position, then shorten the string(take away the word we found)
		positions=positions+sentence.indexOf(word)+", ";
		wordCounter++;
		sentence=sentence.substring(sentence.indexOf(word)+1);
	}else if(sentence.indexOf(word)==-1){//just takes the last comma away
		complete=true;
	}
		}
		positions=positions.substring(0, positions.length()-2);
	System.out.println("Word Count: "+wordCounter);
	System.out.println("Word Positions: "+positions);
	}
	
	
		
		public void wordReverser3(String sentence){
			//this prints a sentence backwards(but words forwards)
			String words="";
			String thisword ="";
			/*
			 * For each character in the sentence, build a temporary word
			 */
			for(int a=0;a<sentence.length();a++){
			thisword=thisword+sentence.charAt(a);
			//when you hit a space, add to output string with a newline
			if((sentence.charAt(a) == (char)' ')&&(sentence.charAt(a+1) != (char)' ')){
					words=thisword+"\n"+words;
					thisword="";
				}
				}//there isn't a space after the last word, so add it anyway
			words=thisword+"\n"+words;
				System.out.println(words);
		}
		
	
	public void CaesarCyphyer(String code){
		int intChar;
		char thisChar;
	String attempt="";
	intChar=0;
	int spaceCount=0;
	for(int spaces=0;spaces<120;spaces++){
		spaceCount=0;
		attempt="";
		for(int a=0;a<code.length();a++){
			thisChar = code.charAt(a);
		
if(Character.toString(thisChar).equals(" ")){
	spaceCount++;
	}
			intChar = (int) thisChar;
			intChar-=spaces;
			attempt=attempt+(char) intChar;
		}
		//if(spaceCount>0){
		System.out.println(attempt);//}
	}
		
	}
	
	
	
	/*
	 * This will, given a string, double any numbers, convert lower to upper and upper to lower before printing it back out.
	 */
	
	public void wordFiddler(){
		String n="ABd3F24*,219Ab2/p";
		String n2="";
		for(int a=0;a<n.length();a++){
			char thisChar = n.charAt(a);
			//if in number range double it
			if(thisChar>=48 && thisChar<=57){
				n2=n2+Integer.toString(   Integer.parseInt(n.substring(a, a+1)) *2);
				//if in capital range, add 32 to convert to lower
						}else if(thisChar>=65 && thisChar<=90){
							thisChar=(char) ((char)thisChar+32);
							n2=n2+((char)thisChar);
							//if in lower range, subtract 32 to convert to capital
						}else if(thisChar>=97 && thisChar<=122){
							thisChar=(char) (thisChar-32);
							n2=n2+((char)thisChar);
						}else{
							n2=n2+n.charAt(a);
						}
					}
		System.out.println(n2);
	}
	
}
