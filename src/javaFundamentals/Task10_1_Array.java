package javaFundamentals;

import java.util.Scanner;

public class Task10_1_Array {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] num=new int[10];
		int sum=0;
		
		System.out.println("enter 10 integers");
		
		for(int i=0;i<num.length;i++) {
			num[i]=sc.nextInt();
			sum+=num[i];
		}
		int min=num[0];
		int max=num[0];
		
		for(int i=1;i<num.length;i++) {
			if(num[i]<min) {
				min=num[i];
			}
			if(num[i]>max) {
				max=num[i];
			}
		}
		double average=(double)sum/num.length;
		
		System.out.println("sum: "+sum);
		System.out.println("minimum number: "+min);
		System.out.println("maximum number: "+max);
		System.out.println("average: "+average);
	}

}
