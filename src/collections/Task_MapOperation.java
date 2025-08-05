package collections;

import java.util.HashMap;
import java.util.Map;

public class Task_MapOperation {
	public static void main(String[] args) {
		Map<Integer,String> student=new HashMap<>();
		student.put(101, "sam");
        student.put(102, "virat");
        student.put(103, "monkey");
        student.put(104, "David");
        student.put(105, "suhu");
        
        student.remove(103);
        
        System.out.println("Remaing students: ");
        for(Map.Entry<Integer,String> entry: student.entrySet()) {
        	System.out.println("Rool No:"+entry.getValue()+",Name:"+entry.getValue());
        }
        
        
	}

}
