package com.AA.AllQuestion.Recursion;

public class FibonacciSeries {
	static int n1=0;
	 static int n2=1, n3=0;
	
	public static void main(String[] args) {
		
		//0,1,1,2,3,5,8,13
		System.out.print("0"+" "+"1");
		fibo(5-2);
		
	}

	private static void fibo(int c) {


		if(c>0)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print (" "+n3);
			fibo(c-1);
		}
		
	}
}
