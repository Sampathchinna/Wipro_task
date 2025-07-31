package wrapperclass;

import java.util.Arrays;

public class Task10_WrapperSortExample {
	public static void main(String[] args) {
		
		Integer[] num= {10,40,60,70,50};
		
		Arrays.sort(num);
		
		System.out.println("sorted array: "+Arrays.toString(num));
		
		int secondHighest=num[num.length-2];
		System.out.println("second highest: "+secondHighest);
	}

}
