package com.YoutubeQuestion;

public class CountOfSubString3 {

	/*
	 * 24-05-2022
	 * Find the count of substring
	 */
	
	public static void main(String[] args) {
		
		String a="aaabbccabcuuuuuabc";
		int i=3;
		int c=0;
		while(i!=a.length())
		{
			if(a.charAt(i)=='c')
			{
				if(a.charAt(i-1)=='b'   && a.charAt(i-2)=='a')
				{
					c++;
				}
				
			}
		
				i++;
			
			
			
		}
		System.out.println(c);
		
		
	}
	
	
}
