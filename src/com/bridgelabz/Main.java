package com.bridgelabz;

public class Main {
	
	static String checkPosAndNeg(int value) {
		String [] result = {"Positive", "Negative"};
    	return result[(value>>31)&1];
		}

	public static void main(String[] args) {
		int num;
		num=15;
		System.out.println(num + " is " + checkPosAndNeg(num));
		
	} 

}
