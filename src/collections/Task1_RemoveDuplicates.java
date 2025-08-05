package collections;

import java.util.*;
public class Task1_RemoveDuplicates {
	public static void main(String[] args) {
	
	List<String> element=new ArrayList<>();
	element.add("Java");
	element.add("C");
	element.add("Java");
	element.add("python");
	
	System.out.println("Original List: "+element);
	
	Set<String> uniqueelement=new HashSet<>(element);
	
	System.out.println("After removing duplicates"+uniqueelement);
	}
}
