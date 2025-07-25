package javaFundamentals;
public class Task5_ReverseString {
	public static void main(String[] args) {
        if (args.length >= 1) {
        	String result="";
        	String original=args[0]+" "+args[1]+" "+args[2];
        	
        	for(int i=0;i<args.length;i++) {
        		String word=args[i];
        		String reversed="";
        		
        		for(int j=word.length()-1;j>0;j--) {
        			reversed+=word.charAt(j);
        		}
        		result+=reversed+" ";
        	}
        	System.out.println("Given Sentence in command line Arguments: "+original);
        	System.out.println("reverse sentence: "+result);
        }
        else {
			System.out.println("please provide atleast one argument");
		}
}}

