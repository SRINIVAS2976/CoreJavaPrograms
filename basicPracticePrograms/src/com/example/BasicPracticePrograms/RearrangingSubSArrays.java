package com.example.BasicPracticePrograms;

import java.util.Scanner;

public class RearrangingSubSArrays {
	// either while loop or for loop anything right. // higher space complexity problem.
	void reArrangingArrays(int[]arr){
		int i=arr.length-1;
        int j=arr.length-1;	
        while(i>=0) {
        	if (arr[i]==-1) {
				i--;
			} 
        	else {
                 arr[j]=arr[i];
                 i--;
                 j--;
			}
        }
        while(j>=0) {
        	arr[j]=-1;
        	j--;
        }
        
	
	}
	void endingWith0PrintAllArraysEndingValuesWillBe0(int[]arr) {
		int i=0;
		int j=0;
		while(i<arr.length) {
			if(arr[i]==0) {
				i++;
			}
			else {
				arr[j]=arr[i];
				i++;
				j++;
			}
		}
		while(j<arr.length) {
			
			arr[j]=0;
			j++;
		}
				}
	
	void printingAllconsecutiveSubArrays(int[]arr) { // consecutive for all sub arrays means even if there is element in single valu u need to print that . check the question in main .
		for (int i = 0; i < arr.length; i++) {
		    System.out.print(arr[i]);   // for printing all 1st values as sub arrays .

		    while (i < arr.length - 1 && arr[i + 1] == arr[i] + 1) { // this condition for checking current sub array 1st value is equal to next value .if it is equal . then print the next value at side.
		        System.out.print("," + arr[i + 1]);
		        i++;
		    }

		    System.out.println(); // after 1 consecutive array completed go to next line .
		}
		}
	void printingLengthOftheSubArray(int[]arr) {
		
		for(int i=0;i<arr.length;i++) {
			int count=1; // we r updating each time count =1 . to each iterative element.
			 while (i < arr.length - 1 && arr[i + 1] == arr[i] + 1) { // only enters when condition true
			       // System.out.print("," + arr[i + 1]);
			        count++; //only increase value if conditio true that means consecutive subarrays present
			        i++;
			    }
			
			 System.out.println(count);
			// System.out.println();
			
		}
	}
	void printingLongestOfAllSubArrays(int[]arr) {
		int max=Integer.MIN_VALUE;
		int i=0;
		int maxStartingIndex=0; // taking 1 varaible outside for loop (outside)
		while(i<arr.length) {
		 int count=1;
		 int start=i; // taking this variable to taking the maximum count index value i .
	    while (i < arr.length - 1 && arr[i + 1] == arr[i]+1  ) {  // for longest su array increasing order means . just arr[i+1]>arr[i]. this condition only change others are same.
	    	count++;
	        i++;
	    }
	   if(count>max) {
		   max=count;
		   maxStartingIndex=start;// here we r giving the current i where the max found updating to that outside variable
		 
	   }
	   i++;// increasing the 1st while loop.
		}
		for(int j=maxStartingIndex;j<maxStartingIndex+max;j++) { // here using that variable to print the longest sub array .from the condition starting index to end index.thats why maxstartindex+max.0+5
			System.out.print(arr[j]+" ");
		}
	   
	   
	}
		
	
		
	
	
		
		
	

	public static void main(String[] args) {
		// given an array of size n with positive integrs abd -1.write a program to rearrange the array such that all -1 are present at first of the array.
		Scanner Sc = new Scanner(System.in);
		System.out.println("enter the size of the arrays");
		int size = Sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Sc.nextInt();
		}
		RearrangingSubSArrays ra=new RearrangingSubSArrays();// this case works only arrays/objects only.
		//ra.reArrangingArrays(arr); // same reference or different reference in method .the values u doing operations will be changed . but when u pass a value.the values wil not change in method also gives same values
		
		// how here  printing because of pass by reference concept . same concept . values get updated for reference .we dont need to return in method to main.
	/*	for(int i=0;i<arr.length;i++) {  // why here because we r directly updating the given array using 2 pointers , thats it by same reference values get modified .so output wil be perfect as per method .
			System.out.println(arr[i]);
		}
	*/	
		//given an array of size n with positive integrs and 0.write a program to rearrange the array such that all 0 are present at end of the array.
 
	/*	ra.endingWith0PrintAllArraysEndingValuesWillBe0(arr);
		for(int i=0;i<arr.length;i++) {  // why here because we r directly updating the given array using 2 pointers , thats it by same reference values get modified .so output wil be perfect as per method .
			System.out.println(arr[i]);
		}
	*/	
		
		// to print all consecutive subarrays such as given array integers example =5,12,13,14,9,2,3,4,5.output -5,
																												//12,13,14.(consecutive)
																												//9
																												//2,3,4,5(consecutive).
		
		
		//ra.printingAllconsecutiveSubArrays(arr);
		//ra.printingLengthOftheSubArray(arr);
		ra.printingLongestOfAllSubArrays(arr); 
	}

}
