package com.ques;

public class TwoSumApproach {
	
	//only applicable when the array is sorted
	public static void main(String args[])
	{
	//	int a[]={-3,2,3,3,6,8,15};
		int a[]={2,7,11,15};
		int target=9;
		for(int i=0;i<a.length;i++)
		{
			
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==target)
				{
					System.out.println("First Number is "+a[i]+" Second is "+a[j]);
				}
			}
			
		}
		
		
		
		
	}

	public static void OptimsedApproachForTwoSum(int[] a) {
		int s=0;
		int e=a.length-1;
		int t=9;
		
	while(s<e)
	{
		if(a[s]+a[e]==t)
		{
			System.out.println("Starting index is "+s+"ending index is "+e);
			break;
		}
		if(a[s]+a[e]>t)
		{
			e--;
		}else {
			s++;
		}
		
		
	}
	}
	
	//when the array is not sorted 
	

}
