package com.YoutubeQuestion.MustDoForProductBasedCompany;

import java.util.Collections;
import java.util.PriorityQueue;

public class kthLargestandSmallest {
	
	
	
	public static void main(String[] args) {
		int k[]= {3,2,1,5};
		
		priorityQuisz(k,2);
	}
	
	
	
	
	
	//largest element code
	private static void priorityQuiz(int[] k,int w) {
		

		 
		PriorityQueue<Integer> aa=new PriorityQueue<>();
	
		for(int i=0;i<w;i++)
		{
			   aa.add(k[i]);
		}
		
		for(int i=w;i<k.length;i++)
		{
			if(aa.peek()<k[i])
			{
				aa.poll();
				aa.add(k[i]);
			}
		}
		System.out.println(aa.peek());
		
	}
	
	//smalllest element code

	//largest element code
	private static void priorityQuisz(int[] k,int w) {
		

		
		PriorityQueue<Integer> aa=new PriorityQueue<>(Collections.reverseOrder());
	
		for(int i=0;i<w;i++)
		{
			aa.add(k[i]);
		}
		
		for(int i=w;i<k.length;i++)
		{
			if(aa.peek()>k[i])
			{
				aa.poll();
				aa.add(k[i]);
			}
		}
		System.out.println(aa.peek());
		
	}


}
