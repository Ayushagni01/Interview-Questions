package com.interview.FinalPreparation;

public class ThreeSum {

	public static void main(String[] args) {
		
		int a[]= {12,3,4,1,6,9};
		int target=24;
		//System.out.println(complexityon3(a, target));
		System.out.println(complexityon2(a, target));	
		}

	private static String  complexityon2(int[] a, int target) {
		
	return null;
	}
	
	private static String  complexityon3(int[] a, int target) {
		String s="ayush";
		for(int i=0;i<a.length-3;i++)
		{
			for(int j=i+1;j<a.length-2;j++)
			{
				for(int k=j+1;k<a.length;k++)
				{
					if(a[i]+a[j]+a[k]==target)
					{
					s="Element Found is "+a[i]+" "+a[j]+" "+a[k];
					return s;	
					}
					
				}
			}
			}
		return s;
	}
		

	}


