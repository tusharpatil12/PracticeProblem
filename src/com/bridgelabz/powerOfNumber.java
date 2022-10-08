package com.bridgelabz;

import java.util.Scanner;

public class powerOfNumber {
	
	
	public static void powerOfNumber(int n, int power,int result) {
		//int n=2;
		//int power=5;
		//int result=1;
		
	
		while(power>0){
			result=result*n;     //power=5-1=4*1=4
			power--;
		}
		System.out.println(result);
		
	}
	public static void main(String[] args) {
		powerOfNumber(2,5,1);
		
		

	}

}
