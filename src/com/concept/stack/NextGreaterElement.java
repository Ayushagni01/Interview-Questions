package com.concept.stack;

import java.util.Iterator;
import java.util.Stack;

public class NextGreaterElement {
	
	public static void main(String[] args) {
		
		
		int a[]= {2,5,9,3,1,12,6,8,7};
		
	//	whenStartedAtTheRight(a);
		Stack<Integer> st=new Stack<>();
		
		
		
		
	}

	private static void whenStartedAtTheRight(int[] a) {
		//need to print the element whcih is greater than the number to right 
		int res[]= new int[a.length];
		Stack<Integer> st=new Stack<>();
		
		st.push(a[a.length-1]);
		res[a.length-1]=-1;
		for(int i=a.length-2;i>=0;i--)
		{
			//checking at the top of the element here 
			while(st.size()>0 && a[i]>=st.peek()) {
				
				st.pop();
				
			}
			
			if(st.size()==0) {
				res[i]=-1;
			}else  {
				res[i]=st.peek();
			}
			
			
			//now 
		st.push(a[i]);	
		}
		
	
		for(Integer aa:res)
		{
		
			System.out.print(aa);
		}
	}
	
	

}
