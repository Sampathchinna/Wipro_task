package collections;

import java.util.*;
public class Task2_DuplicatesNotAllowed {
	public static void main(String[] args) {
       
        Set<String> languages = new HashSet<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("Java");
        languages.add("Python"); 

        System.out.println("Languages in Set: " + languages);
    }

}
