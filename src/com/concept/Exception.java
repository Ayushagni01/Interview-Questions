package com.concept;

import java.io.FileNotFoundException;

public class Exception {
	
	
	
	public static void main(String[] args) {
		
		try{
			System.out.println("Inside Try Block");
			throw new RuntimeException("Error");
			//System.out.println("After Exception Thrown");
			} catch (Exception e) {
			System.out.println("Exception Occurred");
			} 
			finally {
			System.out.println("Finally");
			}


	}
	

}
