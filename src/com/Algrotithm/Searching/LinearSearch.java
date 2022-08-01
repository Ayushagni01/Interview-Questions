package com.Algrotithm.Searching;



public class LinearSearch {
public static void main(String[] args) {
	
	int a[]= {1,2,3,4,5,6,7,8,9,10};
	
	linearSearchExample(a,6);
	
	
}

private static void linearSearchExample(int[] a, int t) {
	
	
	for(int i=0;i<a.length;i++)
	{
		if(a[i]==t)
		{
			System.out.println("Element Found at location "+i);
			break;
		}
	}
	
}
}


