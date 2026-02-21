package com.example.multithreadingVariousExamples;

import java.util.Scanner;

class Numbercalculation extends Thread{
	
	@Override
	public void run() {
		Printnumbers Pn=new Printnumbers();
		PrintString Ps=new PrintString();
		String t=Thread.currentThread().getName();
		
		if(t.equals("NumberCalculation")) {
			int a=10;
			int b=20;
			int c=a+b;
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(c);
		}
		else if(t.equals("Printnumbers")) {
			
			Pn.adding();
		}
		else{
			
			Ps.Characters();
		}
	}
	}

class Printnumbers {
	public void adding() {
		for(int i=0;i<=10;i++) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
	
}

class PrintString  {
	public void Characters() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
	 String	S=sc.next();
	 
	 for(int i=0;i<S.length();i++) {
		 try {
			Thread.sleep(3000);
		 } catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		 }
		 char ch=S.charAt(i);
		 System.out.println(ch);
	 }
	
	
	}
}


public class MultiThreadinginOneRunMethod {

	public static void main(String[] args) {
		
		Numbercalculation	t=new Numbercalculation();
		Numbercalculation	t1=new Numbercalculation();
		Numbercalculation	t2=new Numbercalculation();
		
		
		
		t.setName("NumberCalculation");
	     t1.setName("Printnumbers");
		t2.setName("PrintString");
		//t.setPriority(t.MIN_PRIORITY);
		//t1.setPriority(t.NORM_PRIORITY);
		//t2.setPriority(t.MAX_PRIORITY);
		t.start();
		t1.start();
		t2.start();
		
		
		//Thread t=new Thread();
		
	}	
	}
		
	
	
