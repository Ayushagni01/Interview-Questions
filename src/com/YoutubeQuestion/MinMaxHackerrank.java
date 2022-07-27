package com.YoutubeQuestion;

import java.util.*;
public class MinMaxHackerrank {
	
	
	
	
	public static void main(String[] args) {
		
		int arr[]= {1,3,5,7,9};
        long tot=0;
        int min =0;
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            tot=tot+arr[i];
            if(arr[i]>max){
                max=arr[i];
            }
             if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(tot-max+" "+(tot-min));

		
		
	}

}
