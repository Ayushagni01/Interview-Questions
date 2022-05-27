package com.YoutubeQuestion;

public class Sort0and1 {
	
	
	public static void main(String args[])
	{
		int a[]= {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
		//sortOutTheElementZeroAndOneInOnTimes(a);
		SortByUsingExtraSpaceeWithOnTime(a);
		
		
	}

	private static void SortByUsingExtraSpaceeWithOnTime(int[] a) {
	int b[]=new int[a.length];
	int s=0;
	int c=b.length-1;
	for(int i=0;i<a.length;i++) {
		
		if(a[i]==0)
		{
			b[s]=a[i];
			s++;
		}
		else{
			b[c]=a[i];
			c--;
		}
		
		
	}
	
	for(Integer r:b)
	{
		System.out.print(r);
	}
	
		
		
	}
	
	//Two Pointer approach
	private static void sortOutTheElementZeroAndOneInOnTimes(int a[]) {
		
		int s=0;
		int e=a.length-1;
		while(s<=e)
		{
			
			
			if(a[s]==0)
			{
				s++;
				
			}
			else if(a[s]==1 && a[e]==1)
			{
				e--;
			}
			else if(a[s]==1 && a[e]==0)
			{
				a[s]=0;
				a[e]=1;
			}
			
			
		}
		
		for(Integer r:a)
		{
			System.out.print(r);
		}
		
		
		
		
		
		
	}

}
