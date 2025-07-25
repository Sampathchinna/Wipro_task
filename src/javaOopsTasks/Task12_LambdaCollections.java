package javaOopsTasks;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task12_LambdaCollections {
	public static void main(String[] args) {
		
	
	List<String> names=Arrays.asList("sampath","veeru","virat","goswami","Ambati");
	//print names
    System.out.println("All names");
    names.forEach(name ->System.out.println(name));
    
    System.out.println(".....................");
    
    //filter names with "A"
    System.out.println("names with 'A': ");
    names.stream().filter(name ->name.startsWith("A")).forEach(name ->System.out.println(name));
    
    System.out.println(".........................");
    //sorted names alphabetically
    System.out.println("sorted names");
    List<String> sortednames=names.stream().sorted().collect(Collectors.toList());
    
    sortednames.forEach(name ->System.out.println(name));

}
}
