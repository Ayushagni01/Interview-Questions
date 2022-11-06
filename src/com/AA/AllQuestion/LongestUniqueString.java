package com.AA.AllQuestion;

import java.util.Arrays;

public class LongestUniqueString {

	public static void main(String[] args) {
		
		String s="geeksforgeeks";
		
		
		int k=0;
		int s1=0;
		int s2=1;
		
		
		while(s2<s.length()-1)
		{
			if(s.charAt(s1)==s.charAt(s2))
			{
				System.out.println(s.substring(k,s1));
				k++;
				
				 
			}
			s1++;
			s2++;
			
			
		}
		
		
		
	}

}
