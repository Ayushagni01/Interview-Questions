package com.Algrotithm;

public class BinarySearch {
	
	
	public static void main(String[] args) {
		
		int []a= {1,2,3,4,5,6,7,8,9,10};
		SearchTheElement(a,9);
	}

	private static void SearchTheElement(int[] a, int i) {
		int low=0;
		int high=a.length-1;
		int mid=0;
				boolean flag=false;
		
		//binary search algorithm uses two pointer approached		
		while(low<=high)
		{
			
			mid=(low+high)/2;

			//greater 
			if(a[mid]>i)
			{
				high--;
			}
			if(a[mid]<i)
			{
				low=mid;
			}
			
			//smaller 
			
			//if mid
			if(a[mid]==i)
			{
				flag=true;
				System.out.println("Element found at position "+mid);
				break;
			}
			
			
		}
				
				
				
		
	
	
	}

}
