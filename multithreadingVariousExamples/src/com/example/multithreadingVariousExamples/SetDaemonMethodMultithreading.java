package com.example.multithreadingVariousExamples;
class MovieMembers {
                                        // used runnable lambda experession and another class with implemeting runnable interface 
   Runnable Lambda=()->{          // 
			Directors D=new Directors();
			MovieWorkers Mw=new MovieWorkers();
		Thread t1=new Thread(D.insteadofRun);
		Thread t2=new Thread(Mw);
		t1.setName("Sundarc");
		t2.setName("actors helper");
		
		t2.setDaemon(true);    // helper thread for this primary thread actor
		t1.setDaemon(true);     // also helper thread for actor .
		t2.start();
		t1.start();
		
		
		String t=Thread.currentThread().getName(); // geting thread name which we setted in main function
		
		try {
			Thread.sleep(1000);
					} 
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(t+" "+"is makeuping");
		System.out.println(t+" "+"is ready for shoot");
		System.out.println(t+" "+"after the shoot went to the house");
	
		

		
	};
	
}
class MovieWorkers implements Runnable{
	@Override
	public void run() {
		String t=Thread.currentThread().getName();
		try {
			
		
		
			Thread.sleep(2000);     // in daemon u should give diffrent sleep timings then only java can understand stop multiple threads, after t1 threas ,this will work.this are not important threads ,thats it
			
		}
		 catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println(t+" "+"light man ready ");
		System.out.println(t+" "+"camera man ready");
		System.out.println(t+"went to house");
		
}
}
class Directors {
	 
		Runnable insteadofRun=()->{String t=Thread.currentThread().getName();
		try {
			Thread.sleep(1000);                 // same daemon thread it is we need to give timing late ,because helper thread always 1st priority is primary thread after this one 
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(t+"director ready for shoot ");
		System.out.println(t+"director finsihed the shoot");
		System.out.println(t+"director left");
		
	
};
}

public class SetDaemonMethodMultithreading {

	public static void main(String[] args) {
		MovieMembers M=new MovieMembers(); // CREATING OBJECT FOR CLASS WHICH IMPLEMENTS RUNNABLE abstract method(Functional interface) .
		Thread t=new Thread(M.Lambda); //just using lambda expression for functional interface runnable()passing here
		
		
		
		t.setName("THALAPATHY VIJAY");
		
		
		
		t.start();
		
		

	}

}
