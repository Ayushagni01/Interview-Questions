package com.YoutubeQuestion.MustDoForProductBasedCompany;
import java.util.*;
public class LeadersinArray {

	
	public static void main(String[] args) {
		int a[]= {16,17,4,3,5,2};
	System.out.println(	LeadersinArray.leaders(a,0));
	}
	
	
	
	static ArrayList<Integer> leaders(int arr[], int n){
	    
	    ArrayList<Integer> aa=new ArrayList<>();
	    aa.add(arr[arr.length-1]);
	    int m=arr[arr.length-1];
	    for(int i=arr.length-2;i>=0;i--){
	     
	        if(arr[i]>m)
	        {
	               
	            m=arr[i];
	            aa.add(m);
	        System.out.println(arr[i]);
	        }
	        
	        
	    }
	    Collections.reverse(aa);
	    return aa;
	    
	    
	    
	    
	    }
}
 