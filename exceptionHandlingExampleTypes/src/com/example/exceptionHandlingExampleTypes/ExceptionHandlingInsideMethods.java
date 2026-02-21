
package com.example.exceptionHandlingExampleTypes;

import java.util.Scanner;

class Method1{           // actually we need to handle the exceptions only where the exceptions occuring ,we need to handle inside that method only its the gud way.
	void fun1() {
		System.out.println("jdbc connection established3");
		Scanner sc=new Scanner(System.in);	
			System.out.println("enter the numerator");
		int a=sc.nextInt();
		System.out.println("enter the denominator");
		int b=sc.nextInt();
		int c=a/b;
		System.out.println(c);
		
			System.out.println("enter valid denominator");
		
		
			System.out.println("connnection terminated3");
			
			sc.close();
	}
}
class Method2{
	
	void fun2() {//in this method we r calling top mthod
		
		System.out.println("jdbc connection established2");
		Method1 m=new Method1();
		m.fun1();
		System.out.println("connnection terminated2");
		}
		                               // here we r using try catch in different method so the Java RTS will check entire program there is TRY nad Catch for handling exception ,if it is there it will catch and execute the bottom statements after catch .
	/*	try {
			Method1 m=new Method1();
			m.fun1();
		}
		catch(Exception e) {
			System.out.println("give valid denominator");
		}
		System.out.println("connnection terminated2");
	}*/
	
}
class Method3{
	void fun3()throws Exception {   // here we r calling the top method
		System.out.println("jdbc connection established1");
		Method2 m=new Method2();
		m.fun2();
		System.out.println("connnection terminated1");
	
		try {
			Method2 m0=new Method2();
			m.fun2();
			Method1 m1=new Method1();
			m1.fun1();
		}
		catch (ArithmeticException Ae) {                                        // here we always we should use only at first child exceptions 
			System.out.println("arithmetic exeption");                  
		}
		catch(Exception e) {                                                  // here this Exception is always used at last only ,because it is for a programmer not to do some errors ,
			System.out.println("give valid denominator");
			throw e;                      // will directly throws this exception to main function
		}
		System.out.println("connnection terminated1");
	}}


public class ExceptionHandlingInsideMethods {    // so in java it looks for every try and catch blocks inside program u cann handle different exception for diffeent method using other methods also .

	public static void main(String[] args)throws Exception { // throwing exception to 'DEH'It is knows as ducking the exception
		  // Method3 m3=new Method3();
		  // m3.fun3();
		try {
			Method3  m3=new Method3();  // here we need to call the method3 to start the execution . here it will stack race , first 1,2,3 then at last 3,2,1.
			m3.fun3();
		}
		catch(Exception e) {
			System.out.println("problem in code");
			throw e;
			
		}
		System.out.println("connection terminated in main");

	}

}

