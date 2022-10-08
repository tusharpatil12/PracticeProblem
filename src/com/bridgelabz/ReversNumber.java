package com.bridgelabz;

import java.util.Scanner;

public class ReversNumber {
	
	public static void ReversNumber(int Temp) { 
		
		int Number = 0,Temp1, reminder, Revers=0;
		Temp1=Number;
		while (Temp>0) {
			reminder=Temp1%10;
			Revers=Revers*10+reminder;
			Temp1=Temp1/10;Revers=Revers*10+reminder;
			Temp=Temp/10;
		
		}
		
		//12System.out.println("after : " + Number);
		
	}

	public static void main(String[] args) {
		int Number, Temp, reminder, Revers = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		Number = sc. nextInt();
		
		System.out.println("before : " +Number);
		System.out.println("after : " + Revers);


		ReversNumber(Number);
		
	}
	
	}


