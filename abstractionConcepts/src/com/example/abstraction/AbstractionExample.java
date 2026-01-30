package com.example.abstraction;
 abstract  class parent{ // we can make abstract as parent and we can inherit 
	void disp() {
		System.out.println("iam a parent");
	}
	/*parent(float x,float b){ // we can create constructors in both abstract classes anot normal classes 
		
	}*/
       int x;
	 int y;
	 int c;
	parent(int x,int y){
		this();
		this.x=x;
		this.y=y;
		 c=x+y;
	}
	parent(){
		
	}
}
 class child extends parent{ // here we can extend abstract class of parent and non abstract class also eventhough this class is abstract ,but according to that we need to create object and acess it ,
	 void disp() {           // for abstract classes we cannot create object but with help of child and parent object we can call that
		 System.out.println("iam a child of u");
	 }
	/* child(int a,int b){
		 super(12.5f,10.5f);
	 }*/
	 private int a;
	 private int b;
	 child(int a,int  b){
		 super(20,50); // we r explicitly calling the parent constructor ,implicitly jvm cannot call because abstract class there is no objects
		 this.a=a;
		 this.b=b;
	 }
	  void disp1() {
		 System.out.println(a);
		 System.out.println(b);
		 System.out.println(x);
		 System.out.println(y);
		 System.out.println(c);
	 }
 }

public class AbstractionExample {

	public static void main(String[] args) {
		parent ref=new child(100,200);  // here error shows if u try to inherit abstract child class 
		ref.disp();
		((child)(ref)).disp1();   // downcasting forcing explicity parent class to access child class specialized method
	}

}
