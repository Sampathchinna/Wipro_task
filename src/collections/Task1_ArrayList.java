package collections;

import java.util.ArrayList;

public class Task1_ArrayList {
	public static void main(String[] args) {
		ArrayList<String> element=new ArrayList<>();
		element.add("Java");
		element.add("C");
		element.add("C++");
		element.add("Ruby");
		element.add("python");
		
		System.out.println("All five elements:"+element);
		
		element.remove(1);
		
		System.out.println("Elements after removing seconf element"+element);
	}

}
