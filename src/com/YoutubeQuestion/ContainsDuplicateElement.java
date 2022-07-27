package com.YoutubeQuestion;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ContainsDuplicateElement {
	
	
	public static void containDuplicate(int[] a)
	{
		int m=Collections.max((Collection<? extends T>) Arrays.asList(a));
		
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		
		//count the frequency of character using the nested for loop`
		int a[]={2,2,3,1,2,2,1,4,5,5,3};
		
		int [] vi =new int[a.length];
		
		int v=-1;
	
		for(int i=0;i<a.length;i++)
		{
			int c=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					c++;
					vi[j]=v;
				}
				
			}
			if(vi[i]!=v)
			{
				vi[i]=c;
			}
			
			
		}
		
		//now printing the frequency of the element
		
		for(int i=0;i<a.length;i++)
		{
			if(vi[i]!=v) {
			System.out.println("Array of i = "+a[i]+"  counting of array is "+vi[i]);
		}
		}
		
		
		
	}
	
	
}
