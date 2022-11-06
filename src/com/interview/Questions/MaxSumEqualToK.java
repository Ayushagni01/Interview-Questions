package com.interview.Questions;

public class MaxSumEqualToK {

	public static void main(String[] args) {
		int a[]= {1,4,2,10,23,3,1,0,20};
		//whichIProposedSolution(a);
		

	}

	public static void whichIProposedSolution(int[] a) {
		int k=4;
		int res=0;
		int max=0;
		int c=0;
		int s1=0;
		for(int i=0;i<a.length;i++)
		{
			res=res+a[i];
			
			if(c==k)
			{
			
			System.out.println(i);
				
			if(res>max)
			{
				max=res;
			}
			res=res-a[s1];
			s1++;
			}
			c++;
		}
		System.out.println(max);
	}

}
