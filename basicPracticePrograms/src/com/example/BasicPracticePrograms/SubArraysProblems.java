package com.example.BasicPracticePrograms;

import java.util.Scanner;



import java.util.HashMap;

public class SubArraysProblems {
void printAllSubArrays(int []arr,int k){ // subarrays means only adjacent values . for example given array inttegers.512493. sub arrays for size 3=512,124,249,493.
	
	for(int i=0;i<=arr.length-k;i++) {// here i<arr.length-k .because for i  value it must go for before final 3 or else it says arrayindex out of bound exception.yes if array size is 8 means .it must go upto 5 thats why array size-k value .8-3=5.
		
		for(int j=i;j<i+k;j++) { // here we r checking conditions , j<i+k .because here each iteration i value increases to next , k also increases to next . so j iteration should be increased each and every time . thats why i+k
			 
				System.out.print(arr[j]);		
		
		}
		System.out.println();// for next line .
	}
		
		
	}
void printSumOfAllSubArrays(int []arr,int k) {
	
for(int i=0;i<=arr.length-k;i++) {// here i<arr.length-k .because for i  value it must go for before final 3 or else it says arrayindex out of bound exception.yes if array size is 8 means .it must go upto 5 thats why array size-k value .8-3=5.
	int sum=0;// we need to update sum each time .thats it.resetting sum=0;
		for(int j=i;j<i+k;j++) { // here we r checking conditions , j<i+k .because here each iteration i value increases to next , k also increases to next . so j iteration should be increased each and every time . thats why i+k
			 
			sum=sum+arr[j]; // we need to sum each subarray values . if subarray size =3 then we need to sum first 3 element sum and print it the final sum only thats why sum in bottom
			
			
				
		
			
		
		}
		System.out.println(sum); 
		System.out.println();// for next line .
	}
}

int countSumofSubArraysEqualToGivenKValue(int[]arr,int k,int x) {
	int count=0;
	for(int i=0;i<=arr.length-k;i++) {
		int sum=0;
			for(int j=i;j<i+k;j++) { 
				sum=sum+arr[j]; 
					
			
				
			
			}
			if(x==sum) {
				count ++;
			}
			
		}
	return count;
	
}
void printSubArraysEqualToGivenKValue(int []arr,int k,int x) {
	
	for(int i=0;i<=arr.length-k;i++) {
		int sum=0;
			for(int j=i;j<i+k;j++) { 
				 sum=sum+arr[j];
				
			
			}
			if(x==sum) {
				for(int f=i;f<i+k;f++) {
					System.out.print(arr[f]);
				}
				System.out.println();
			}
			
	}
			
			
		
	
}
void printLongestSubArrayForSumValueK(int []arr,int x) {
	
	// this is for printing all sub array without giving size of k value like previous problems ,here there is no size to take a subarrays , we need to take all sub arrays for given k value which is sum value of all subarrays.

/*	for(int i=0;i<arr.length;i++) {
		int sum=0;
		for(int j=i;j<arr.length;j++) {
			sum=sum+arr[j];
			// this is for printing all sub array without giving size of k value like previous problems ,here there is no size to take a subarrays , we need to take all sub arrays for given k value which is sum value of all subarrays.
			if(x==sum ) {
				for(int f=i;f<=j;f++) {
					
					System.out.print(arr[f]);
					
					}
				
				System.out.println();
				
				}
			}
				
				
			}
}
*/	
	
	// this code for printing longest subarray among all sub arrays
/*	int currentSubArrayLength=Integer.MIN_VALUE;
	int maxLength=Integer.MIN_VALUE;
	int longestSubArrayStartIndex=-1;
	int longestSubArrayEndIndex=-1;
	
	for(int i=0;i<arr.length;i++) {
		int sum=0;
		for(int j=i;j<arr.length;j++) {
			sum=sum+arr[j];
			if(sum==x) {
				currentSubArrayLength=j-i+1;
				if(currentSubArrayLength>maxLength) {
					maxLength=currentSubArrayLength;
					longestSubArrayStartIndex=i;
					longestSubArrayEndIndex=j;
					
				}
			}
			
				}
		
			}
	if(maxLength>0) {
		for(int f=longestSubArrayStartIndex;f<=longestSubArrayEndIndex;f++) {
			System.out.print(arr[f]);
		}
		System.out.println();
	}
		
	
*/

	// this program for best time complexity o(n). best for bigger companies interviews.

	     HashMap<Integer,Integer> map = new HashMap<>();
	              
	          
	                map.put(0, -1);  // Important: Handle subarrays starting from index 0

	                int sum = 0;
	                int maxLen = 0;
	                int startIdx = -1, endIdx = -1;

	                for(int i = 0; i < arr.length; i++) {
	                    sum += arr[i];

	                    if(sum == x) {
	                        // Subarray from 0 to i
	                        if(i + 1 > maxLen) {
	                            maxLen = i + 1;
	                            startIdx = 0;
	                            endIdx = i;
	                        }
	                    }

	                    if(map.containsKey(sum - x)) {
	                        // Subarray from (map.get(sum-k) + 1) to i
	                        int len = i - map.get(sum - x);
	                        if(len > maxLen) {
	                            maxLen = len;
	                            startIdx = map.get(sum - x) + 1;
	                            endIdx = i;
	                        }
	                    }

	                    // Store FIRST occurrence only
	                    if(!map.containsKey(sum)) {
	                        map.put(sum, i);
	                    }
	                }

	                if(maxLen > 0) {
	                    printSubarray(arr, startIdx, endIdx);
	                    System.out.println(" (Length: " + maxLen + ")");
	                } else {
	                    System.out.println("No subarray found");
	                }
	            }

