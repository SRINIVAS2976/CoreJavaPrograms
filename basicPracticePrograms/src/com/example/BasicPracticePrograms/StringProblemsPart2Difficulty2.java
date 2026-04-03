package com.example.BasicPracticePrograms;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class StringProblemsPart2Difficulty2 {
	//variations o given string in multiple ways .
	static void variationsOfGivenString(String s) {
		//first Type reversing by each word in a string u should reverse and print as same order of words.
	/*	String ans="";
		String []arr=s.split(" ");
		for(int i=0;i<arr.length;i++) {
			//char ch=s.charAt(i);
		 String word=arr[i];
			String t="";
			for(int j=word.length()-1;j>=0;j--) {       // reversing a string by each word.
				t=t+word.charAt(j);
			}
			ans=ans+t+" ";
		}
		System.out.println(ans);
	*/	
		
		
// second variation without reversing printing the words in first .of last in given string it mean (ex=ram is), (is ram)
		/*String []arr=s.split(" ");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}
	*/
	
// third variation printing each word with length .ex=india5 is2 my2 .
	/*String []arr=s.split(" ");
	
	for(int i=0;i<arr.length;i++) {
		String word=arr[i];
		String t="";
		for(int j=0;j<word.length();j++) {
			t=word+word.length()+" ";
			
		}
		System.out.print(t);
	}
	*/
// swapping the even index words to odd and odd to even.
/*	String []arr=s.split(" ");
	for(int i=0;i<arr.length-1;i=i+2) {// here i+2 because
		String word=arr[i+1];
		String temp=arr[i];
		String t="";
		
			t=word+" "+temp+" ";
		System.out.print(t);
	
	}
	if(arr.length%2!=0) {                 // for input only odd numbers of words then need to print last eleemnt.
		System.out.print(arr[arr.length-1]);
	}
	*/
	
// another type of swapping
/*	
	String []arr=s.split(" ");
	for(int i=0;i<arr.length/2;i++) {// here length /2 because it must go half or else it gives wrong output.
		String word=arr[i];
		String temp=arr[arr.length-i-1];
		String t="";
		t=word+temp+" ";
		System.out.print(t);
		
	
	}
	if(arr.length%2!=0) {                 // for input only odd numbers of words then need to print last eleemnt.
		System.out.print(arr[arr.length/2]);
	}
	*/
// another type of reversing last word and conatenating with 1st word(which is not reversed).and same 2nd word also not reversed .but last index 2 word revered and concatenated.
	                                // example given string-india is my country.output=yrtnuocindia ymis.
	String []arr=s.split(" ");
	String ans="";
	for(int i=0;i<arr.length/2;i++) {
		String word=arr[i];
		String rev=arr[arr.length-i-1];
		
		String t="";
		for(int j=rev.length()-1;j>=0;j--) {
			t=t+rev.charAt(j);
		}
		ans=t+word+" ";
		System.out.print(ans);
	}
	if(arr.length%2!=0) {
		System.out.println(arr[arr.length/2]);
	}
	}
static void removingDuplicateCharacter(String s) {
	
	String t="";
	
	for(int i=0;i<s.length();i++) {
		
		char ch=s.charAt(i);
		boolean found=false;
		
		for(int j=0;j<t.length();j++) {
			if(t.charAt(j)==ch) {
				found=true;
				break;
			}
		}
		if(!found) {
			t=t+ch;
		}
		
		
			
		}
	System.out.println(t);
	
	
	
}

//another way of removing duplicates using set very easy one .
static void removingDuplicatesOfEachCharacter(String s) {
	LinkedHashSet hs=new LinkedHashSet();   // linked hash set for insertion order and normal hashset doesnt folloe insertion order.
	for(int i=0;i<s.length();i++) {
		hs.add(s.charAt(i));
	}
	for(Object w:hs) {
		System.out.print(w);
	}
}
// printing only duplicate characters once.
static void printingDuplicateCharactersOnce(String s) {
	LinkedHashSet<Character> lhs=new LinkedHashSet<Character>();
	
	
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			for(int j=i+1;j<s.length();j++) {
				if(ch==s.charAt(j)) {
					lhs.add(ch);
					
					
				}
				
			}
			
			}
		
	
	for(Object w:lhs) {
		System.out.print(w);
	}
	
		}
		
	// need to find pairs of given array and print the number of pairs . pairs means 2 times the same element repeated.
static void countingNumberOfPairs(int []arr) {
    int count=0;
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				count++;
				break;
			}
		}
	}
	System.out.println(count);
}
// removing all duplicates in given array and printing only once in increasing order.
		
		static void removingDuplicatesPrintingIncreasingOrder(int []arr) {
			TreeSet <Integer>ts=new TreeSet<Integer>(); // for removing duplicate and sorted ordr so treeset.
			
			for(int i=0;i<arr.length;i++) {
				ts.add(arr[i]);
			}
			for(Object o:ts) {
				System.out.println(o);
			}
			
		}
		static void countingtheCharactersAndPrintingAccordingToThat(String s) {
			LinkedHashSet<Character> lhs = new LinkedHashSet<Character>();

			for (int i = 0; i < s.length(); i++) {
			    lhs.add(s.charAt(i));
			}

			for (Character ch : lhs) {
			    int count = 0;
			    for (int i = 0; i < s.length(); i++) {
			        if (ch == s.charAt(i)) {
			            count++;
			        }
			    }
			    System.out.println(ch + "" + count); // we need to always concatenate with empty string of both characters . to overcome ascii values of each character.
			}

			
		
		
		
		
		}
		
	

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter a String");
		String s=Sc.nextLine();
		//StringProblemsPart2Difficulty2.variationsOfGivenString(s);
		//StringProblemsPart2Difficulty2.removingDuplicateCharacter(s);
		//StringProblemsPart2Difficulty2.removingDuplicatesOfEachCharacter(s);
		//StringProblemsPart2Difficulty2.printingDuplicateCharactersOnce(s);
		/*
		System.out.println("enter a array");
		int []arr=new int[8];// i given random size . or else we can get size from user . 
		for(int i=0;i<arr.length;i++) {
			arr[i]=Sc.nextInt();
		}
		//StringProblemsPart2Difficulty2.countingNumberOfPairs(arr);
		StringProblemsPart2Difficulty2.removingDuplicatesPrintingIncreasingOrder(arr);
		*/
		StringProblemsPart2Difficulty2.countingtheCharactersAndPrintingAccordingToThat(s);
		
	}

}
