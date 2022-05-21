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
		
		for(Integer k:b)
		{
			System.out.println(k);
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		int a[]= {1,4,7,8,10};
		int b[]= {2,3,9};
		
		//sort using insertion sort method
		sortUsingInsertionSortMethod(a,b);
		
	}

	

}
