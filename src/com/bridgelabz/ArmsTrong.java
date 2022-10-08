package com.bridgelabz;

import java.util.Scanner;

public class ArmsTrong {
	
	public static boolean CheckArmsTrongNumber(int number) {
		int result = 0;
		int value = number;
		
		while (number>0) {
			int rem =number%10;
			result = (rem*rem*rem)+result;
			number=number/10;
		}
		if(value == result) {
		return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		
		boolean b = CheckArmsTrongNumber(371);
		if(b) {
			System.out.println("Number is Armsstrog:");
		}
		else {
			System.out.println("Number Not Armsstrong:");
		}
	}

}
