package com.example.BasicPracticePrograms;
//import java.text.DecimalFormat;
import java.util.Scanner;

//import jdk.internal.org.jline.terminal.TerminalBuilder.SystemOutput;

public class BasicUsingIfElseProblemsCommented {

	public static void main(String[] args) {
		int c=28;
		float f=((float)c*9/5)+32; // explicit type casting  double value 9/5 .9.0, or int vale 5.0. default in java we need to put either 9.5f or this float type casting explicit int to float.
		System.out.println(f);
		
		
		
		
		// multiple decimal values for only 2 decimal values to be a constraint. example.12.3456=12.34
		
		
	/*	Scanner Sc=new Scanner(System.in);
		DecimalFormat df=new DecimalFormat("#.##"); // this is making a str
		System.out.println("enter the value of double");
		double n=Sc.nextDouble();
	*/	
		
		
		//System.out.printf("%.2f",n); // this is one way to print certain decimal points . // it is manual.
	
		// System.out.println(df.format(n)); // another way of certain decimal .it is inbuilt method .decimal format object .
		 
		 
		
		
		                   // to check last ending with 7 or anything or anything ? example.177=7ends with
		
		
		
		
		
		Scanner Sc=new Scanner(System.in);
		/*   System.out.println("enter the value ");
			int n1=Sc.nextInt();
			if((n1%10==7)) {
				System.out.println("given number ends with 7");
				
			}
			
			else {
				System.out.println("not ends with 7");
			}
			*/
		
		
		
		
		  // getting last 2 digit value whther tru or false ==145,45 .
		 
	/*	 System.out.println("eneter the value.");
		 int n=Sc.nextInt();
		 if(n%100==45) {
			 System.out.println("the given value ends with 45");
		 }
		 else {
			 System.out.println("not ends with 45");
		 }
		 */
		
		
		
		
		  // removing last 2 digits .=145=1,1234=12.
		
		
		
		
		
	/*	int n1=0;
		
		 System.out.println("eneter the value.");
		 int n=Sc.nextInt();
		 // n1=n%10;
		   n1=n/100;
		   int n2=n1/100;  
		System.out.println(n2);
		 
		 */
		
		// finding ascii uppercase and lowercase
		

		/* System.out.println("eneter the value for ascii.");
		 int n=Sc.nextInt();
		  if(n>=65 &&n<=90) {
			  System.out.println((char)n); // explicit type casting larger data type to small.
		  }
		  else {
			  System.out.println("no ");
		  }
		*/
		  
		  
		  
		  // checking uppercase ,lower case or numeric or no output.
	/*	  System.out.println("eneter the value .");
			 int n=Sc.nextInt();
	
			  if(n>=65 &&n<=90) {
				  System.out.println("given value is Uppercase value");
			  }
			  else if(n<65){
				  System.out.println("given value is numeric");
			  }
			  else if(n>=97 &&n<=122) {
				  System.out.println("given value is lowercase");
			  }
			  else {
				  System.out.println("none of the above");
			  }
		  */
		
		
		
		
		  
		  // printing positive value for both negative value  and positive value we need to print positive value.
		  
		// System.out.println("eneter the value .");
		// int n=Sc.nextInt();
		// int positive=0;
		 // if(n<0 ) {
		//	  int n2=n<0?-n:n; // ternary operator.condition for both true and false print the value .
		//	  System.out.println(n2);
			 // positive=-n;
			 // System.out.println(positive);
		  //}
		/*  else {
			  positive=n;
			  System.out.println(positive);
		  }*/
		 
			  
			  
			  // printing largest among multiple values 
			  
			  System.out.println("enter no of values to find largest element");
			  int s=Sc.nextInt();
			System.out.println("enter the 1st value");
			int num=Sc.nextInt();
			 
			for(int i=1;i<s;i++) {
				System.out.println("enter the"+ (i+1 )+"value");
				int num2=Sc.nextInt();
				if(num2>num) {
					num=num2;
				}
				
				
			}
			System.out.println("largest element of given values are "+num);
			
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
		  
	Sc.close();
	}
            
}
