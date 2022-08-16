package com.interview.Questions;

/*
 * print this pattern 
1
2 3
4 5 6
7 8 9 10
 */

public class RightAnglePatternPrint {

	public static void main(String[] args) {
			int k=1;
		for(int i=0;i<5;i++)
		{
			
			for(int j=i;j<=i;i++)
			{
				System.out.print(k++ +" ");
			}
			System.out.println();
		
			
		}
		
		
		
	}

}
