package com.bridgelabz;

import java.util.Scanner;

public class sumOfNumbers {
	
	
	public static void sumOfNumbersIn(int a, int b) {
		// int a = 10;
		   // int b = 15;

		    int sum = 0;

		    for (int i = a; i <= b; i++)
		        sum = sum + i;
		      System.out.println ("The sum is " + sum);
		  }
		

	public static void main(String[] args) {
		System.out.println("The sum of N Natural number:");
		sumOfNumbersIn(10, 15);
	}

}
