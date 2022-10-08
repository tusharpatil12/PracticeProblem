package com.bridgelabz;

import java.util.Scanner;

public class EvenOdd {

	static void checkEvenOrOdd(int val) {
		if (val % 2 == 0)
			System.out.println("Number is Even :"+val);
		else
			System.out.println("Number is odd :"+val);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("checking whether the Number is Even or Odd: ");
		System.out.println("Enter the Number: ");
		int val = sc.nextInt();
		checkEvenOrOdd(13);
		checkEvenOrOdd(12);
	}

}
