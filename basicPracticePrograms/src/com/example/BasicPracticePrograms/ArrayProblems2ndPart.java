package com.example.BasicPracticePrograms;
import java.util.Scanner;
public class ArrayProblems2ndPart {
	int secondLargestElementArray(int []arr){
		int largest=Integer.MIN_VALUE;
		int secondLargest=Integer.MIN_VALUE;
		if(arr.length<2) {
			System.out.println("array size is less cannot compare largest elements.");
			return -1;
		}
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>largest ) {
				secondLargest=largest;
				largest=arr[i];
				
				
			}
			else if(arr[i]>secondLargest &&arr[i]!=largest ) { // skipping duplicates values thats why 2nd condition . dont want to be a largest==secondLargest.means if there is duplicates . it prints same value 2nd time value . so we r doing this and printing other unique value.
				secondLargest=arr[i];
			}
		
		}
		
		
		return  secondLargest==Integer.MIN_VALUE ?  -1 : secondLargest; // ternary operator
	}
	int thirdLargestElement(int[]arr) {
		int largest=Integer.MIN_VALUE;
		int thirdLargest=Integer.MIN_VALUE;
		int secondLargest=Integer.MIN_VALUE;
		if(arr.length<3) {
			System.out.println("array size is less cannot compare largest elements.");
			return -1;
		}
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>largest ) {
				thirdLargest=secondLargest; // assingning secondLAR element to third . to free up secondLargest.
				secondLargest=largest; //now assigning largest to seconLar which is already free up
				largest=arr[i]; // finally updating largest
				
				
			}
			else if(arr[i]>secondLargest &&arr[i]!=largest ) { // condition for taking secondLar element.and skipping any duplicates 
				thirdLargest=secondLargest; // for secondLar to be updated.we need to remove the current element so we storing that to 3rd larges.
				secondLargest=arr[i];//after free up space of secondLarg. we r storing current array value .
			}
			else if(arr[i]>thirdLargest &&arr[i]!=secondLargest && arr[i]!=largest) {// final condition for 3rd large.to take 3rd individual element and it must be not equal to both 1st 2 higher elements.
				thirdLargest=arr[i]; // directly updating there . thats it .
			}
		
		}
		
		
		return thirdLargest==Integer.MIN_VALUE?-1:thirdLargest;
	}
	
	int largestElement(int []arr) {    // returnnin is best design to reuse wherever we want .
		int max=arr[0];              // first keeping 1st element as max . if next iterating elements higher means update max . thats it . and for negative values overcome also.
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				
				max=arr[i];
			}	
		}
		return max;
	}
	int smallestElement(int []arr) {    // returnnin is best design to reuse wherever we want .
		int min=arr[0];              
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<min) {
				
				min=arr[i];
			}	
		}
		return min;
	}
	
	int secondSmallestElementArray(int []arr){
		int smallest=Integer.MAX_VALUE;
		int secondsmallest=Integer.MAX_VALUE;
		if(arr.length<2) {
			System.out.println("array size is less cannot compare largest elements.");
			return -1;
		}
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]<smallest ) {
				secondsmallest=smallest;
				smallest=arr[i];
				
				
			}
			else if(arr[i]<secondsmallest &&arr[i]!=smallest ) { // skipping duplicates values thats why 2nd condition . dont want to be a largest==secondLargest.means if there is duplicates . it prints same value 2nd time value . so we r doing this and printing other unique value.
				secondsmallest=arr[i];
			}
		
		}
		return secondsmallest==Integer.MAX_VALUE?-1:secondsmallest;
	}
	
	
	// for maximumProductPairs
	
	int maxProductPairs(int []arr) {
		int largest=Integer.MIN_VALUE;
		int secondLargest=Integer.MIN_VALUE;
		if(arr.length<2) {
			System.out.println("array size is less cannot compare largest elements.");
			return -1;
		}
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>largest ) {
				secondLargest=largest;
				largest=arr[i];
				
				
			}
			else if(arr[i]>secondLargest &&arr[i]!=largest ) { // skipping duplicates values thats why 2nd condition . dont want to be a largest==secondLargest.means if there is duplicates . it prints same value 2nd time value . so we r doing this and printing other unique value.
				secondLargest=arr[i];
			}
		
		}
		
		
		// for negative values .it will fail largest pairs . so we need 1st smallest and second smallest to comapre both and print it.
		
		int smallest=Integer.MAX_VALUE;
		int secondSmallest=Integer.MAX_VALUE;
		if(arr.length<2) {
			System.out.println("array size is less cannot compare largest elements.");
			return -1;
		}
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]<smallest ) {
				secondSmallest=smallest;
				smallest=arr[i];
				
				
			}
			else if(arr[i]<secondSmallest &&arr[i]!=smallest ) { // skipping duplicates values thats why 2nd condition . dont want to be a largest==secondLargest.means if there is duplicates . it prints same value 2nd time value . so we r doing this and printing other unique value.
				secondSmallest=arr[i];
			}
		
		}
		int p1=largest*secondLargest;
		int p2=smallest*secondSmallest;
		int p3=largest *smallest;
		
		int result=p1<p2 ? (p1<p3 ?p1:p3) :(p2<p3?p2:p3);   // comparing this for min product pairs.for every test cases like both positive and negative mix pairs .min value.
		return result;
		
	}
	void printAllPairs(int []arr) {
		for (int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				System.out.println(arr[i] + ","+arr[j]);
			}
		}
	}
	void sumOfPairsGivenKValue(int []arr,int k){
		int sum=0;
		int pairMatch=0; //just to check the pair is there or not.
		for (int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				sum=arr[j]-arr[i]; // for subtraction change the variable j as first and i as second .
				if(k==sum ||k==arr[i]-arr[j]) {
					System.out.println(arr[i]+ " "+arr[j]);
					pairMatch++;              // this line for checking just if there is pair found or not . thats it .
				}
				
			}
		}
		if(pairMatch==0) {
			System.out.println("no pairs found for givenvalue "+ " "+k); 
		}
		
		
	}
	void  occurencesOfSortedArrayEachElements(int []arr){
		
		int count=1;
	int previousValue=Integer.MIN_VALUE;
		for(int  i=0;i<arr.length;i++) {
			 if(arr[i] == previousValue) continue;
			count=1;
			
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]  ) {
					
					 count++;
					 
					 
				}
				
			
			}
			

			if(count>1 ) {
				System.out.println(arr[i]+"-"+count);
				previousValue=arr[i];
				
			}
			else {
				System.out.println(arr[i]+"-"+count);
			}
			
					
		}
						
		}
		
	//printing all elements without repeating of same above method

       void sortedArrayPrintingElementsWithoutRepeating(int []arr) {
    	   for(int i=0;i<arr.length-1;i++) {
    		   
    		   
    		   if(arr[i]!=arr[i+1] ) {
    			  System.out.println(arr[i]);
    			 
    		   }
    		  
    	   }
    	   
    	   System.out.println(arr[arr.length-1]); //this line for  printing last value of array . because we cannot use arr[i] outside loop thats it.
       }
     void  sortedArrayPrintingUniqueElements(int []arr){
    	 int previousValue=Integer.MIN_VALUE;
    	 if(arr.length<=0) {
    		 System.out.println("array size not defined");
    	 }
    		 
    	 for(int i=0;i<arr.length-1;i++) {
    		 
    		 if(arr[i]!=arr[i+1] &&arr[i]!=previousValue) {// here skipping duplicates and checking with next value .
    			  System.out.println(arr[i]); // printing only unique elements .
    			  
    		 }
    		 else {
    		 previousValue=arr[i];// here we need to update each value if the condition is false . it means there is duplicates. if there duplicate .for later used top in if condition to skip the duplicates.
    		 }
    		 
    	 }
    	
    	  
    		  if(previousValue!=arr[arr.length-1]  ) { // here we r checking the previous value of before last element is already present or not . if not print last value .else dont print .
	    	 System.out.println(arr[arr.length-1]);
	    	 }
    	 		  
     }
     void  unsortedArrayPrintingUniqueElements(int []arr){
    	 int previousValue=Integer.MIN_VALUE;
    	 if(arr.length<=0) {
    		 System.out.println("array size is less to find the unique elemnts");
    	 }
    		 
    	 for(int i=0;i<arr.length;i++) {
    		 boolean isUnique=true;
    		 for(int j=0;j<arr.length;j++) {
    		 if(arr[i]==arr[j] && i!=j &&checkPrime(arr[j])) { // always put this i!=j for skipping same elements compared .and for both directions.
    			  isUnique=false;
    			  break;
    			  
    		 }
    		 }
    		 if(isUnique &&checkPrime (arr[i])) {
    			 System.out.println(arr[i]);
    		 }
    		
    		 
    	 }
     }
     boolean checkPrime(int n) {
		 if(n<=1) {
			 return false;                      // just using check prime method to check all the unique in sorted and unsorted to print only prime numbers and counts.
		 }
		for(int i=2;i*i<=n;i++) {
			
			if(n%i==0) {
				return false;
			}
		}
		return true;
     }
     int countUniqueElements(int []arr) {
    	 int count=0;
    	 int previousValue=Integer.MIN_VALUE;
    	 for(int i=0;i<arr.length-1;i++) { // awways u need to give length-1 . when u use arr[i+1].if it goes to last element it prints array out of bound exception.
    		 if(arr[i]!=arr[i+1] &&arr[i]!=previousValue  &&checkPrime(arr[i])) {
    			 count++;
    		 }
    		 else {
        		 previousValue=arr[i];// here we need to update each value if the condition is false . it means there is duplicates. if there duplicate .for later used top in if condition to skip the duplicates.
        		 }
    	 }
    	 if(arr[arr.length-1]!=previousValue &&checkPrime(arr[arr.length-1])) {
    		 count++;
    	 }
    	
    	 return count;
     }
  

     int largestRepeatingElementPresentArray(int[] arr) {


         int largestRepeatingValue = Integer.MIN_VALUE;

         for (int i = 0; i < arr.length - 1; i++) {

             if (arr[i] == arr[i + 1]) {
                 largestRepeatingValue = arr[i];   // since sorted, this will keep updating to largest
             }
         }

         return largestRepeatingValue; 
     }
     
    void  RepeatingElementsBothArrays(int []arr1,int []arr2){
    	// for an sorted array.
   /* 	int previousValue=Integer.MIN_VALUE;
    	 for(int i=0;i<arr1.length;i++) {
    		 boolean duplicateFound=false;
    		 for(int j=0;j<arr2.length;j++) {
    			 if(arr1[i]==arr2[j] &&previousValue!=arr2[j] ) { // just checking condition with previous value
    				 System.out.println(arr1[i]);
    				 previousValue=arr2[j];          // updating value to avoid duplicates to be printed.
    			 }
    			 
    		 }
    	 }
    	*/ 
    	 
    	 // for an unsorted array
    	 for(int i=0;i<arr1.length;i++) {
    		 boolean duplicateFound=false;
    		 for(int k=0;k<i;k++) {
    			 if(arr1[i]==arr1[k] ){           // for unsorted array we need to check arr1[i]values 2 times with k .if its already present continue .skip the process
    				 duplicateFound=true;
    				 break;
    			 }
    			 	 
    			 }
    		 if(duplicateFound)continue; //// here skipping if already present .that means duplicates found from arr[i].
    		 
    		 for(int j=0;j<arr2.length;j++) {
    			 if(arr1[i]==arr2[j] ) {
    				 System.out.println(arr1[i]);
    				 break;                // this break for both arrays . if array of 1st is lower elemnts compare to 2nd array . if seoncd array contain duplicates. it will break .
    			 }
    		 }
    		 }
    	 
     }
     
 
    	  
       
     
		
	
		
		
	public static void main(String[] args) {
		
		Scanner Sc=new Scanner(System.in); 
		/*System.out.println("enter the no of elemnts inside array");
		int n=Sc.nextInt();
	      int[]arr=new int[n];
	      for(int i=0;i<n;i++) {
	    	  arr[i]=Sc.nextInt();
	    	 
	      }
	    */ 
	      
	   // to find second largest element inside an given array;
	      ArrayProblems2ndPart ap=new ArrayProblems2ndPart();
	     /* int res=ap.secondLargestElementArray(arr);
	      System.out.println(res);
	      */
	   // for third largest element .we need to use 1st and 2nd largest elements individualy to take individual values .we need to shift each elements in another variable thats it.
	   /*  int res= ap.thirdLargestElement(arr);
	     System.out.println(res);
         */                      
	    // find largest pair sum and lowest sum pair of given array. always largest sum is 1st2 largest element.,always lowest pair sum is 1st 2 smallest element.
	/*     int largePair1= ap.largestElement(arr);
	      int largePair2=ap.secondLargestElementArray(arr);
	      System.out.println(largePair1+largePair2);
	                                       
	                                       // we can use like same maxproductpairs . single methods for largest and secondlargest direct return there .
	                                       
	                                       
	      int smallPair1=ap.smallestElement(arr);
	      int smallPair2=ap.secondSmallestElementArray(arr);
	      System.out.println(smallPair1+smallPair2);
	  */    
	      // for maximum product pairs for both positive and negative values .
	    // System.out.println( ap.maxProductPairs(arr));
	      
	      
	   // printing all pairs
	    // ap.printAllPairs(arr);
	     
//program to print all pairs which sum is equal to given k
	   /*  System.out.println("enter k value");
	     int k=Sc.nextInt();
	     ap.sumOfPairsGivenKValue(arr, k);
	   */
	      
	     
// to find occurences of given sorted array of each elements.
	      //ap.occurencesOfSortedArrayEachElements(arr);
// to print all element inside array without repeating elements.
	     // ap.sortedArrayPrintingElementsWithoutRepeating(arr);
	      
// to print all unique elements only
	     // ap.sortedArrayPrintingUniqueElements(arr);
	     // ap.unsortedArrayPrintingUniqueElements(arr);
// to count unique elements.
	     // System.out.println(ap.countUniqueElements(arr));
// to print largest repeating element.
	     //System.out.println(ap.largestRepeatingElementPresentArray(arr));
	      
// to print the elements which are repeated in both arrays (2 arrays). for 2 arrays alone we r taking the 2 array inpputs . for single array problems top there is an array .
	     System.out.println("enter the no of elemnts inside array");
			int n1=Sc.nextInt();
		      int[]arr1=new int[n1];
		      
		      for( int i=0;i<n1;i++) {
		    	  arr1[i]=Sc.nextInt();
		    	 
		      }
		      
	      
	      System.out.println("enter the no of elements of 2nd arrays");
	      int n2=Sc.nextInt();
	      int []arr2=new int[n2];
	      for( int i=0;i<n2;i++) {
	    	  arr2[i]=Sc.nextInt();
	      }
	      ap.RepeatingElementsBothArrays(arr1, arr2);
	      System.out.println("");
	      
	      
	}

}
