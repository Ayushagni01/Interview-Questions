package com.java8.program;


import java.util.StringJoiner;
public class StringJner {
	
	
	public static void main(String[] args) {
		
		StringJoiner sj1 = new StringJoiner(",","[","]");
		 sj1.add("A");
		 sj1.add("B"); 
		 
		// System.out.println(sj1);
		
		 StringJoiner sj2=new StringJoiner(":");
		 sj2.add("p");
		 sj2.add("Q");
		 
		 sj1.merge(sj2);
		 System.out.println(sj1);
		 
	}
	

}
