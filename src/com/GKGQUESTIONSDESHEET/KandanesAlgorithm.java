package com.GKGQUESTIONSDESHEET;

public class KandanesAlgorithm {
	
	
	//largeest subcontiguous Subarray -- maximum sum in the array from the number
	
	public static void main(String[] args) {
		
		int a[]= {-2,-3,4,-1,-2,1,5,-3};
		int sum=0;
		int max=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++)
			{
				sum=sum+a[j];
				if(sum>max) {
					max=sum;
				}
			}
			sum=0;
		}
		
		System.out.println(max);

			
	}

}
