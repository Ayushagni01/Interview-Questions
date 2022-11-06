package com.AA.AllQuestion;

import java.util.*;

public class FrequencyOfCharacter {

	public static void main(String[] args) {
	
		String s="ayushagnihotri";
		Map<Character,Integer> amap=new HashMap<>(); 
		for(int i=0;i<s.length();i++)
		{
			amap.put(s.charAt(i),amap.getOrDefault(s.charAt(i),0 )+1);
			
//			if(!amap.containsKey(s.charAt(i)))
//			{
//				amap.put(s.charAt(i), 1);
//			}else {
//				amap.put(s.charAt(i), amap.get(s.charAt(i))+1);
//			}
			
		}
		
		System.out.println(amap);
		
		
		//countNumberInInteger();
		
		
		

	}

	public static void countNumberInInteger() {
		int a[]= {1,1,3,4,5,6,7,8};
		
		//Creating a map 
		Map<Integer,Integer> amap=new HashMap<>();
		for(int i=0;i<a.length;i++)
		{
			//long form 
			if(!amap.containsKey(a[i]))
			{
				amap.put(a[i], 1);
			}else {
				amap.put(a[i], amap.get(a[i])+1);
			}
			
			//short format
		}
		
		for(Map.Entry<Integer, Integer> aa:amap.entrySet())
		{
			if(aa.getValue()>1)
			{
				System.out.println(aa.getKey());
			}
			
			
		}
	}

}
