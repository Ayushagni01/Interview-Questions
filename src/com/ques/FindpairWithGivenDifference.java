package com.ques;
import java.util.*;
public class FindpairWithGivenDifference {
	
	
	public static void main(String[] args) {
		int a[]= {5,20,3,20,50,80};
		int target=30;
		
		findPair(a,target);
	
	
	}

	public static boolean findPair(int[] arr,int n) {
		Map<Integer,Integer> amap=new HashMap<>();
		
		for(int i=0;i<arr.length;i++)
		{
			//int temp=target-a[i];
			amap.put(arr[i], amap.getOrDefault(arr[i], 0)+1);
		}	
			 for (int i = 0; i < arr.length; i++) {
				 
			      if (amap.containsKey(n+arr[i])) {
			    	  
			        System.out.print("Pair Found: (" + arr[i] + ", " +
			                      + (n + arr[i]) + ")");
			        return true;
			      }
			    }
			    System.out.print("No Pair found");
			    return false;
			  }
			
			
	

}
