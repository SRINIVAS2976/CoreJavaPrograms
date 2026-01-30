package com.tap.Package1;

 class Demo2Package1 extends Demo1 {
	 
	 @Override
	 void disp() {
	 System.out.println(a);
	 System.out.println(b);
	 System.out.println(c);
	 System.out.println(d);// here it shows error because private member cannot access in inherited class also 
 }
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

*/}
