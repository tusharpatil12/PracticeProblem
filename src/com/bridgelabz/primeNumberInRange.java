package com.bridgelabz;

import java.util.Scanner;

public class primeNumberInRange {
	
	public static void checkPrimeInNumber(int initialLimit, int finalLimit) {
	
		for(int i=initialLimit;i<=finalLimit;i++) {
			boolean isPrime=primeNumberCheck.checkPrimeInNumber(i);
			if(isPrime) 
				
			
			System.out.println(i);
			
		}
	}
	public static void main(String[] args) {
		checkPrimeInNumber(2, 10);
		

	}

}
