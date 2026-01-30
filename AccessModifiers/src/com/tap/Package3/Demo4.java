package com.tap.Package3;
import com.tap.Package1.*;// we need to import a package class demo1 to here
 class Demo4 {
	void disp() {
		Demo1 d=new Demo1();// we must create object to access different class varibales or methods or different package class we need to access varibale and methods .
	    System.out.println(d.a);
	                            // here except public variable everything shpws error because  only public from `1st package can be accessed ,other modifiers we cannot access this because others are in different package and not inherited too 
	    System.out.println(d.b);
	    System.out.println(d.c);
	    System.out.println(d.d);
	}

}

