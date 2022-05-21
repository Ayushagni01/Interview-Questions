package com.YoutubeQuestion;

import java.util.Arrays;

public class MergeTwoSortedArray {
	
	
	//Merge two sorted array by using insertion sort techniquies
	private static void sortUsingInsertionSortMethod(int[] a, int[] b) {
		int i=0;
		int temp=0;
		int j=0;
		while(i!=a.length)
		{
			
			if(a[i]>b[0])
			{
				//swapping the element
				temp=b[0];
				b[0]=a[i];
				a[i]=temp;
				
			}
			Arrays.sort(b);
			i++;
			
		}
		
		for(Integer k:a )
		{
			System.out.println(k);
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		int a[]= {20};
		int b[]= {2, 3};
		
		//sort using insertion sort method
		//sortUsingInsertionSortMethod(a,b);
		
		//approach 2 by using gap method
		sortUsingGapMethod(a,b);
		
		
	}


//https://www.youtube.com/watch?v=hVl2b3bLzBw&list=PLgUwDviBIf0p4ozDR_kJJkONnb1wdx2Ma&index=8


	private static void sortUsingGapMethod(int[] a, int[] b) {
		
		//Gap Algorithm
		double gap=Math.ceil((a.length+b.length)/2);
		while(gap>1)
		{
			
		}
		
		
		
	}

	

}