	            public static void printSubarray(int arr[], int start, int end) {
	                for(int i = start; i <= end; i++) {
	                    System.out.print(arr[i] + " ");
	                }
	            }
	        

void printAllSubArraysWithoutAnyExtraInputs(int []arr) {
	/*for(int i=0;i<arr.length;i++) {
		
		for(int j=i;j<arr.length;j++) {
			//System.out.print(arr[j]);
			for(int f=i;f<=j;f++) {
				System.out.print(arr[f]);
			}
			System.out.println();
			
		}
		
		
	}
	*/
	
	
	
	// OTHER WAY TO PRINT ALL SUARRAYS BY DIRECTLY CALLING THE ABOVE PRINT ALL SUB ARRAYS  WITH SIZE METHOD HERE .
	for(int size=1;size<=arr.length;size++) {
		printAllSubArrays(arr,size);      // this for loop to get all sub arrays printing size 1 to end element of array 5. wich this size value is passed as k in that above method.
		
	}
}
				
			
void findMissingElementArray(int []arr) {
	int n=arr.length+1; // either this or n+1(n+1+1)/2. this also right .
	
	int sum1=(n)*(n+1)/2; // this is gaussian formula . why we r doing n+1+1/2 . we r adding 1 because the missing element is added so the array length changes . thats why we r adding array length to 1.
	int sum2=0;
	for(int i=0;i<arr.length;i++) {
		sum2=sum2+arr[i];
	}
	System.out.println(sum1-sum2);
}
		
		
	

	


	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		/*
		System.out.println("enter the n value");
		int n=Sc.nextInt();
		int count=0;
		for(int i=1;i<=n;i++) {	
			for(int j=1;j<=i;j++) {
				System.out.print("*");
				count++;
			}
			System.out.println();
				
		}
		System.out.println(count);
		
       */
	// for given array size of n integers , and an integer value size. write a program to print all the subarrays of given length size.
		
		System.out.println("enter the no of elements");
		int n=Sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=Sc.nextInt();
		}
	//	System.out.println("enter an Integer value Size for the subarray of original array");
	//	int k=Sc.nextInt();
		SubArraysProblems sp=new SubArraysProblems();
		
		//sp.printAllSubArrays(arr, k);
		//sp.printSumOfAllSubArrays(arr,k);
		
// to find given array of n integers ,along with integer value and another value which is k. write a program to print the count of all subarrays of length size whose sum is equal to k.
		//System.out.println("enter the x value to find sum of all subarrays equal to x."); // this for as per question to give the k value . so i took different variable x because k already defined.
		//int x=Sc.nextInt();
		//int res=sp.countSumofSubArraysEqualToGivenKValue(arr, k,x);
		//System.out.println(res);
		
//to find same above question instead of count we need to print subarrays.
		//sp.printSubArraysEqualToGivenKValue(arr, k, x);              // this is my code.
		/* this is high efficient code. sliding window problem. 
		void efficientPrint(int[] arr, int k, int x) {
		    if (k > arr.length) return;
		    
		    int sum = 0;
		    for(int i=0; i<k; i++) sum += arr[i];  // First window // adding 1st k values . for below input 9,5,1=15.
		    
		    if(sum == x) {
		        printSubarray(arr, 0, k);
		    }
		    
		    for(int i=k; i<arr.length; i++) {
		        sum = sum - arr[i-k] + arr[i];  // Slide         // removing 1st element and adding next elemen. after using entire 15-1st eleemnt +after 3rd element.
		        if(sum == x) {
		            printSubarray(arr, i-k+1, k);
		        }
		    }
		}

		void printSubarray(int[] arr, int start, int len) {
		    for(int j=start; j<start+len; j++) {
		        System.out.print(arr[j] + " ");
		    }
		    System.out.println();
		}
		
		//[9,5,1,2,4,9,3,1,3,3], k=3, x=7:
		*/
		
// to print longest subarray .of given k value whose sum of all subarrays=k.
		
		//System.out.println("enter the x value to find longest subarray  equal to x."); // this for as per question to give the k value . so i took different variable x because k already defined.
		//int x=Sc.nextInt();
		//sp.printLongestSubArrayForSumValueK(arr,x);
// program to print all subarrays without any given size or k value . 
		sp.printAllSubArraysWithoutAnyExtraInputs(arr);

		
// to find the missing element inside the given array .
		//sp.findMissingElementArray(arr);
	}
	

}
