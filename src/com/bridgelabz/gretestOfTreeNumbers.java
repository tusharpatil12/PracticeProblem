package com.bridgelabz;

public class gretestOfTreeNumbers {
	
	public static void gretestOfTreeNumbers(int num1,int num2,int num3) {
		//int num1=25;
		//int num2=50;
		//int num3=10;
		
		if(num1>=num2 &&num1>=num3)
			System.out.println("The gretest Number :"+num1);
		else if(num2>=num1 && num2>=num3)
			System.out.println("The gretest Number :"+num2);
		else if(num3>=num1 && num3>=num2)
			System.out.println("The gretest Number :"+num3);
	}

	public static void main(String[] args) {
		System.out.println("welcome to Gretest Tree numbers are:");
		gretestOfTreeNumbers(25, 50, 10);

		
	}
	

}
