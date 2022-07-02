package com.concept.DesignPattern;

interface plan{
	
	public void getRate();
	
}


 class DomesticPlan implements plan{

	@Override
	public void getRate() {
		// TODO Auto-generated method stub
		System.out.println("The ratee is 30");
	}
	
}

  class InternationPlan implements plan{

	@Override
	public void getRate() {
		// TODO Auto-generated method stub


		System.out.println("The ratee is 20");
		
	}
	
}

 class classInstitutionalPlan implements plan{

	@Override
	public void getRate() {
		System.out.println("The ratee is 10");
		
	}
	
}


class GetFactory{
 public  plan  getFactoryMethod(String a) {
	 
	 if(a.equals("ayush"))
	 {
		 return new classInstitutionalPlan();
	 }
	 
	 
	 return null;
 }
	 
	 
 }
 

public class FactoryDesignPattern {
	
	public static void main(String[] args) {
		GetFactory aa=new GetFactory();
		plan a=aa.getFactoryMethod("ayush");
		a.getRate();
	}

}
