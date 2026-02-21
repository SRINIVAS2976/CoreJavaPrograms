package com.example.multithreadingVariousExamples;
class Queue {
	int a;
	boolean isDataPresent;//default value is false
	synchronized void setData(int a) {
		if(isDataPresent==false) {
			this.a=a;
			System.out.println("producer setted the value"+a);
			isDataPresent=true;
			notify();
		}
		else {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	synchronized void getData() {
		if(isDataPresent==true) {
			System.out.println("consumer got the value"+a);
			isDataPresent=false;
			notify();
		}
		else {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
}
class Producer extends Thread{
	Queue q;
	Producer(Queue q){
		this.q=q;
	}
	
 int i;
	@Override
	public void run() {
		try {
			Thread.sleep(3000);
			
			for(; ;) {
				
			    
				q.setData(i++);
				
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
class Consumer extends Thread{
	Queue q;
	Consumer(Queue q){
		this.q=q;
	}
	@Override
	public void run() {
		try {
			Thread.sleep(3000);
             for(; ;) {
			    
				q.getData();
             }
			}
		 catch (InterruptedException e) {
			// TODO Auto-generated catch bnulllock
			e.printStackTrace();
		}
	}
	}

public class ProducerConsumerProblem {

	public static void main(String[] args) {
		Queue q=new Queue();
		
          Producer P=new Producer(q);
          Consumer C=new Consumer(q);
          
          P.setName("Producer");
          C.setName("Consumer");
          P.start();
          C.start();
	}

}
