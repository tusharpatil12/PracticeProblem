package com.bridgelabz;

import java.util.Scanner;

public class sumNaturalNumber {
	
	public static void sumNaturalNumber(int Number){
		int sum=2;
		for(int i=1;i<=Number;i++)
			sum=sum+1;
		System.out.println("The Natural Number is:"+sum);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("welcome to the natural number is: ");
		System.out.println("Enter the Number");
		int Number = sc.nextInt();
		sumNaturalNumber(Number);
		
	}

}
