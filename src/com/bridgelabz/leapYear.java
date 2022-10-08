package com.bridgelabz;

public class leapYear {
	
	public static void checkLeapYear() {
		int year = 2020;

	     if (year % 100 == 0)
	       System.out.println (year + " is a Leap Year");

	     else if (year % 4 == 0 && year % 100 != 0)
	       System.out.println (year + " is a Leap Year");

	     else
	         System.out.println (year + " is not a Leap Year");

	}

	public static void main(String[] args) {
		
		System.out.println("The leap year is:");
		checkLeapYear();
		

	}

}
