package com.AA.AllQuestion;
import java.util.*;
public class PermutationString {
	
	
	//function is to find the smallest element greater than the first
	public static int getCeil(char[] str, char first, int l,
			int h)
	{
		int ci = l;
		for (int i = l + 1; i <= h; i++)
		{	if (str[i] > first && str[i] < str[ci])
			{
				ci = i;
			}	
		}
		//System.out.println(ci);
		return ci;
	}

	///print all the permutations in the sorted order 
	static void sortedPermutations(char[] str)
	{
	//get the size of the arrays
		int size = str.length;
	
	//sort the whole array once
		Arrays.sort(str);
		
		//one boolean value for checking the true value 
		boolean isFinished = false;
		while (!isFinished) {
			//printing the result
			System.out.print(String.valueOf(str)+" ");

			// get the smaller character than  next character.
			int i;
			for (i = size - 2; i >= 0; --i)
				if (str[i] < str[i + 1])
				{
					break;
				}	
			//doing isFInised =true
			if (i == -1)
				isFinished = true;
			else {
			
				
				//calling the ceiling function through which i get the ciel of the system 
				int ind = getCeil(str, str[i], i + 1,
						size - 1);

				//swappinh the value 
				char temp = str[i];
				str[i] = str[ind];
				str[ind] = temp;

			
				Arrays.sort(str, i + 1, size);
			}
		}
	}

	public static void main(String[] args) {
		
		String s="ABC";
		char[] a=s.toCharArray();
		sortedPermutations(a);
	}








































	private static void permutateSortedString(String s,int start,int end) {

		if(start==end)
		{
			System.out.print(s+" ");
		}
		else {

			for(int i=start;i<=end;i++)
			{
				s=swap(s,start,i);
				permutateSortedString(s,start+1,end);
				s=swap(s,start,i);

			}

		}

	}

	private static String swap(String s, int i, int j) {
		char temp; 
		char[] charArray = s.toCharArray(); 
		temp = charArray[i] ; 
		charArray[i] = charArray[j]; 
		charArray[j] = temp; 
		return String.valueOf(charArray);
	}

}
