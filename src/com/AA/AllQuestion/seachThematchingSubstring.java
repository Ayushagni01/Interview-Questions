package com.AA.AllQuestion;

public class seachThematchingSubstring {
	
	
	public static void main(String[] args) {
		
		
		String a="abc";
		String b="dbc";
		String res="";
		
		//iterate the b string on a  
		for(int i=0;i<b.length();i++)
		{
			///search every character in b to a string
			for(int j=0;j<a.length();j++)
			{
				if(b.charAt(i)==a.charAt(j))
				{
					res=res+b.charAt(i);
					break;
				}
				
			}
			
		}
		
		System.out.println(res);
			
			
	}

}
