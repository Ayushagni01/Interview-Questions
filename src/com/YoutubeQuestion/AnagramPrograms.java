package com.YoutubeQuestion;

import java.util.Arrays;
import java.util.Collections;

public class AnagramPrograms {
	
	public static void main(String[] args) {
		
		String s="anagram";
		String d="nagaram";
		
		System.out.println(sortTheArrays(s,d));
	
		
		
		
	}

	private static boolean sortTheArrays(String s,String d) {
		char c1[]=s.toCharArray();
		char c2[]=s.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		
		String s1=new String(c1);
		String s2=new String(c2);
		if(s1.equals(s2))
		{
			return true;
		}
		
		return false;
	}
	
	private  static boolean sortSecondMethod(String s,String t) {
		
		int [] store=new int[26];
		
		
		for(int i=0;i<store)
		
		return true;
	}
	
	
	
	
	
	
	

}
