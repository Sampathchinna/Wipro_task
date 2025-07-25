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
        
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("Division");
        System.out.print("Enter your choice: ");
        int choice=scanner.nextInt();
        
        
        
        switch (choice) {
        
        case 1:
        	int sum=a+b;
	        System.out.println("Addition:" + sum);
	        break;
	        
        case 2:
        	int diff = a - b;
	        System.out.println("Subtraction:" + diff);
	        break;
	    
	    case 3:
	    	int product = a * b;
	    	System.out.println("Multiplication:" + product);
	    	break;
	    	
	    case 4:
	    	 int quotient = a / b;
	    	 System.out.println("Division:" + quotient);
	    	 break;
	    	
	    default:
	    	System.out.println("Please select a valid operator");
	    	break;
        	
        }     
    }
}