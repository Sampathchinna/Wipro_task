package javaFundamentals;

public class Task8_pragramme {
    public static void main(String[] args) {
    	int x=5;
    	
    	System.out.println("original int value: "+x);
    	System.out.println("Post increment: "+(x++));//first print x and after it will increment by 1
    	System.out.println("pre-increment: "+(++x));//first increment x value by 1 and after print the x
    	
    	//Bitwise shift operators
    	System.out.println("Bitwise  left shift: "+(x << 1));//we have to find the binary conversion of x and shift to left value by 1
    	System.out.println("Bitwise  right shift: "+(x >> 1));//we have to find the binary conversion of x and shift to right by one value
    	
    	// Logical vs Bitwise AND
    	boolean a=true;
    	boolean b=false;
    	
    	System.out.println("Logical AND (a&&b): "+(a && b));//both values should be true here output will be false
    	System.out.println("Bitwise AND (a&b): "+(a & b));//false
    	
    	//With integers
    	int c=6; //binary conversion 0110
    	int d=7;//binary conversion 0011
    	System.out.println("Bitwise AND (m&n): "+(c&d));
    	System.out.println("Bitwise OR (m|n): "+(c|d));
    	
   
}}