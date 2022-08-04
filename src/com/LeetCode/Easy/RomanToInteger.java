package com.LeetCode.Easy;

import java.util.*;
public class RomanToInteger {

	public static void main(String[] args) {

		String s="MCMXCIV";		
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
	        for(int i=0;i<s.length();i++)
	        {
	            c=s.charAt(i);
	            if(c=='I'){result=result+aa.get(c);}
	            if(c=='V'){result=result+aa.get(c);}
	            if(c=='X'){result=result+aa.get(c);}
	            if(c=='L'){result=result+aa.get(c);}
	            if(c=='C'){result=result+aa.get(c);}
	            if(c=='D'){result=result+aa.get(c);}
	            if(c=='M'){result=result+aa.get(c);}
	            
	            
	        }
	        return result;
	        
	        
	    }
}
