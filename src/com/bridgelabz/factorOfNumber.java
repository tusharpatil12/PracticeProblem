package com.bridgelabz;

import java.util.Scanner;

public class factorOfNumber {
	
	public static void checkFactorOfNumber(int num1) {
		int num=10;
	     System.out.println( "Factors of " + num + " are " );

		for(int i=1;i<=num;i++){
			if(num % i == 0)
            System.out.print(i + " ");
				}
	}

	public static void main(String[] args) {
		checkFactorOfNumber(10);
		

	}

}
