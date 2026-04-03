package com.example.BasicPracticePrograms;
import java.util.Arrays;
import java.util.Scanner;


public class ArrayProblems3rdPart {
	
	// one way of sorting merged array.
    int[] mergeSortElements(int []arr1,int []arr2){
	   int []merged=new int[arr1.length+arr2.length];
	   
	   
		for(int i=0;i<arr1.length;i++) {
			merged[i]=arr1[i]; // here only i eleemnts.
			for(int j=0;j<arr2.length;j++) {
				merged[arr1.length+j]=arr2[j]; // here we r adding 2 nd array elements inside merged[3+0],merged[3+1] concatenating to merged .why here arr1.length because conctenaing j eleemnts with first 1st array elements.
				
			}
			
		}
		Arrays.sort(merged); // buult in method to sort
		return merged;
		
		
		
   }
    // other way of sorting merged array
    int[] mergeSortElementsWithoutInbuiltMethod(int []arr1,int []arr2){
 	   int []merged=new int[arr1.length+arr2.length];
 	   
 	   
 		for(int i=0;i<arr1.length;i++) {
 			merged[i]=arr1[i]; // here only i eleemnts.
 			for(int j=0;j<arr2.length;j++) {
 				merged[arr1.length+j]=arr2[j]; // here we r adding 2 nd array elements inside merged[3+0],merged[3+1] concatenating to merged .why here arr1.length because conctenaing j eleemnts with first 1st array elements.
 				
 			}
 			
 		} 
 		// it is bubble sort . inside j loop we r eliminating last value each iteration after sorting .to reduce time complexity of running number of times of loop
 		for(int i = 0; i < merged.length - 1; i++) {
 	        for(int j = 0; j < merged.length - i - 1; j++) {
 	            if(merged[j] > merged[j + 1]) {
 	                // Swap
 	                int temp = merged[j];
 	                merged[j] = merged[j + 1];
 	                merged[j + 1] = temp;
 	            }
 	        }
 	    }
 	    
 	    return merged; // here we r sorting with use of this variable only so it will sorted as it is .
 		
    }
    // another merged sort 2 arrays using while loop
   int[] mergeSortWhileLoop(int []arr1,int[]arr2){
	   int []mergedres=new int[arr1.length+arr2.length];
	   int i=0,j=0,k=0;
	   while(i<arr1.length && j<arr2.length) { // to check for both arrays to be true if 1st array lessser . 2nd array greater certain parts will executed
		   if(arr2[j]<arr1[i]) {
			   mergedres[k]=arr2[j];
			   k++;                            //we r doing k++. to make the pointer to next empty box of  array  thats why k++.
			   j++; 
		   }
		   else {
			   mergedres[k]=arr1[i];
			   k++;
			   i++;
		   }
	   }
	   while(i<arr1.length) {      // this for remaining elements present in 1st array arr1[i]
		   mergedres[k]=arr1[i];
		   k++;
		   i++;
	   }
	   while(j<arr2.length) {      // this for remaining elements present in 2nd array arr2[j]
		   mergedres[k]=arr2[j];
		   k++;
		   j++;
	   }
    	return mergedres;
    }
   
   // merging 3 arrays and to return the output as given order ,i ,j,k eleemnt first and next position according to that .
   
  /*void merged3ArraysWithoutSorting(int[]arr1,int[]arr2,int[]arr3){  // anyways this is wrong . i cant use it in interview.
	  int []Arrays3Merged=new int[arr1.length+arr2.length+arr3.length];
	  int i=0;
	  int j=0;
	  int k=0;
	 while(i<arr1.length && j<arr2.length && k<arr3.length) {
		System.out.println(arr1[i]);
		System.out.println(arr2[j]);
		System.out.println(arr3[k]);
		k++;
		i++;
		j++;
		 
				  }
	 while(i==arr1.length && j<arr2.length) {
		 System.out.println(arr2[j]);
		 System.out.println(arr3[k]);
		 k++;
		 j++;
		 
	 }
	 while(j==arr2.length &&k<arr3.length) {

		 System.out.println(arr3[k]);
		 k++;
		 
	 }
	  */
				  
			  
  //by using simple while loop
	  void merged3ArraysWithoutSorting(int[] arr1, int[] arr2, int[] arr3) {
		  int []Arrays3Merged=new int[arr1.length+arr2.length+arr3.length];
		    int i = 0, j = 0, k = 0;
		    while(i < arr1.length || j < arr2.length || k < arr3.length) {
		        if(i < arr1.length) System.out.println(arr1[i++]);// same here also k and k++ , we r directly putting that . 
		        if(j < arr2.length) System.out.println(arr2[j++]);    // jere instead of j and next line j++. we r directly putting j++, 
		        if(k < arr3.length) System.out.println(arr3[k++]);
		    }
		    
	  }
	  
