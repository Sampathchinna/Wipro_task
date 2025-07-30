package Wrapperclass;


import java.util.ArrayList;
import java.util.List;

public class Task2_AutoBoxingUnBoxing {
	static double sum=0;
	static double average;
	public static void main(String[] args) {
		List<Double> marks = new ArrayList<>();
		marks.add(80.5);
		marks.add(56.5);
		marks.add(45.5);
		marks.add(67.4);
		
		for(Double mark:marks) {
			sum+=mark;	
		}
		
		average=(double)sum/marks.size();
		System.out.println(sum);
		System.out.println(average);	
	}

}
