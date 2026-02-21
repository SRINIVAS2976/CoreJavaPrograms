package com.example.multithreadingUsingExtendsThread1stStep;
class Alpha extends Thread{
	@Override
	public void run() {
		Thread t1=Thread.currentThread();
		
		try {
			
			Thread.sleep(3000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(t1.getName()+"is statement 1 executing");
		System.out.println(t1.getName()+"is statement 2 executing");
		System.out.println(t1.getName()+"is statemetn 3 executing");
		                                         // these are built in methods inside java , java default set priority is 5 , name always default is main unless u override it.
		
		/* System.out.println(t1.getName());
			
			System.out.println(t1.getPriority());
			System.out.println(t1.getThreadGroup());
			
		
		t1.setName("srini");
		
		t1.setPriority(4);
		System.out.println(t1);
		
	}*/
}
}
class Beta extends Thread{
	@Override
	public void run() {
		Thread t1=new Thread();
		
		
		try {
			
			Thread.sleep(3000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(t1.getName()+"is statement 1 executing");
		System.out.println(t1.getName()+"is statement 2 executing");
		System.out.println(t1.getName()+"is statemetn 3 executing");
	}
}
	
	


public class MultithreadingInbuiltMethods  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1=Thread.currentThread();
		System.out.println(t1.getName()+" thread started to run");     // main thread. if u want main thread to execute 1st u can put join() after main thread started 
		
		
       /*  System.out.println(t.getName());
		
		System.out.println(t.getPriority());
		System.out.println(t.getThreadGroup());
		t.setName("vicky");
		t.setPriority(7);
		System.out.println(t);
		*/
		Alpha a=new Alpha();
		Beta b=new Beta();
		
		try {
			
			a.start();
			System.out.println(a.isAlive());       // checking thread is alive or not thats it .
			a.join();              // this join() method says wait i will complete this alpha method a ,until that no one will execute ,thats why join()
			
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		try {
			
			b.start();
			System.out.println(b.isAlive());    // checking same thread alive or not
			b.join();  // same .. controlling which set of statements to execute 1st and 2nd .
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(t1.getName()+" thread ended successfully");    // main thread ended at last succesfull
		

		
		
	
	}

}

