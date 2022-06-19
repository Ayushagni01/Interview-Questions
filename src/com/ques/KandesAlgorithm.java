package com.ques;

public class KandesAlgorithm {
	
	
	public static void main(String [] args)
	{
		
		int a[]= {-2,-3,4,-1,-2,1,5,-3};
		
		//-2
		//me ->  
		//mf ->
		
		int meh=0;
		int mf=Integer.MIN_VALUE;
	
		
		//printing out the index here only
		
		
		
		//printed all the index here
		
		for(int i=0;i<a.length;i++)
		{
			meh=meh+a[i];
			
			if(meh<a[i])
			{
				meh=a[i];
			}
			if(meh>mf)
			{
				mf=meh;
			}
			
			//value of largest sum contigous subarray
			
			
		}
		System.out.println(mf);
	}

}
