package com.AA.AllQuestion.MultiThreading;




public class JavaMultiThreadingConcept implements Runnable{

	public void run() {
			for(int i=1;i<=10;i++) {
				if(i%2!=0)
				{
					System.out.println(Thread.currentThread().getName()+" "+i);
				}
			}
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
	JavaMultiThreadingConcept s=new JavaMultiThreadingConcept();
	Thread s1=new Thread(s,"T1");
		s1.start();
		s1.join();
		Thread s2=new Thread(s,"T2");
		s2.start();
		s2.join();
	}

}
