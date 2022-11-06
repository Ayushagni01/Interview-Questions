package com.ques;

import java.util.*;
public class UniqueDigit {
	
	public static void main(String args[])
	{
		int n=12233;
		Map<Integer,Integer> amap=new HashMap<>();
		while(n>0)
			
		{
			int rem=n%10;
			
			if(!amap.containsKey(rem))
			{
				amap.put(rem, 1);
			}else {
				amap.put(rem, amap.get(rem)+1);
			}
			n=n/10;
		}
		
		for(Map.Entry<Integer, Integer> aa:amap.entrySet())
		{
			if(aa.getValue()==1)
			{
				System.out.println(aa.getKey());
			}
		}
		
		
	}

}
