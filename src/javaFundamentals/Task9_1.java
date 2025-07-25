package javaFundamentals;

import java.util.Scanner;

public class Task9_1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number: ");
		int a=sc.nextInt();
		System.out.println("enter second number: ");
		int b=sc.nextInt();
		System.out.println("enter third number: ");
		int c=sc.nextInt();
		
		if(a>b && a>c) {
			System.out.println("A is largest number");
		}else if(b>c) {
			System.out.println("B is largest");
		}else {
			System.out.println("c is greatest");
		}
	}

}
