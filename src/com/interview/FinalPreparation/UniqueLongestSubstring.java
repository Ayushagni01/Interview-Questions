package com.interview.FinalPreparation;

import java.util.*;
public class UniqueLongestSubstring {

	public static void main(String[] args) {
		
		String a="ababydjjsgiuzg";
		Map<Character,Integer> aa=new HashMap<>();
		int s=0;
		for(int i=0;i<a.length();i++)
		{
			aa.put(a.charAt(i), i);
			if(aa.containsKey(a.charAt(i))) {
			System.out.println(	findtheString(a,s,i-1));
			s++;
			}
			
		}
	}
	
	

	private static String findtheString(String a, int s, int e) {
		String s1="";
		for(int i=s;i<e;i++)
		{
			s1=s1+a.charAt(i);
		}
		return s1;
	}
	
	

}
