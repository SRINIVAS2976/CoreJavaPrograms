package com.example.BasicPracticePrograms;

import java.util.Scanner;

public class UsingMethodsProblemSolving {
	int count=0;
	String printFactors(int n) {
        // printing factors of n 
		for(int i=1;i*i<=n;i++) {
			if(n%i==0) {
				count++;
				//System.out.println("factorsof n are"+i);
			}
					
	}
		
		//System.out.println(count); // printing count value o how many numbers are factors of given integer .
		return count==2?"prime":"not prime"; // checking prime efficient way.
	}
	         // checking given value prime or not .
	void primeNumber(int n){
		if(n<=1) {
			System.out.println("not a prime");
			return ;                    // we r using dummy return to exit the method . instead of repeating the loop.
		}
		
		for(int i=2;i*i<=n;i++) {// i*i<=n this is more efficient loop runs only 10 times . for bigger values , square root of n .
		if(n%i==0 ) {
			
			System.out.println("it is not aprime");
			return ;    // here also same exiting the method
		}		
	}
        System.out.println("its a prime value");
		
		
	}
	
	
	
	

	public static void main(String[] args) {
		
		UsingMethodsProblemSolving pf=new UsingMethodsProblemSolving ();
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter the value");
		int n=Sc.nextInt();
			//pf.printFactors(n); // passing the inuput directly to the method .
		//int res=pf.printFactors(n);// or
		
		//System.out.println(res);
		// or
		System.out.println(pf.printFactors(n)); //this also one way to get a value of returning that.
		Sc.close();
	}
		
		////// checking prime number using method call.
		// prime means only 2 factors .
		//pf.primeNumber(n); // instead of writing specific method for prime we can check with factors for count factors using previous method . if count =2 print prime ,else not prime.
		
		
		


	
	
	}

	
