package com.ques;

public class primeNumber {
	
	
	public static boolean numberIsPrime(int n) {
		int flag=0;
		boolean f=false;
		  for(int i=2;i<=n/2;i++){      
			    if(n%i==0){      
			    
			     flag=1;      
			     break;      
			    }      
			   }      
			   if(flag==0)  { return true; }  
			   
			   return false;
			  }//end of else 
		
		
	
	
	
	public static void main(String args[])
	{

		int c=0;
		int a[]= {3, 6, 466, 8, 9999, 21, 5, 7777};
		boolean flag=false;
		
		for(int i=0;i<a.length;i++)
		{
			flag=numberIsPrime(a[i]);
			if(flag)
			{
			//	System.out.println(a[i]);
				c++;
			}
		}
		System.out.println(c);
		
		}
		
		
	
}