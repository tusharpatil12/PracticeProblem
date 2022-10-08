package com.bridgelabz;

public class ArmstrongNumberGivenRange {
	
	public static void ArmstrongNumberGivenRange(int initialLimit,int finalLimit) {
		for(int i=initialLimit;i<=finalLimit;i++) {
			boolean isRange=ArmsTrong.CheckArmsTrongNumber(i);
			if(isRange) {
				System.out.println(i+" ");
			}
		}
	}

	public static void main(String[] args) {
		ArmstrongNumberGivenRange(10,100);
		
		
	}

}
