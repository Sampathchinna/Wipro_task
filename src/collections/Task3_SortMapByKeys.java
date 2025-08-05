package collections;

import java.util.*;

public class Task3_SortMapByKeys {
    public static void main(String[] args) {
        // Step 1: Create an unsorted HashMap
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(104, "David");
        hashMap.put(102, "Bob");
        hashMap.put(105, "Eva");
        hashMap.put(101, "Alice");
        hashMap.put(103, "Charlie");


        System.out.println("Unsorted HashMap:");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println("Roll No: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        // Step 2: Convert to TreeMap (sorted by keys)
        Map<Integer, String> treeMap = new TreeMap<>(hashMap);

        System.out.println("\nSorted TreeMap (by keys):");
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println("Roll No: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
