package com.YoutubeQuestion;

public class KandanesLongestSubArraySubContiguousArray {

	
	public static void main(String[] args) {
		

		int a[]= {-2,-3,4,-1,-2,1,5,-3};
		
		int meh=0;
		int msf=Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++)
		{
			meh=meh+a[i];
			
			if(meh>msf)
			{
				msf=meh;
			}
			if(meh<0)
			{
				meh=0;
			}
			
		}
		System.out.println(msf);
		
		
		
		
	}
	
	
	
	
	
	
	
}
