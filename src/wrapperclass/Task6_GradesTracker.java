package wrapperclass;

import java.util.*;
public class Task6_GradesTracker {
	public static void main(String[] args) {
		ArrayList<Integer> marks=new ArrayList<>();
		marks.add(30);
		marks.add(80);
		marks.add(79);
		marks.add(45);
		
		Integer minMarks=Collections.min(marks);
		marks.remove(minMarks);
		
		int max=Collections.max(marks);
		int min=Collections.min(marks);
		
		int sum=0;
		double average;
		for(int mark: marks) {
			sum+=mark;
		}
		average=(double)sum/marks.size();
		System.out.println("marks after removing lowest: "+marks);
		System.out.println("maximum: "+max);
		System.out.println("minimum: "+min);
		System.out.println("avaerage: "+average);
	}

}
