package com.AA.AllQuestion;

import java.util.Arrays;

public class CheckTwoStringIsAnagram {

	public static void main(String[] args) {
		String input1="abc";
		String input2="ywz";
		
	
		System.out.println(sortTheArrays(input1,input2));
	
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

}
