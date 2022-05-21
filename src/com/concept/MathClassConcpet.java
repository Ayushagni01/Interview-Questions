package com.concept;

public class MathClassConcpet {

	
	
	public static void main(String[] args) {
		
		
		  int i1 = 27;
		  int i2 = -45;
		  double d1 = 84.6;
		  double d2 = 0.45;
		  double d3=34.4;
		  
		  //abs
		  System.out.println(Math.abs(i2));     //45
		  //round
		  System.out.println(Math.round(d1));  //85
		  
		  System.out.println(Math.round(d3));   //34
		  
		  System.out.println(Math.round(d2));  //0
		  
		  //ciel --  increasing value --return things in doubles -- getting the greater value always
		  System.out.println(Math.ceil(d1));  //85
		  
		  System.out.println(Math.ceil(d3)); //1
		  
		  System.out.println(Math.ceil(d2));  //35
		  
		  //floor
		  System.out.println(Math.floor(d1));  //84
		  
		  System.out.println(Math.floor(d3));   //0
		  
		  System.out.println(Math.floor(d2));  //34
		  
		  
	}
}
