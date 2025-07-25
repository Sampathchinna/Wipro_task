package javaFundamentals;
import java.util.Scanner;

public class Task8_calculator {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter first number: ");
	        int a = scanner.nextInt();

	        System.out.print("Enter second number: ");
	        int b = scanner.nextInt();
	        
	        scanner.nextLine();
	        
	        System.out.println("Select your operator:Addition,Subtraction,Multiplication,Division");
	        String opertaor=scanner.nextLine();
	        
	        
	        
	        switch (opertaor) {
	        
	        case "Addition":
	        	int sum=a+b;
		        System.out.println("Addition:" + sum);
		        break;
		        
	        case "Subtraction":
	        	int diff = a - b;
		        System.out.println("Subtraction:" + diff);
		        break;
		    
		    case "Multiplication":
		    	int product = a * b;
		    	System.out.println("Multiplication:" + product);
		    	break;
		    	
		    case "Division":
		    	 int quotient = a / b;
		    	 System.out.println("Division:" + quotient);
		    	 break;
		    
		    case "Remainder":
		    	  int remainder = a % b;
		    	  System.out.println("Modulus:" + remainder);
		    	  break;
		    	
		    default:
		    	System.out.println("Please select a valid operator");
		    	break;
	        	
	        }     
	    }
	}
