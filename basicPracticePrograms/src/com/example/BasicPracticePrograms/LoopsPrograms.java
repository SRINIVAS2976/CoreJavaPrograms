package com.example.BasicPracticePrograms;
import java.util.Scanner;
public class LoopsPrograms {

	public static void main(String[] args) { // swaping program
		/*Scanner Sc=new Scanner(System.in);
		System.out.println("enter 2 values");
		int a=Sc.nextInt();
		int b=Sc.nextInt();
		int temp=a;
		a=b;
		b=temp;
		System.out.println(a);
		System.out.println(b);
		*/
		// without using temp variable that is withowt 3rd variable
		/*
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter 2 values");
		int a=Sc.nextInt();
		int b=Sc.nextInt();
		// only using 2 variables swap and same example like pen in 1 hand we adding both and keeping sam variable again- and again - to remove the value .thats it.
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println(a);
		System.out.println(b);
	}*/
		
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter n value");
		int n=Sc.nextInt();
		/*for(int i=1;i<=n;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}  */                         //  or
		
		// or very simplify code high complexity code .
		
		//for(int i=2;i<=n;i=i+2) {
			//System.out.println(i);
		//}
		
		// multiples of 2 and 3.till any given number.
	/*	for(int i=2;i<=n;i++) {
			if(i%2==0 || i%3==0) { // here we need to get 2,3 from user we should not hard code . i%a,i%b..
				System.out.println(i);
			}
			
		}*/
		
		
		           // printing multiplication tables logic
		/*int i=1;
		while(i<=10) {
		
			System.out.println(n+" x "+i+" = "+n*i);
			i++;
		}*/
		
		        // printing factors of n 
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.println("factorsof n are"+i);
			}
			
		}
		
	}
}


