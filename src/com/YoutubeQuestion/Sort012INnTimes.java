package com.YoutubeQuestion;

public class Sort012INnTimes {

	/*
	 * Date 27-05-2022
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {0,1,2,0,0,1,2,1,0,1,2,0,1};
	
		//sort any array with no times
		//sort012(a);
		
		
		//sort an array with n extra space  --- best and possible approached for solving this problem
		sort012NoExtraSpace(a);
		
	}

	private static void sort012NoExtraSpace(int[] a) {
		
		//0,1,2,0,0,1,2,1,0,1,2,0,1
		//i          			  k
		//j
		int t=0;
		int i = 0,j=0;
		int k=a.length-1;
		
		while(j<k)
		{
			
			if(a[j]==0)
			{
				t=a[i];
				a[i]=a[j];
				a[j]=t;
				i++;
				j++;
			}
			else if(a[j]==1)
			{
				j++;
			}
			else if(a[j]==2) {
				t=a[j];
				a[j]=a[k];
				a[k]=t;
				k--;
				
				
			}
			
			
		}
		
		for(Integer aa:a)
		{
			System.out.print(aa);
		}
		
		
		
		
		
	}

	private static void sort012(int[] a) {
		
	
		int s=0;
		int o=0;
		int e=a.length-1;
		int l2=0;
		int b[]=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
			{
				b[s]=a[i];
				s++;
				
			}
			else if(a[i]==2)
			{
				
				b[e]=a[i];
				e--;
				l2++;
			}else {
				o++;
			}
			
		}
		
		
		int rem=a.length-l2-1;
	
	System.out.println(rem);
		//0,1,2,0,0,1,2,1,0,1,2,0,1
		//0000011111222
			int l=0;
		while(l!=o)
		{
			b[rem-l]=1;
			l++;
			
		}
		
		for(Integer p:b)
		{
			System.out.print(p);
		}
		
		
	}

}
