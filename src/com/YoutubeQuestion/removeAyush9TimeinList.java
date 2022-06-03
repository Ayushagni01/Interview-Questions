	package com.YoutubeQuestion;

	import java.util.*;
public class removeAyush9TimeinList {
	
	public static void main(String[] args) {
	List<String> aa=new ArrayList<String>();
		aa.add("ayush");
		aa.add("ayush");
		aa.add("ayush");
		aa.add("ayush");
		aa.add("ayush");
		aa.add("ayush");
		aa.add("ayush");
		aa.add("ayush");
		aa.add("ayush");
		aa.add("ayush");
		removeAyush(aa);
		
	}

	public static void removeAyush(List<String> a)
	{
System.out.println(a.size());
	int c=0;
	
	for(int i=0;i<a.size();i++)
	{

		if(a.get(i).equals("ayush") && c==1)
		{
			
		a.remove(i);
		i--;
		}else if(a.get(i).equals("ayush") && c==0)
	        {
	          c=1;
		}
		else {
			
			//
		}
		
		

	}
	System.out.println(a);
	
}
}
