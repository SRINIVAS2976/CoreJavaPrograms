package com.tap.Package2;
import com.tap.Package1.*;// we also need to import a package class from here . for different package we need to import it 

class Demo3 extends Demo1 {
     void disp() {
    	 System.out.println(a);
    	 System.out.println(b);
    	 System.out.println(c);                // default member from different package will not work
    	 System.out.println(d);// private member also will not work
     }
}

