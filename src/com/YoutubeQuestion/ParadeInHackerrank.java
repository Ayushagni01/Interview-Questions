package com.YoutubeQuestion;

import java.util.Arrays;

public class ParadeInHackerrank {
	
	
	public static void main(String[] args) {
		
		String a="001011";
	System.out.println(	getSwapTime(a));
		
		
	}
	 public static int getSwapTime(String color) {
		   
	        int c=0;
	        
	        boolean d=color.contains("01");
	       // System.out.println(d);
	        String a[]=color.split("");
	       // System.out.println(a.length);
	       
	        while(d!=false)
	        {
	        	
	        	
	            
	            for(int i=0;i<a.length-1;i++)
	            {
	                if(a[i].equals("0") && a[i+1].equals("1"))
	                {
	                
	                   a[i]="1";
	                   a[i+1]="0";
	               	i=i+1;
	                   
	                }
	         
	                
	            
	            }
	            color="";
	           // color=Arrays.toString(a);
	            for(int i=0;i<a.length;i++)
	            {
	            	color=color+a[i];
	            }
	            
	            d=color.contains("01");
	            System.out.println(color);
	            c++;
	            
	        }
	        
	       
	        
	  
	        
	    



	    return c;

	    }
}
