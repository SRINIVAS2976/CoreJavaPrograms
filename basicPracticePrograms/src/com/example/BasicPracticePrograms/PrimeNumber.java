package com.example.BasicPracticePrograms;
import java.util.Scanner;

public class PrimeNumber {

	    public static void main(String[] args) {
	       Scanner Sc=new Scanner(System.in);
	       boolean Isprime=true;
	       System.out.println("enter the start number");
	       int start=Sc.nextInt();
	       System.out.println("enter the end number");
	       int end=Sc.nextInt();
	       for( int n=start;n<=end;n++ ){
	            Isprime=true;
	       
	       if(n<=1){
	           Isprime=false;

	       }
	       else{
	       for(int i=2;i<n;i++){
	           
	       if(n%i==0){
	            Isprime=false;
	           break;
	       }
	       }
	       }
	       
	       if(!Isprime){
	           System.out.println(n+" number is not a prime" );
	       }
	       else{
	           System.out.println(n+" number  a prime");
	       }
	       
	       }
	       
Sc.close();
	    }
	    
	    }

