package com.concept.multithreading;

public class ThreadSleepExample implements Runnable {
	
	
	
	
	public static void main(String[] args) {
		ThreadSleepExample s=new ThreadSleepExample();
		Thread t=new Thread(s);
		Thread t1=new Thread(s);
		t.start();
		t1.start();
	}

	@Override
	public void run() {
		
		
		try {
			
			for(int i=0;i<=5;i++) {
				Thread.sleep(1000);
				System.out.println("The value is "+i);
			}
			
		}catch(InterruptedException e) 
		{
			System.out.println("this is the terminlogy");
		}
		
	}

}
