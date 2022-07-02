package com.concept.DesignPattern;


class SingleTonD{
	
	
	private static SingleTonD  obj=new SingleTonD();  
	private SingleTonD() {}
	
	//static fatcory method through which we can get the object
	public static SingleTonD getInstance() {
		return obj;
	}
	
	
	public void demoOfSingleTonObject() {
		System.out.println("Get SingleTon Object printed");
	}
	
}





public class SingleTOnDesignPattern {

	public static void main(String[] args) {
		SingleTonD d=SingleTonD.getInstance();
		d.demoOfSingleTonObject();
	}
	
	
}
