package com.concept.stack;

import java.util.*;
public class duplicateBracket {
	
	
	
	public static void  main(String args[]) {
		
	String c="((a+b)+(c+d))";
		Stack<Character> st=new Stack();
		
		
		char v;
		for(int i=0;i<c.length();i++)
		{
			v=c.charAt(i);
			
				
				
			
				if(v==')')
			{
					if(st.peek()=='(')
					{
						System.out.println("Duplicacy Found ");
						return;
					}
					else {
			while(st.peek()!='(')
			{
				st.pop();
			}
			st.pop();
					}
				
			}
				else {
				st.push(v);
				}
		}
		
		System.out.println(false);
		
		
		
		
	
	}

}
