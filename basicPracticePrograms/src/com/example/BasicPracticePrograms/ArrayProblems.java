package com.example.BasicPracticePrograms;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayProblems {
	// sumof all elements inside array.
	int sumofElementsArray(int arr[]){// always should [] to denote array .
		
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];	
			
		}
		
			return sum;
		
		 
	}
	// print largest element inside array.
	int largestElement(int []arr) {    // returnnin is best design to reuse wherever we want .
		int max=arr[0];              // first keeping 1st element as max . if next iterating elements higher means update max . thats it . and for negative values overcome also.
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				
				max=arr[i];
			}	
		}
		return max;
	}
	//printing largest element index of the array
	int largestElementIndex(int []arr) {    // returnnin is best design to reuse wherever we want .
		int max=arr[0];         // first keeping 1st element as max . if next iterating elements higher means update max . thats it . and for negative values overcome also.
		int index=0;                  // taking one more variable for lasrgest element index
		for( int i=1;i<arr.length;i++) {
			if(arr[i]>max ) {
				max=arr[i]; // after largest element updation . current i value is updated to index . thats it.
				index=i;// here updating to index . current i value .
				
				
			}
		}
		return index;
		
	}
	// finidng number of times given k value is occured . occurences in given array.
	int countOfGivenValue(int arr[],int k) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(k==arr[i]) {
				count++;
			}
		}
		return count;
	}
	int kValueIndex(int arr[],int k) {
		for(int i=0;i<arr.length;i++) {
			if(k==arr[i]) {
				return i;
				
			}
		}
		System.out.println("no index found for the element ?");
		return -1;
		
		
	}
	int smallestElement(int []arr) {    // returnnin is best design to reuse wherever we want .
		int min=arr[0];              // first keeping 1st element as max . if next iterating elements higher means update max . thats it . and for negative values overcome also.
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<min) {
				
				min=arr[i];
			}	
		}
		return min;
	}
	
	// product of (n-1).to be stored in resultant array
	int productOfAllElements(int []arr){
		int product= 1;
	    	for(int i=0;i<arr.length;i++) {
	    		product=product*arr[i];
	    		
	    		
	    		
		}
	    	return product;
	}
	    	
	    	
	
	
	
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter no of values inside array");
	     int n=Sc.nextInt();
	     int i=0;
		int []arr=new int[n];
		// getting input from user . 
		for( i=0;i<arr.length;i++) {
			arr[i]=Sc.nextInt();
		}
		/*for( int i=0;i<arr.length;i++) {
			
			System.out.println(arr[i]);  // always for printing need to use separate loops or else error.
		}
		*/
		// printing all elements in even index.
		/*for(int i=0;i<arr.length;i++) {
			if(i%2==0) {                   // odd index or even index means i. odd elements or even elements means arr[i].
			System.out.println(arr[i]);
		}
		}*/
		
		ArrayProblems ap=new ArrayProblems();
		//ap.sumofElementsArray(arr);
		//ap.largestElement(arr);
		
		
	/*	int res=ap.largestElementIndex(arr);
		System.out.println(res);
	*/	
		
		// given array of n integers , and integer value k . we need to find number of occurences of k in given array 
		
	
	//System.out.println("enter k value.");
	// int k=Sc.nextInt();// for k value
		
		
//for number of occurences of maximum value of given Array .we already wrote method . just call that and store it inside int k
		
		
		
	/*	int k=ap.largestElement(arr);
		
		  int res= ap.countOfGivenValue(arr, k);
		  System.out.println(res);
	*/
	
		
		
// given array of n integers , and integer value k . we need to find a given k value index of that value .
		/*	
		System.out.println("enter k value.");
		 int k=Sc.nextInt();
		 int res=ap.kValueIndex(arr, k);
		 System.out.println(res);
		*/ 
		 
// given array to find sum(n-1)elements which are present inside the array of each values.ex arr[5,7,8,1,3,4,6] to find all combinations sum and print largest and smallest alone .
		
/*int max=ap.largestElement(arr);
int min=ap.smallestElement(arr);
int sum	=ap.sumofElementsArray(arr); 
System.out.println(sum-min);
System.out.println(sum-max);
*/
// """""""""""" elements to print a resultant array with product(n-1)elemnts present in the array.
		int product=ap.productOfAllElements(arr);
		int []resultantArray= new int[n];// creating an array for storing output as array .
		for(i=0;i<n;i++) {
			
		resultantArray[i]=product/arr[i];
		
		//System.out.println(resultantArray[i]);
		
		}
		System.out.println(Arrays.toString(resultantArray)); // arrays.tostring is best other than for each and other loops.to printing values inside array.
		
		
// we can print the array returning value using traditional for loop also .but tostring is best.
		







	}

}
