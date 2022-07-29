package com.YoutubeQuestion.NeetCode;

import java.util.*;

public class GroupAnagram {

	public static  List<List<String>> groupAnagrams(String[] s) {

		List<List<String>> aa=new ArrayList<>();
		
		Map<String,List<String>> amap=new HashMap<>();
		
		for(int i=0;i<s.length;i++)
		{
		char ss[]=s[i].toCharArray();
		Arrays.sort(ss);
		String w=String.valueOf(ss);
		
		
		
		if(!amap.containsKey(w))
		{
			amap.put(w, new ArrayList<>());
		}
		
		amap.get(w).add(s[i]);	
		}
		//convert the hashmap  value into the list
		for(Map.Entry<String, List<String>> k:amap.entrySet())
		{
			aa.add(k.getValue());
		}
		
		
		return aa;
    }
	//above program complexity is greater than o(
	
	
	
	public static void main(String[] args) {
		
		String s[]= {"eat","tea","tan","ate","nat","bat"};
		List<List<String>>a=groupAnagrams(s);
		System.out.println(a);
		

	}

}
