package com.example.multithreadingVariousExamples;
class Bathroom{
	/*synchronized*/void bathroom() {  //here synchronized method for entire statmenets inside will be locked
		
		try {
			synchronized(this) {// synchronzed this block alone statements locked , 
			
			System.out.println(Thread.currentThread().getName()+" using bathroom");
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName()+" completed it ");
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName()+" next person entered ");
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName()+" next person completed");
			
			}
			   // this blocks not synchronized because not inside synchronized method
			System.out.println("now bathroom is free waiting for person to enter");
			System.out.println("still the person is inside the bathroom ,just wait outside");
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
 
	

class Boy extends Thread {
	Bathroom ba;
	Boy(Bathroom ba){
		this.ba=ba;
	}
	@Override
	public void run() {
		ba.bathroom();
	}
	
}
class Girl extends Thread{
	Bathroom ba;
	Girl(Bathroom ba){
		this.ba=ba;
	}
	@Override
	public  void run() {
		ba.bathroom();
	
}
}
class Others extends Thread{
	Bathroom ba;
	Others(Bathroom ba){
		this.ba=ba;
		
	}
	@Override
	public void run() {
		ba.bathroom();
	}
	
}
 
public class SynchronizationMultithreading {
	

	public static void main(String[] args) {
		Bathroom ba=new Bathroom();
		
		Boy b=new Boy(ba);
		Girl g=new Girl(ba);
		Others o=new Others(ba);
		
		b.setName("Boy");
		g.setName("Girl");
		o.setName("Others");
		b.start();
		g.start();
		o.start();
	   
		 
	}

}
