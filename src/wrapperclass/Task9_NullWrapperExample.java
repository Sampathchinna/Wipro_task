package wrapperclass;

import java.util.Optional;

public class Task9_NullWrapperExample {
	public static void main(String[] args) {

	Double balance=null;
	
	 try{
		double primitiveBalance=balance;
		System.out.println("balance: "+primitiveBalance);
	}catch(NullPointerException ex) {
		System.out.println("caught nullpointerexception while unboxing null Double");
		
	}
	// Step 3: Fix with default value strategy
     double safeBalance = (balance != null) ? balance : 0.0;
     System.out.println("Safe balance (defaulted if null): " + safeBalance);

     // Step 4: Optional approach
     Optional<Double> optionalBalance = Optional.ofNullable(balance);
     double optionalSafeBalance = optionalBalance.orElse(0.0);
     System.out.println("Safe balance using Optional: " + optionalSafeBalance);

}
}
