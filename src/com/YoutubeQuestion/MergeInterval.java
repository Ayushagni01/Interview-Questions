package com.YoutubeQuestion;

import java.util.*;
public class MergeInterval {
	
	
	public static void main(String[] args) {
		
	int a[][]=new int[8][2];
	
	a[0][0]= 1;
	a[0][1]=3;
	a[1][0]=2;
	a[1][1]=6;
	a[2][0]=8;
	a[2][1]=10;
	a[3][0]=8;
	a[3][1]=9;
	a[4][0]=9;
	a[4][1]=11;
	a[5][0]=15;
	a[5][1]=18;
	a[6][0]=2;
	a[6][1]=4;
	a[7][0]=16;
	a[7][1]=17;
	
	/*
	for(int i=0;i<a.length;i++)
	{
		
		for(int j=0;j<a[i].length;j++)
		{
			System.out.print(a[i][j]);
		}
	}
	*/
	
	mergeIntervals(a);
	
		
	
	}

	private static void mergeIntervals(int[][] a) {
	
		//how to sort out the 2darray
		
	
		//now i am thinking my array is sorted
		
		
	//	sortAnArray(a);
		
		for(int i=0;i<a.length;i++)
		{
			
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
		System.out.println("\n");
		}
		
		
		
	}

	private static void sortAnArray(int[][] a) {
		
		Interval[] in=new Interval[a.length];
		for(int i=0;i<a.length;i++){
			in[i]=new Interval(a[i][0], a[i][1]);
		}
		Arrays.sort(in);
	}

}
class Interval implements Comparable<Interval>{
	
	int s,e;
	public Interval(int s,int e) {
		this.s=s;
		this.e=e;
	}
	
	@Override
	public int compareTo(Interval o) {
		
		if(this.s!=o.s) {
			return this.s-o.s;
		}else {
			return o.s-this.s;
		}
		
	/*
		if(this.s>o.s)
		{
			return 1;
		}else if(this.s==o.s)
		{
			return 0;
		}else {
			return -1;
		}
		*/
	}
	
}