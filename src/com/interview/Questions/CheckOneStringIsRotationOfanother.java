package com.interview.Questions;

public class CheckOneStringIsRotationOfanother {
	
	//program for checking the rotations
	
	public static void main(String[] args) {
		String a="ABCD";
		String b="CDB";
		
		if(checkingRotation(a,b))
		{
			System.out.println("Found");
		}else {
			System.out.println("Not Found");
		}
		
		
	}

	private static boolean checkingRotation(String a, String b) {
		
		return ((a+a).indexOf(b)==-1?false:true);
		

		
	}

}
