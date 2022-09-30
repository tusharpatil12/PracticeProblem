package com.bridgelabz;

import java.util.Scanner;

public class sumOfNNaturalNumber {
	public static void sumOfNNaturalNumber(int Number) {
		//int n=1;
		int sum=0;
		for (int i=0; i<Number;i++) {
			sum = sum+i;
			System.out.println("sum of n natural number is :"+sum);
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("welcome to sum of N Natural Number:");
		System.out.println("Enter the Number:");
		int Number = sc.nextInt();
		sumOfNNaturalNumber(Number);
			}

}
