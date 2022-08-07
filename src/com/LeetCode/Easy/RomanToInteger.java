package com.LeetCode.Easy;

import java.util.*;
public class RomanToInteger {

	public static void main(String[] args) {

		String s="III";		
		System.out.print(RomanToInteger.romanToInt(s));
	}
	 public static int romanToInt(String s) {
	        
	        Map<Character,Integer> aa=new HashMap<>();
	        aa.put('I',1);
	        aa.put('V',5);
	        aa.put('X',10);
	        aa.put('L',50);
	        aa.put('C',100);
	        aa.put('D',500);
	        aa.put('M',1000);
	        int result=0;
	        char c;
	        for(int i=0;i<s.length()-1;i++)
	        {
	            c=s.charAt(i);
	            if(aa.get(c)<=aa.get(s.charAt(i+1)))
	            {
	            	result=result+Math.abs(aa.get(c)-aa.get(s.charAt(i+1)));
	            	i=i+1;
	            }else {
	            result=result+aa.get(c);    
	        
	            }
	        
	        
	        
	    }
	        return result;
}
}
