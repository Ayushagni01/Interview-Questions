 package com.concept.OOps;

 class Base {
	
public void A(String  a) {
		 
		 System.out.println("most Generic class");
	 }
	 
	 public void A(Integer a) {
		 
		 System.out.println("most Generic class");
	 }
	 
	 public void A(Object a)
	 {
		 System.out.println("Object class");
	 }
	 
	 
	
	}



	public class ElectricCar  {

	  

	    public static void main(String[] wheels) {
	    	Base a=new Base();
	    	a.A(null);
	    
	    }
	}

