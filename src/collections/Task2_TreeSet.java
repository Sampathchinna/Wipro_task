package collections;

import java.util.Set;
import java.util.TreeSet;

public class Task2_TreeSet {
	 public static void main(String[] args) {
	        Set<Integer> numbers = new TreeSet<>();

	        numbers.add(40);
	        numbers.add(10);
	        numbers.add(30);
	        numbers.add(20);
	        numbers.add(10); 

	        System.out.println("Sorted unique numbers: " + numbers);
	    }

}
