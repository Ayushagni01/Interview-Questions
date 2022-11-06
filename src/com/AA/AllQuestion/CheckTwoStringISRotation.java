package com.AA.AllQuestion;

public class CheckTwoStringISRotation {
	
	
	public static void main(String[] args) {
		
		
		String input1="abcd";
		String input2="dabc";
		
	input1=input1+input1;
		 int d=input1.indexOf(input2);
		
	if(d==-1)
	{
		System.out.println("false");
	}else {
		System.out.println("true");
	}
		
		
	}

}