	  // only 1 array sorting using o log n merge sort . which efficient time complexity.
	  int [] mergedSort1Array(int[]arr1){
		  if (arr1.length <= 1) {
		        return arr1;
		    }

		  int left = 0;
		  int right = arr1.length - 1;
		  int mid = (left + right) / 2;

		  int leftHalfArray = mid - left + 1;
		  int[] leftArray = new int[leftHalfArray]; // creating array for left half to be stored and for splitting

		  int rightHalfArray = right - mid;
		  int[] rightArray = new int[rightHalfArray]; // creating array for right half to be stored and for splitting

		  for (int i = 0; i < leftArray.length; i++) {
		      leftArray[i] = arr1[left + i];   // left+i . current i value with left =0;
		  } 

		  for (int j = 0; j < rightArray.length; j++) {
		      rightArray[j] = arr1[mid + 1 + j]; // here mid value +1+j is taken because after mid +1 value to be started with current j value . mid will be constant . 
		  }
		  leftArray = mergedSort1Array(leftArray);     // here recursion is happens because we r spliting the array into single parts , updating eaach time left half to single element and right half to single elemnt.
		  rightArray = mergedSort1Array(rightArray);     //splitting the arrays.

		  int i=0;
		  int j=0; 
		  int []temp=new int[leftArray.length+rightArray.length]; // creating new array for comparing the left half and right half to store in sorted order.
		  int k=0;  // this variable for temp array to store the sorted values in new array .thats it
		 while(i<leftArray.length && j<rightArray.length) {
			 if(rightArray[j]<leftArray[i]) {
				 temp[k]=rightArray[j];
				 j++;
				 
				 k++;
				 
			 }
			 else {
				 temp[k]=leftArray[i];
				 i++;
				 k++;
			 }
}
		 // for remaining eleemnts in both arrays only when the remining elements present in right half or left half it will enter below any 1 of while loops or else not .
		 while(i<leftArray.length) {
			 temp[k]=leftArray[i];
			 i++;
			 k++;
		 }
		 while(j<rightArray.length) {
			 temp[k]=rightArray[j];
			 j++;
			 k++;
		 }
		 
		 return temp;

	  }		 
	  
		 

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter 1st array elements");
		int n1=Sc.nextInt();
		int []arr1=new int[n1];
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=Sc.nextInt();
		}
		System.out.println("enter 2nd array elements");
		int n2=Sc.nextInt();
		int []arr2=new int[n2];
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=Sc.nextInt();
		}
		
		// for merge sort and printing eleemnts in resultant array
		ArrayProblems3rdPart ap=new ArrayProblems3rdPart();
		
		
		/*int []result=ap.mergeSortElements(arr1, arr2);  // this is one way of sorting using merge sort using inbult method.
		for(int mergedarray:result) {          // to print the merged sorted elements we need to use enhanced for loop.
			System.out.println(mergedarray);
		}
		*/
		/*int []result=ap.mergeSortElementsWithoutInbuiltMethod(arr1, arr2);  // this is other way of sorting using merge sort using bubble sort .
		for(int mergedarray:result) {          // to print the merged sorted elements we need to use enhanced for loop.
			System.out.println(mergedarray);
		}
		*/
		// every sort are for repeating elements only . not unique also. 
		int []mergedres=ap.mergeSortElementsWithoutInbuiltMethod(arr1, arr2);
		for(int finalmergedarray:mergedres) { 
			System.out.println(finalmergedarray);
		}
	
		// question - merge 3 arrays . and print the output as shown , in the order of i,j,k of 1st element ? 
		/*System.out.println("enter 3 rd array eleemnts");
		int n3=Sc.nextInt();
		int[]arr3=new int[n3];
		for(int i=0;i<arr3.length;i++) {
			arr3[i]=Sc.nextInt();
		}
		*/
	/*	int []resultArray=ap.mergedSort1Array(arr1);
		for(int res:resultArray) {
			System.out.println(res);
		}
		*/
		
	}

}
