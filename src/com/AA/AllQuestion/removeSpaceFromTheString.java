package com.AA.AllQuestion;

public class removeSpaceFromTheString {
	
	
	public static void main(String[] args) {
		
		String a="ayushagnihotri@aa#344goa";
		String res="";
	
		for(int i=0;i<a.length();i++)
		{
			if(Character.isLetter(a.charAt(i)))
			{
			
				res=res+a.charAt(i);
			}
		}
		System.out.println(res);
		
		//ascii code of a to z is 97 122
		//ascii code of Ato Z 60 to 90
		//ascii code of 1 to 9 48 to 57
		
	}

	public static String  removeSpace(String a, String res) {
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i)!=' ')
			{
				res=res+a.charAt(i);
			}
		}
		return res;
	}

}
