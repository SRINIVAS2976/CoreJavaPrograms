package com.example.BasicPracticePrograms;
import java.util.Scanner;

public class FibonacciSequence {

	public static void main(String[] args) {
	        int n1=0;
	        int n2=1;
	        // int sum=0;
	         Scanner Sc=new Scanner(System.in);
	         System.out.println("enter the end number to find fibonacci sequence");
	         int endNumber=Sc.nextInt();
	         System.out.println("fibonacci sequence is");
	        for(int i=0;i<endNumber;i++){
	            System.out.println(n1);
	            int next=n1+n2;
	            n1=n2;
	            n2=next;
	             System.out.println("fibonacci value after adding"+n2);
	        }
	      Sc.close(); 
	  }
	}


