package com.example.BasicPracticePrograms;

import java.util.Scanner;

public class PrimeNumberSimpleProgram {
	/* boolean checkPrime(int n) {
		 if(n<=1) {
			 return false;
		 }
		for(int i=2;i*i<=n;i++) {
			
			if(n%i==0) {
				return false;
			}
		}
		return true;
	*/	
		 
	 // checking prime for certain range.
	 
	/* void checkPrime(int n,int m) {
		 for(int i=n;i<=m;i++) {
		 if(checkPrime(i)) {
				System.out.println(i);
			}
	 }
	 }*/
	
	/*void firstNPrimeNumbers(int n) {
		int count=0; // we neeed to take counter variable for breaking the loop . or else it will be infinte
		 for(int i=2; ;i++) {// infinite loop.without condition. // or for(int i=2;count<n;i++)// we can use this also instead of count break .
			 if(checkPrime(i)) {
				 System.out.println(i);
				 count++;
				 if(count ==n) {
					 break;
				 }
				}		
			
		}
		 */
		// printing all multiples n till x.
		void  printMultiples(int n,int x){
			
			for(int i=n;i<=x;i++) {
				if(i%n==0 ) {                  // i is increasing ,i is checking with multiple value of 'n'(i.e start value)
				    System.out.println(i);
				    
				}
			
				//continue;
			}
			for(int j=n;j<=n;j++) {
				if(j%n==0) {
					System.out.println(n);
				}
			}
				 
		 }
		
		
		// printing common multiples of a,b till n.
		
		
		
/*	void printCommonMultiples(int a,int b,int n){
			for(int i=1;i<=n;i++) {
				if(i%a==0 && i%b==0) {
					System.out.println(i);
				}
			}
	*/	
	
	// program to print first n common multiples of a and b.  example input(n=5) ,a=2,b=3. to print first 5 common multiples here.
	
		void printCommonMultiples(int a,int b,int n){
			int count=0;                                     // same like first n prime numbers. thats it .
			for(int i=1; ;i++) {
				if(i%a==0 && i%b==0) {
					System.out.println(i);
					count++;
					if(count>=n) {
						break;
					}
				}
			}
		}
		
		
		
		// progra for common factors n1 and n2.
	/*	void commonFactors(int n1,int n2) {
			int count=0;                     // always we need to take count variables for n values and common factor n values .to break the infinite loop.
			for(int i=1; ;i++) {
				if(n1%i==0 && n2%i==0) {
					System.out.println(i);
					
					count++;
					if(count>=n2) {
					break;
					}
				}
			}
		}
	*/	
		
		
		//efficient way using euclidean algorithm
	/*	void highestCommonFactors(int n1,int n2) {
			int n3=0;
			for(int i=n2;i>=1;i--) {
				if(n2>n1) {
					 n3=n2-n1;
					 n2=n3;
					
				}
				else {
					n3=n1-n2;
					n1=n3;
				}
			}
			System.out.println(n3);
			
	}
		*/
		
		
		
		// for LCM for given 2 numbers
		
	/*	void leastCommonMultiple(int n1,int n2) {
			//int count=0;
			for(int i=n1;;i++) {
				if(i%n1==0 &&i%n2==0) {
					System.out.println(i);
					break;
					}
				}
			}
			*/
		
		// efficient LCM PROGRAM USING FORMULA. Using Highest common factor method.  inside note book.
		
		/*void countNoofDigits(int n1) {
			int count=0;
			while(n1!=0) { // or for( ;n>0 ;){
				n1=n1/10;
				count++;
				
			}
			System.out.println(count);
			
			
		}
		*/
		void sumofAllDigits(int n1) {
			int sum=0;
			
		for( ;n1>0; ) {
			int n2=n1%10;
			sum=sum+n2;
			n1=n1/10;
		}
		System.out.println(sum);
			   
		}
		
		void printingReverseOrder(int n1) {
			int reversed=0;
			while(n1!=0) {
				reversed = reversed * 10 + n1 % 10;
				n1=n1/10;
					
		}
			System.out.println(reversed);
		
			
		}
		
		

	public static void main(String[] args) {     // [prime number for range .
		/*PrimeNumberSimpleProgram p=new PrimeNumberSimpleProgram();
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter the start value");
		int n=Sc.nextInt();
		System.out.println("enter the end value");
		int m=Sc.nextInt();*/
		
	 //  p.checkPrime(n, m);
	   
	   
	   
	   
	          // program to print first n prime numbers . input =5 means first 5 prime numbers.
	   
		/*PrimeNumberSimpleProgram p=new PrimeNumberSimpleProgram();
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter the start value");
		int n=Sc.nextInt();
		
	   p.firstNPrimeNumbers(n);
	   */
		
		
		
		//printing n till x multiples of all numbers.
	/*	PrimeNumberSimpleProgram p=new PrimeNumberSimpleProgram();
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter the start value");
		int n=Sc.nextInt();
		System.out.println("enter the end value");
		int x=Sc.nextInt();
		p.printMultiples(n, x);
	  */
		
		
		// printing common multiples of a,b till n.it means (given n=20 ,a=2,b=3 . printing common multiples of 2 and 3)
	/*	PrimeNumberSimpleProgram p=new PrimeNumberSimpleProgram();
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter the n value");
		int n=Sc.nextInt();
		System.out.println("enter 1st multiple ");
		int a =Sc.nextInt();
		System.out.println("enter 2nd multiple");
		int b=Sc.nextInt();
		p.printCommonMultiples(a,b,n);
		*/
		
		// print n common multiples of a and b.
		
	/*	PrimeNumberSimpleProgram p=new PrimeNumberSimpleProgram();
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter the n value");
		int n=Sc.nextInt();
		System.out.println("enter 1st multiple ");
		int a =Sc.nextInt();
		System.out.println("enter 2nd multiple");
		int b=Sc.nextInt();
		p.printCommonMultiples(a,b,n);
		
	*/
		
		// program for common factors
		
	/*	PrimeNumberSimpleProgram p=new PrimeNumberSimpleProgram();
	Scanner Sc=new Scanner(System.in);
	System.out.println("enter the 1st value");
	int n1=Sc.nextInt();
	System.out.println("enter 2nd value ");
	int n2 =Sc.nextInt();
	p.highestCommonFactors(n1, n2);
	*/	
		
		PrimeNumberSimpleProgram p=new PrimeNumberSimpleProgram();
		/*Scanner Sc=new Scanner(System.in);
		System.out.println("enter the 1st value");
		int n1=Sc.nextInt();
		System.out.println("enter 2nd value ");
		int n2 =Sc.nextInt();
		p.leastCommonMultiple(n1,n2);
		*/
		
		// to count the number of digits n
		/*Scanner Sc=new Scanner(System.in);
		System.out.println("enter the digits");
		int n1=Sc.nextInt();
		p.countNoofDigits(n1);
		*/
		
		
		
		//sum of all digits
		/*Scanner Sc=new Scanner(System.in);
		System.out.println("enter the digits");
		int n1=Sc.nextInt();
		p.sumofAllDigits(n1);
		*/
		
		
	  //printing in reverse ordere of given digits .
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter the digits");
		int n1=Sc.nextInt();
		p.printingReverseOrder(n1);
	}

}
