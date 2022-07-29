package com.YoutubeQuestion.NeetCode;


//29/05/2022
import java.util.*;
public class ContainsDupliacte {

	
	public static void main(String[] args) {
		
		int n[]= {1,2,3,4,5};
		
		Set<Integer> aset=new HashSet<Integer>();
		for(int a:n)
		{
			if(!aset.add(a))
			{
				System.out.println("Return true");
				break;
			}
		}
	
		
	}
	
	
	
}
