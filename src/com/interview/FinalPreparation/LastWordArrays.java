package com.interview.FinalPreparation;

public class LastWordArrays {

	public static void main(String[] args) {
	
		String s = "   fly me   to   the moon  ";
		
		String[] arr=s.split(" ");
		
		String res="";
		for(int i=0;i<arr.length;i++)
		{
			
			if(arr[i].isEmpty())
			{
				
			}
			else {
				res=arr[i];
			}
			
			
			
		}
		
		System.out.println(res.length());
		
		
		

	}

}
