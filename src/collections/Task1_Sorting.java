package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task1_Sorting {
	public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(45);
        numbers.add(10);
        numbers.add(78);
        numbers.add(23);
        numbers.add(5);
        
        System.out.println("Original list:"+numbers);
        
        Collections.sort(numbers);
        
        System.out.println("Ascending order:"+numbers);
        
        Collections.sort(numbers,Collections.reverseOrder());
        
        System.out.println("Descedning order:"+numbers);

	}

}
