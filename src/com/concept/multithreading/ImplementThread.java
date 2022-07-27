package com.concept.multithreading;

//implementing thread by using the thread class
 class ImplementThreads extends Thread{

	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}

//implementing the thread by using the Runnable interface

class ExampleOfRUnnable implements Runnable{

	@Override
	public void run() {
		
	}
	
}



//main method or driver method through which we can implement the thread class here 
public class ImplementThread{
	
	public static void main(String[] args) {
		ImplementThreads s=new ImplementThreads();
		s.start();
		
		ExampleOfRUnnable r=new ExampleOfRUnnable();
		r.run();
		
	}
	
}