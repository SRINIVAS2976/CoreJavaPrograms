package com.example.customExceptions;

import java.util.Scanner;
class UnderageException extends Exception{
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "ur age is too less to get license";
	}
	
	
}
class OverageException extends Exception{
	@Override
	public String getMessage(){
		return "ur too aged so ur not eligible for driving license";
	}
}

class Rto{
	int age;
	void acceptinput() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your age");
		 age=sc.nextInt();
	}
	
	void verify()throws Exception  {
		if(age>=18 &&age<60) {
			System.out.println("ur eligible for Ur Government license collect it from RTO office");
		}
		else if(age>60) {
			OverageException O=new OverageException();
			System.out.println(O.getMessage());
			throw O;
		}
		else {
			
			UnderageException U=new UnderageException();
			System.out.println(U.getMessage());
			throw U;
		}
		
	}
}

 class StateGovernment{
	Rto r=new Rto();
	public void inRto() { // creating method for maintaining all RTO office by one StatEgovernment so inside that we maintained using 1 method
		try {
			r.acceptinput();
			r.verify();	
		}
		catch(Exception e) {
			System.out.println("try again wrong age");
			try {
				r.acceptinput();
				r.verify();
			}
			catch(Exception f) {
				System.out.println("try again wrong age only 1 attempt left");
		
				try {
					r.acceptinput();
					r.verify();
				}
				catch(OverageException O) {
					System.out.println("sorry u entered multiple times ,ur age is too higher to get a license ,thank you");
				}
				catch(Exception g) {
					
					System.out.println("sorry u entered multiple times ,ur age is too under to get a license ,just grow up and come back .thank you");
				}
			}
		}
		}
	}

class CentralGovernment{
	StateGovernment Sg=new StateGovernment();
	CentralGovernment(){
		Sg.inRto();
	}
	
	
}
public class CustomeExceptionExample {
	
              public static void main(String[] args) {
	                      CentralGovernment Cg=new CentralGovernment();
}
}
