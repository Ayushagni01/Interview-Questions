package com.AA.AllQuestion;

public class permutationOfString {
	public static void main(String[] args) {
	String a="ABC";
	String ans="";
	permutate(a,ans);
		
	}

	private static void permutate(String s,String answer) {
		
		 if (s.length() == 0)
		    {
		        System.out.print(answer + "  ");
		        return;
		    }
		 
		 
		    for(int i = 0 ;i < s.length(); i++)
		    {
		        char ch = s.charAt(i);
		        String left_substr = s.substring(0, i);
		        String right_substr = s.substring(i + 1);
		        String rest = left_substr + right_substr;
		     //  System.out.println(left_substr+"   "+right_substr+"    "+rest+"   "+answer+ch);
		       permutate(rest, answer + ch);
		    }
		
	}
}
