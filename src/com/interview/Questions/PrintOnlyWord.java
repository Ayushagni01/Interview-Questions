package com.interview.Questions;

public class PrintOnlyWord {
		public static void main(String[] args) {
			
			String  a="I love 1s ayush very much ";
			
			String arr[]= a.split(" ");
			int count=0;
			for(int i=0;i<arr.length;i++)
			{
				String word=arr[i];
				
				for(int j=0;j<word.length();j++)
				{
				//	System.out.println(word.charAt(j));
					if(Character.isDigit(word.charAt(j)))
				
					{
						break;
					}
					if(j==word.length()-1)
					{
						count++;
					}
				}
				
				
				
			}
		
			System.out.println(count);
		}
}
