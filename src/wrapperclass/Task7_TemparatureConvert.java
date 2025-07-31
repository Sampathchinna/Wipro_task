package wrapperclass;

import java.util.ArrayList;

public class Task7_TemparatureConvert {
	public static void main(String[] args) {
		
		String[] tempStrings= {"36","38","40"};
		
		ArrayList<Double> farhenheattemp=new ArrayList<>();
		
		
		for(String temp: tempStrings) {
			int celsius=Integer.parseInt(temp);
			
			double farhenheat=(celsius*9.0/5.0)+32;
			
			farhenheattemp.add(farhenheat);
			
			System.out.println(celsius+"C->"+farhenheat+"F");
		}
		
		
	}

}
