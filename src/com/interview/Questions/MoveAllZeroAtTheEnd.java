package com.interview.Questions;

import java.util.Arrays;

public class MoveAllZeroAtTheEnd {
	
	public static void main(String[] args) {
		
		int a[]= {0,1,0,3,0,0,2,3,4};
		
		int c=0;
		
		for(int i=0;i<a.length;i++)
		if(a[i]!=0)
		{
			a[c++]=a[i];
		}
		
		
	
	
	while(c<a.length)
	{
		a[c++]=0;
	}
	
	
	Arrays.stream(a).forEach(System.out::print);
	}

}
