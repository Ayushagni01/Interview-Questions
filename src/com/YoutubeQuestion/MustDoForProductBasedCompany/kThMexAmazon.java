package com.YoutubeQuestion.MustDoForProductBasedCompany;

import java.util.*;
public class kThMexAmazon {

	public static void main(String[] args) {
		int a[]= {1,1};
		int k=0;
		Set<Integer> aa=new HashSet<>();
		for(int i=0;i<a.length;i++)
		{
			aa.add(a[i]);
		}
		
		int max=Collections.max(aa);
	
		max=max*100;
		//now we neeed to solve this questions
		List<Integer>  p=new ArrayList<>();
		
		for(int i=0;i<max;i++)
		{
			if(!aa.contains(i))
			{
				p.add(i);
			}
		
		}
		System.out.println(p);
		priorityQuisz(p,9);
		
	
	}
	
	
		private static void priorityQuisz(List<Integer>  k,int w) {
			

			
			PriorityQueue<Integer> aa=new PriorityQueue<>(Collections.reverseOrder());
		
			for(int i=0;i<w;i++)
			{
				aa.add(k.get(i));
			}
			
			for(int i=w;i<k.size();i++)
			{
				if(aa.peek()>k.get(i))
				{
					aa.poll();
					aa.add(k.get(i));
				}
			}
			System.out.println(aa.peek());
			
		}

}
