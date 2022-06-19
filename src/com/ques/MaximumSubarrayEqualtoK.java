package com.ques;

public class MaximumSubarrayEqualtoK {
	
	
	public static void main(String args[])
	{
		int a[]= {2,1,5,1,3,2};
		int k=3;
		
		bruiteForceApproached(a,k);
		
		
		
	}

	public static void TwoPointterApproached(int a[])
	{
		
		
		for(int i=0;i<a.length-2;i++)
		{
			
			
			
		}
		
	}
	
	
	//bruite force approached
	public static void	bruiteForceApproached(int a[], int k)
	{
		int max=0;
		int [] aa=new int[k];
		int sum=0;
		for(int i=0;i<a.length-2;i++)
		{
			sum=a[i]+a[i+1]+a[i+2];
			
			if(sum>max)
			{
				max=sum;
				System.out.println("sum is "+sum+"max is "+max+"a[i]="+a[i]+"a[i+1]="+a[i+1]+"a[i+2]="+a[i+2]);
				aa[0]=a[i];
				aa[1]=a[i+1];
				aa[2]=a[i+2];
				
			}
			
		}
		
		for(Integer aaa:aa)
		{
			System.out.println(aaa);
		}
	}
	
	
	
	
}


 