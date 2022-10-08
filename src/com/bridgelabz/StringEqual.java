package com.bridgelabz;

public class StringEqual {
	
	public static void stringCheck(String i, String j) {
		
		if(i.equals(j)) {
			
		System.out.println("String are Equal");
		
		}
		else {
	 
			System.out.println("String are Not Equal");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("check two stringsbare equal or not:");
		stringCheck("sagar","tushar");
		
	}

}
