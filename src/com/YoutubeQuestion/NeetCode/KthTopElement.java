package com.YoutubeQuestion.NeetCode;
import java.util.*;
public class KthTopElement {

	public static void main(String[] args) {
	
		int a[]= {1,1,1,2,2,3,3};
		int k=2;
		
	int c[]=	KthTopElement.topKFrequent(a,k);
		for(int h:c)
		{
			System.out.println(h);
		}
	
	
	}

	
	public static int[] topKKfrequent(int[] o,int k)
	{
		
		
		return null;
	}
	
	
	 public static int[] topKFrequent(int[] nums, int k) {
	        
	        
		    Map<Integer,Integer> amap=new TreeMap<Integer,Integer>(Collections.reverseOrder());
		        for(int i=0;i<nums.length;i++)
		        {
		        if(!amap.containsKey(nums[i]))    
		        {
		            amap.put(nums[i],1);
		        }else{
		            amap.put(nums[i],amap.get(nums[i])+1);
		        }
		        }
		        
		        int[] a=new int[k];
		        int c=0;
		        for(Map.Entry<Integer,Integer> aa:amap.entrySet())
		        {
		            a[c]=aa.getKey();
		            if(c==k-1)
		            {
		                
		                break;
		            }
		            
		            c++;
		        }
		        return a;
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		    }
	
}
