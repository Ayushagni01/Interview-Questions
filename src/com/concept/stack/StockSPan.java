package com.concept.stack;

import java.util.Stack;

public class StockSPan {

	public static void main(String[] args) {
		
		int a[]= {2, 5, 9, 3, 1, 12, 6 ,8 ,7};
		
		int r[]=new int[a.length];
		Stack<Integer> st=new Stack<>();
		
		st.push(0);
		r[0]=1;
		for(int i=1;i<a.length;i++)
		{
			
			while(st.size()>0 && a[i]>a[st.peek()])
			{
				
				st.pop();
			}
			
			if(st.size()==0)
			{
				r[i]=i+1;
			}else {
				r[i]=i-st.peek();
			}
			
			
			
			
			st.push(i);
			
		}
		
		for(Integer aa:r)
		{
			System.out.println(aa+" ");
		}
		
		
		
	}
	
	
	
}
