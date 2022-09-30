package com.bridgelabz;

import java.util.Scanner;

public class sumOfNumbers {
	
	
	public static void sumOfNumbersIn(int Number) {
		int a =10;
		int b =20;
		int sum=0;
		for(int i=a; i<=b;i++) {
			sum = sum + i;
			System.out.println("The sum is :"+sum);
			
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Sum of Natural Number:");
		System.out.println("Enter the Number:");
		int Number = sc.nextInt();
		sumOfNumbersIn(Number);
		
	}

}
