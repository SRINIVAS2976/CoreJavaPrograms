package com.example.Interface;
@FunctionalInterface                                                   // everything java 8 only
interface Print{
	void disp(int a,String b,char c,boolean d, double f);
}
/*class Display implements Print{ // this is outer class implementation of interface print 
	@Override
	public void disp() {
	System.out.println("displaying");
	}
}*/
public class AnonymousClassAndLamdaExpressions {

	public static void main(String[] args) {
		/*class Display implements Print{ // this is inner class of interface print implementstion to achieve more security
			@Override
			public void disp() {
			System.out.println("displaying");
			}	
		}
		Display d=new Display();
				d.disp();
	}*/
		// anonymous class remove the class name and other relaed bodies
	/*	   Print P=new Print()   // we r directly creating object during the class creation after class creation ended we ended with semicolon. that it
		   { 
			@Override
			public void disp() {
			System.out.println("displaying");
			}
		};// here only object creation is ended 
		P.disp();
	}*/
		
		//now Lambda expressions still for code simplification and more security too 
		
		Print s=(a,b,c,f,d)->{ System.out.println("display"); System.out.println(a+b);System.out.println(f+b);};// lambda expression only applicable only one abstract method that is functional interface
		s.disp(10,"srini",'c',true,12.5);
	}	
		
}


