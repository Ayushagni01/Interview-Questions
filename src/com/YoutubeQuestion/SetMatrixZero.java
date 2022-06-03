package com.YoutubeQuestion;

import java.util.*;
public class SetMatrixZero {

	public static void main(String args[])
	{
		
		List<String> a=new ArrayList<>();
		a.add("111");
		a.add("101");
		a.add("111");
		
		setZero(a);
		
		
	}

	private static void setZero(List<String> a) {
		
		Character res[][]=new Character[a.size()][a.get(0).length()];
		
		
		for(int i=0;i<res.length;i++)
		{	
			for(int j=0;j<res[i].length;j++)
			{
				for(int k=0;k<;i++)
				{
					String s=a.get(k);
					char c=s.charAt(k);
					res[i][j]=c;
				}
				
				
			}
		}
		
		for(int i=0;i<res.length;i++)
		{	
			for(int j=0;j<res[i].length;j++)
			{
				System.out.print(res[i][j]);
				
			}
			System.out.println("\n");
		}
		
		
	}
	
	
	
}
