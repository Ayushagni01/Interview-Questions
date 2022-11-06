package com.AA.AllQuestion;

import java.util.LinkedHashSet;
import java.util.Set;
public class RemoveDuplicate {
	
	
	public static void main(String[] args) {
		
		String s="geeksforgeeks";
		String res="";
		for(int i=0;i<s.length();i++)
		{
			int j;
			for(j=0;j<i;j++) {
				
				if(s.charAt(i)==s.charAt(j))
				{
					break;
				}
			}
			if(i==j)
			{
				res=res+s.charAt(i);
				
			}
			
			
			
		}
		System.out.println(res);
	}

	public static Set<Character> removeDuplicateSet(String s) {
		Set<Character> a=new LinkedHashSet<>();
		for(int i=0;i<s.length();i++) {
			a.add(s.charAt(i));
		}
		return a;
	}

}
