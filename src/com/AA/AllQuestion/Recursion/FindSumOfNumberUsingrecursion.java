package com.AA.AllQuestion.Recursion;

public class FindSumOfNumberUsingrecursion {
	
	
	
	public static void main(String[] args) {
		
		int a[]= {1,2};
		
		
		System.out.println("The sum of number is "+findSum(a,0));
		
	}

	private static int findSum(int[] a,int n) {
		
		if(n>=a.length-1)
		{
			return a[n];
		}
		
		return a[n++]+findSum(a, n);
	
	}

}
