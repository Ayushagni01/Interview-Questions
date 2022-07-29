package com.YoutubeQuestion.MustDoForProductBasedCompany;

import java.util.PriorityQueue;

public class kthLargestandSmallest {
	
	
	
	public static void main(String[] args) {
		int k[]= {3,2,1,5};
		
		priorityQuiz(k,2);
	}

	private static void priorityQuiz(int[] k,int w) {
		
		
		
		PriorityQueue<Integer> aa=new PriorityQueue<>();
	
		for(int i=0;i<w;i++)
		{
			aa.add(k[i]);
		}
		
		aa.poll();
		System.out.println(aa);
		
		
	}

}
