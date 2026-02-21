package com.example.BasicPracticePrograms;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
	     boolean Ispalindrome=false;
	 	Scanner Sc=new Scanner(System.in);
	 	System.out.println("Enter a  String");
	 	String s=Sc.next();
	 	int n=s.length();
	 	char []arr=s.toCharArray();
	 	for(int i=0;i<arr.length;i++){
	 	    
	 	    if(arr[n-i-1]==(arr[i]) ){
	 	        
	 	       continue;
	 	        
	 	    }
	 	 
	 	Ispalindrome=true;
	 	break;
	 	}
	 	     if(!Ispalindrome){
	 	   
	 	        System.out.println("given string is  a palindrome");
	 	    }
	 	     else{
	 	        System.out.println("given string is not a palindrome");
	 	     }
	 	

Sc.close();
	}

}
