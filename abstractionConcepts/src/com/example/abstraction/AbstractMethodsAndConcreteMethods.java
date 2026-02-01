package com.example.abstraction;

 abstract class AbstractMethodsAndConcreteMethods {    // we cannot use both final and abstract keyword for class and variables and methods ,if methods have body we can use final
	 abstract void disp();
	 abstract void eat();
		 
 }
		
	abstract class B extends  AbstractMethodsAndConcreteMethods{
	
		   void disp() {                   // disp method comes to concrete method from abstract method here 
			System.out.println("hello");
		}
		//@inherited
		//abstract void eat() ;// still not comes to concrete ,already inherited from parent abstract class,
		void drink() {          // specialized method
			System.out.println("drinking water");
		}
	}
	class c extends B{

	
		void eat() {                      // now eat method comes to concrete .
			System.out.println("iam eating");
			
		}
	}	
	class d extends B{
		@Override
		void eat() {
			System.out.println("iam not eating");
		}
	}
	class behaviours{
		void livingbeings(AbstractMethodsAndConcreteMethods D){
			D.eat();
			D.disp();
			
		}
	}
	
  class AbstractMethodsAndConcreteMethod{
	
	public static void main(String[] args) {
		
		AbstractMethodsAndConcreteMethods d=new c();
		d child=new d();
		behaviours b=new behaviours();
	    b.livingbeings(d);
		b.livingbeings(child);
		

	}
	}
