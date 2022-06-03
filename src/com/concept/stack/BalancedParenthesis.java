package com.concept.stack;

import java.util.Stack;

//2;44

public class BalancedParenthesis {

	public static void main(String[] args) {
		
		String a="[(a+b)+{(c+d)*(e|f)]}";
		
		Stack<Character> st=new Stack<>();
		char c;
	    for(int i=0;i<a.length();i++)
	    {
	    	c=a.charAt(i);
	    	if(c=='(' || c=='{' || c=='[')
	    	{
	    		st.push(c);
	    	}
	    	else if(c==')')
	    	{
	    		if(st.size()==0)
	    		{
	    			System.out.println("Not balanced");
	    			return;
	    		}else if(st.peek()!='(')
	    		{
	    			System.out.println("Not balanced");
	    			return;
	    		}else {
	    			st.pop();
	    		}
	    		
	    	}else if(c=='}') {
	    		
	    		if(st.size()==0)
	    		{
	    			System.out.println("Not balanced");
	    			return;
	    		}else if(st.peek()!='{')
	    		{
	    			System.out.println("Not balanced");
	    			return;
	    		}else {
	    			st.pop();
	    		}
	    		
	    		
	    		
	    	}
	    	else if(c==']') {
	    		if(st.size()==0)
	    		{
	    			System.out.println("Not balanced");
	    			return;
	    		}else if(st.peek()!='[')
	    		{
	    			System.out.println("Not balanced");
	    			return;
	    		}else {
	    			st.pop();
	    		}
	    		
	    	}
	    		
	    	}
	    
		
		
		//approached undertsandable
		
	}
	
	
}
