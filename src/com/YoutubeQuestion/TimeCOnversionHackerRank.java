package com.YoutubeQuestion;

public class TimeCOnversionHackerRank {
	
	public static void main(String[] args) {
		
		String s ="12:01:00AM";
		String res="";
		if(s.contains("AM"))
	    {
	        int a=Integer.parseInt(s.substring(0,2));
	        a=Math.abs(12-a);
	        String d=String.valueOf(a);
	        res=d+s.substring(2,s.length()-2);
	        System.out.println(res);
	        
	    }else{
	    	
	    	 int a=Integer.parseInt(s.substring(0,2));
	    	 if(a==12)
	    	 {
	    		 a=12;
	    	 }else {
		        a=Math.abs(12+a);
	    	 }
		        String d=String.valueOf(a);
		        res=d+s.substring(2,s.length()-2);
		        System.out.println(res);
	        
	    }
	}

}
