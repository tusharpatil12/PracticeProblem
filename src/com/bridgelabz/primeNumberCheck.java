package com.bridgelabz;

 class primeNumberCheck{
	
	
	 public static boolean primeNumberCheck(int Number) {
	   boolean isPrime = true;
		for (int i = 2; i < Number; i++) {
			if (Number%i == 0) {

			isPrime = false;
			break;
			}
			
		}
		return isPrime;
	
	 }
	public static void main(String[] args) {
		boolean b=primeNumberCheck(13);
		if(b)
		System.out.println("is prime number:");
		else
			System.out.println("is not a prime number:");
	}
     static boolean checkPrimeInNumber(int i) {
		
		return false;
	}

}
