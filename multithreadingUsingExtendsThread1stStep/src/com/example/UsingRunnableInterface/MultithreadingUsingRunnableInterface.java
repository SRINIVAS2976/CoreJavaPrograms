package com.example.UsingRunnableInterface;

import java.util.Scanner;
import java.util.concurrent.RunnableFuture;


class Demo1 implements Runnable{
	@Override
	public  void run() {
		System.out.println("print alphabets");
		
		for(int i=65;i<=91;i++) {
			System.out.println((char)i);
		
		try {
		Thread.sleep(1000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		}
	}
}
	class Demo2 implements Runnable{
		@Override
		public void run() {
			System.out.println("print the values from 1-10");
			
			for(int i=0;i<=20;i++) {
				
				   System.out.println(i);
			
		   
				   try {
					   Thread.sleep(3000);
				   }
				   catch(Exception e) {
					   e.printStackTrace();
				   }
				}
				}
			}
							

public class MultithreadingUsingRunnableInterface {

	public static void main(String[] args) {
		Demo1 d=new Demo1();
		Demo2 d1=new Demo2();
		//Demo3 d3=new Demo3();
		                      // for implements runable interface .u should alway create Thread object for thread class to create thread in stack frame
		Thread t=new Thread(d);
		Thread t1=new Thread(d1);  // passing class object to act like a thread 
		//Thread t2=new Thread(d3);
		t.start();
		t1.start();   //indirectly calling thread0,thread1, thread class instead of run()method we use start()
		//t2.start();
		

	}

}
