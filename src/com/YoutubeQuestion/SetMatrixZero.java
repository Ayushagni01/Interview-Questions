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
		
		int res[][]=new int[a.size()][];
		
		
		for(int i=0;i<res.length;i++)
		{
			for(int j=0;j<res[i].length;j++)
			{
				res[i][j]=a.get(i).charAt(0);
			}
		}
		
		
	}
	
	
	
}
