package com.bridgelabz;

public class palindromeNumber {
	public static boolean palindromNumber(int number) {
		boolean isPalindrom=true;
		int r,sum=0,temp;    
		  
		  temp=number;    
		  while(number>0){    
		   r=number%10; 
		   sum=(sum*10)+r;    
		   number=number/10;    
	}
		return isPalindrom;
	}
	public static void main(String[] args) {
		boolean b=palindromNumber(123);
		if(b)   
			   System.out.println("palindrome number ");    
			  else    
			   System.out.println("not palindrome Number");    
			}  
	
 
}
