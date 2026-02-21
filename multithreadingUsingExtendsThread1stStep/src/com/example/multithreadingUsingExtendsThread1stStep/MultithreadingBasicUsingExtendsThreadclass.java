package com.example.multithreadingUsingExtendsThread1stStep;

import java.util.Scanner;

class Demo1 extends Thread{
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
	class Demo2 extends Thread{
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
	class Demo3 extends Thread{
		@Override
	  public  void run() {
			System.out.println("adding 2 prices");
			Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();		
			int b=sc.nextInt();
			int c=a+b;
			System.out.println(c);
			try {
				Thread.sleep(10000);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
			
		}
	}

	


public class MultithreadingBasicUsingExtendsThreadclass {

	public static void main(String[] args) {
		Demo1 d=new Demo1();
		Demo2 d1=new Demo2();
		Demo3 d2=new Demo3();
	//	d.run();       // we cannot call directrly like this to achieve multithreading ,if we call ;like this it executes sequentially
		//d1.run();
		//d2.run();     
		              // we can call the run method indirectly using start method then it starts to worlk like a multiple process run at same time.
		d.start();
		d1.start();
		d2.start();
		
	} 

}
