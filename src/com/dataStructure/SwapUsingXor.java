package com.dataStructure;

public class SwapUsingXor {
	
	public static void main(String[] args) {
		
		int a=5;
		int b=7;
		
		a=a^b;
		b=b^a; 
		a=a^b;
		
		System.out.println("a is "+a+"    "+"b is "+b);
		
	}

}
