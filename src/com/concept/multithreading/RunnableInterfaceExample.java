package com.concept.multithreading;

public class RunnableInterfaceExample   implements Runnable {
	
	
	@Override 
	public void run() {
		System.out.println(Thread.currentThread().getName());
		//output is random in nature in thread class for printing the name of the thread
	}
	
	
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		RunnableInterfaceExample tt=new RunnableInterfaceExample();
		for(int i=1;i<=5;i++)
	{
			Thread t=new Thread(tt);
		t.start();
}	

		
		
	}
	
	

}
