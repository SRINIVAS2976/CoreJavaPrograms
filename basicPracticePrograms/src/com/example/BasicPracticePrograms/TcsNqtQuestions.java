package com.example.BasicPracticePrograms;

import java.util.Scanner;

public class TcsNqtQuestions {
	// this for sorted arrays .
	/*void printingOnlyOddSingleOccurenceOfTheGivenArray(int []arr) {
		int previousValue=0;
		for(int i=0;i<arr.length-1;i++) {
			if(previousValue==arr[i])continue;
			if(arr[i]!=arr[i+1] && previousValue!=arr[i]) {
				System.out.println(arr[i]);
				
			}
			else {
				previousValue=arr[i];
			}
			
		}
		if(arr[arr.length-1]!=arr[arr.length-2]) {
			System.out.println(arr[arr.length-1]);
		}
		
		}
	*/
	// o(log n )code as divide and conquer method.
	int findOddOccurence(int []arr, int left,int right) {
		int mid=Math.floorDiv(left+ right, 2);
		if(left==right) {
			return arr[left];
		}
		int leftLen=mid -left+1;
		if(leftLen%2==1) {
			return findOddOccurence(arr,left,mid);
		}
		return findOddOccurence(arr,mid+1,right);
		
	}
	

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter the size of the arrays");
		int size=Sc.nextInt();
		int []arr=new int [size];
		for(int i=0;i<arr.length;i++) {
			arr[i]=Sc.nextInt();
		}
		
		TcsNqtQuestions tcs=new TcsNqtQuestions();
		//tcs.printingOnlyOddSingleOccurenceOfTheGivenArray(arr);
		int res=tcs.findOddOccurence(arr, 0, arr.length-1);
		System.out.println(res);
	}

}
