package com.bridgelabz;

public class strongNumber {
	
	public static void checkStrongNumber(int number) {
		int strongnumber =0;
		int value = number;
	    
	     while (number> 0) {
	    	 int f = 1;
	    	 int reminder = number % 10;
	    	 while (reminder>=1) {
	    		 f = f * reminder;
	    		 reminder--;
	    	 }
	    	 strongnumber = f +strongnumber;
	    	 number = number/10;
	     } 
	     if (value == strongnumber)
	    	 System.out.println("number is strong :"+strongnumber);
	     else {
	    	 System.out.println("number is not strong :"+strongnumber);
	     }
	}

	public static void main(String[] args) {
		System.out.println("welcome to strong number:");
		checkStrongNumber(145);
		
		
	}

}
