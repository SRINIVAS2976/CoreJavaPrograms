package com.example.BasicPracticePrograms;

import java.util.Scanner;

public class StringsProblems {
	static String reverseString(String s) {
		String s1="";
		
		for(int i=s.length()-1;i>=0;i--) {
			s1=s1+s.charAt(i);// here conactenating charater with string =so final type is string.
			
		}
		return s1;
	}
static	String toCheckPalindrome(String s1,String s){
	/*
	if(s1.equals(s)) {
			System.out.println("given string is palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
		
	*/	
		//  another efficient best complexity code . 
	int i=0;
	int j=s.length()-1;
	while(i<j) {               // performing  upto middle .           
		if(s.charAt(i)==s.charAt(j)) { // j at last index . comparing from both sides
			i++;    // increasing forward 
			j--;// decreasing backward
		}
		else {
			return "notpalindrome";
		}
	}
	return "palindrome";
}
	
 static int printNoOfSpaces(String s) {
	 int count=0;
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)==' ') {
			count++;
		}
	}
	return count;
	
}
 static int countNoOfWords(String s) {
	int count=0;
	
	// edge cases
	/*if(s==null) {   // to overcome nullpointer exception we r using null condition at always first.(null always should be at first)
		return 0; 
	}
	s = s.replace("\"", "").trim();  // now here for any ""," " , to return 0 because it also an string consider a count . so need to return 0
	if(s.isEmpty()) { // trim().cuts all spaces start and end .not at middle.if space or empty return 0.
		return 0;
	}
	*/
	//manual instead of trim method to overcome starting spaces .from the string to eliminate it .
	
	
	for(int i=0;i<s.length()-1;i++) { // here we need to give s.length()-1 . because i +1 in if statement thats it . avoiding exception
			
		if(s.charAt(i)==' '&& s.charAt(i+1)==' '){ // here for avoiding counting multiple spaces . we keeping this condition . for more than 2 spaces in given string it again continues.
			continue;
		}
		else if(s.charAt(i)==' ' ){   // only words are separated using single space . so we need to count the entire word to 1 level after 1st space
			count++;
		}

			

	}
	return s.charAt(0)==' '?count:count+1; // this for counting words if 2 spaces . 3 words will be there.
	
 
 }
 static int countingVowelsGivenString(String s) {
	 int count=0;
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'
				||
				s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U') {
			count++;
		}
	}
		return count;
 }
 static int countingOrPrintingOnlySpecialCharacters(String s) {
	 int specialCharacterscount =0;
	 int numeric=0;
	 
	 for(int i=0;i<s.length();i++) {
		 char ch=s.charAt(i);
		 if((ch>='0' && ch<='9') ||  (ch>='a' && ch<='z') ||  (ch>='A'&&ch<='Z') ||(ch==' ')){ // for special characters other than numeric and alphabets everything are special characters.
			
			 continue;
		 }
			 else {
				 specialCharacterscount++;
			 }
		 
	 }
	 return specialCharacterscount;
 }
	
 static void removingSpecialCharacters(String s) {
	 String t="";  // strings are immutable so we need to create another new string .and add it
	 for(int i=0;i<s.length();i++) {
		 char ch=s.charAt(i);
		 if((ch>='0' && ch<='9') ||  (ch>='a' && ch<='z') ||  (ch>='A'&&ch<='Z') ||(ch==' ')){ // for special characters other than numeric and alphabets everything are special characters.
			t=t+ch;  // new string to add it // instead of directly printing charatcers we need to store it as string and print as string.
			
		 }
			 else {
				 continue;
			 }
		 
	 }
	 System.out.println(t);
 }
 
 static void appendingNumericCharactersAtEndOfGivenString(String s) {
	 String t="";
	 String numeric=""; // WE NEED TO TAKE 2 EMPTY STRINGS FOR CONCATENATING 2 AND FINALY CONCATENATION
	 for(int i=0;i<s.length();i++) {
		 char ch=s.charAt(i);
		 
		 if(!(ch>='0' &&ch<='9')) { //not operator means not equal to this if condition.
			t=t+ch;
		 }
		 else {
			  numeric=numeric+ch;
		 }
	 }
	 System.out.println(t+numeric);
	 
 }
 static void convertToLowerCase(String s) {
	 String t="";
	 for(int i=0;i<s.length();i++) {
		 char ch=s.charAt(i);
		 if(ch>='A'&&ch<='Z' ||ch>='a'&&ch<='z') {// FOR SAME LOWEERCASE -32.
			 if(ch>='A'&&ch<='Z') {
			 t=t+ (char)(ch+32);   // HHERE WE NEED TO CONVERT ENTIRE CHAR+32 INTO CHAR AND THEN ADD TO STRING . FOR GETTING LOWERCASE.
		 }
			 else {
				 t=t+(char)(ch-32); // for both we using 2 if loops.if in given string is caps we need to convert to small and vice versa.
			 }
		 }
		 else {
			 t=t+ch;// for remaining characters.
		 }
		 
	 }
	 System.out.println(t);
 }
 static void trimmingAtStartingAndEndingOfGivenString(String s) {
	 String t="";
	 int start=0;
	 while(start<s.length() &&s.charAt(start) ==' ') {   // for starting spaces removing
		 start++;
	 }
	 int end=s.length()-1;
	 while(end>=start && s.charAt(end)==' ') {  // for ending spaces removing
		 end--;
	 }
	 
	 for(int i=start;i<=end;i++) {     // finally between that as it is .
		 char ch=s.charAt(i);  
		 if(ch==' '&& s.charAt(i+1)==' ') {   // this condition for printing middle spaces only 1 space only not more thn 1.
			 continue;
		 }
		 else {
			t=t+ch;
		 }
	 }
	 System.out.println(t);
 }
 
 static void printSymbolBeforeLetterOfGivenString(String s){
	 String t="*";
	 String t2="";
	 
	 for(int i=0;i<s.length();i++) {
		 char ch=s.charAt(i);
		if(ch =='a') {
			t2=t2+t+ch;// same appending with same variable.
		}
		else {
			t2=t2+ch;// if not the letter present . append other variables or strings . append means concatenate.
		}
		
	
		
		
		
	 }
	 System.out.println(t2);
	
 }
 static String printSubsequenceStringPresentInNormalString(String s,String t) {
	
	
	int i=0;
	int j=0;
	while(i<s.length() && j<t.length()) {
	
				if(t.charAt(j)==s.charAt(i) ) {
					i++;
					j++;
				}
				
				else {
					i++;
				}
	}
	return j==t.length()?"yes":"no";
			
	// use for loop
	/*
	for(int i=0;i<s.length()&&i<t.length();i++) {
		if//////certain same operations
	}
	
	*/
	
		
 }
 
 // printing index of k character
	 static void printingIndexOfCharacter(String s,char k) {
		 for(int i=0;i<s.length();i++) {
			 if(s.charAt(i)==k) {
				 System.out.println(i);
			 }
		 }
	 }
	 
// printingAllSubArraysofLength4.// here length or size also same.
	 static void printingAllSubStrings(String s,int n) {
		 for(int i=0;i<=s.length()-n;i++) {
			 for(int j=i;j<i+n;j++) {
				 System.out.print(s.charAt(j));
			 }
			 System.out.println();
		 }
	 }
	 
// printing2ndStringispresent in1st string .
	 static String checking2ndStringPresentIn1stString(String s,String s2) {
		 /*
		 int i=0;                                              // my code it gives problem check below efficient way to check
		 
			int j=0;
			while( j<s2.length()-1 && i<s.length()-1) {
			               
						if(s2.charAt(j)==s.charAt(i) && s2.charAt(j+1)==s.charAt(i+1) ) {  // same like subsstrig present in string . but here must be consecutive thats why extra condition .i+1 and j+1.
							i++;
							j++;
							
						}
						
						else  {
							i++;
						}
			             
						
						
			}
			return j==s2.length()-1?"yes":"no";
			*/
			
			// subsequence means it can be present at anywhere after 1st character found . coming next . substring means . only consecutives. not anywhere after each letter.
// other way of checking substring using that above printing all substring methods.
			String t="";
				 for(int i=0;i<=s.length()-s2.length();i++) { // s2.length because given substring length it takes so.
					 t="";
					 for(int j=i;j<i+s2.length();j++) {
						t=t+s.charAt(j);
					 }
					 if(t.equals(s2)) {  // we must check inside for loop because the sub arrays are inside i for loop . if u come out of for loop there is no subarrays. so u need check condition inside.
						 return "yes";
					 }
			 }
				 
					 return "no";
				
	 }
	 // printingLongestSubstringOfAllSubStringsInGivenString  and it also should be palindrome
	 static	String toCheckPalindrome(String s){
		 int i=0;
			int j=s.length()-1;
			while(i<j) {               // performing  upto middle .           
				if(s.charAt(i)==s.charAt(j)) { // j at last index . comparing from both sides
					i++;    // increasing forward 
					j--;// decreasing backward
				}
				else {
					return "notpalindrome";
				}
			}
			return "palindrome";
		}
	 
	 static  void  printingLongestSubstring(String s) {
		 String t="";
		 int currentLen=0;
		 int maxLen=Integer.MIN_VALUE;
		 int startIndex=0;
		 int endIndex=0;
		 
		 for(int size=1;size<=s.length();size++) {
			 for(int j=0;j<=s.length()-size;j++) {
				 t="";
				 for(int k=j;k<j+size;k++) {
					t=t+s.charAt(k);
				 }
				 if(toCheckPalindrome(t).equals("palindrome")) {
					 currentLen=size;
					if(currentLen>maxLen) {
						maxLen=currentLen;
						 startIndex=j;
						 endIndex=j+size; // this is important end index should be curent size +j
					}
						// if here j+size-1.then outside for loop also i<-=endindex.
					 
					 }
				
			 }
			 
			
			 
		 }
		 for(int i=startIndex;i<endIndex;i++) {
			 System.out.print(s.charAt(i));
		 }
		
	 }
	 // printing each word in new line as output from the entire string
	 
	static  void eachWordNewLine(String s) {
		String t="";
		 for(int i=0;i<s.length();i++) {
			 char ch=s.charAt(i);
			 
			 if(s.charAt(i)==' ') {
				 if(t.length()!=0)// for multiple spaces overcoming .
				System.out.println(t); // upto space printing t string and updating it.
				t="";
			 }
			 else {
				 t=t+ch;
				
				
					
			 }
			
		 }
		 if(t.length()!=0)// for last word after space there removing.
		 System.out.println(t); // for last word 
		 
			 
			 
				 }
			 
			
	 
		
	 
	 
	 
 

	public static void main(String[] args) {
	                                      // for understanding i used static methods and called from class
		Scanner Sc=new Scanner(System.in);
		
		System.out.println("enter a string");
		String s=Sc.nextLine();
		//String s1=StringsProblems.reverseString(s);       
		//System.out.println(StringsProblems.toCheckPalindrome(s,s1));
		//System.out.println(StringsProblems.printNoOfSpaces(s));
		//System.out.println(StringsProblems.countNoOfWords(s));
				
 // using string builder is best approach . best case
	/*	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		String s = sc.nextLine();

		StringBuilder s1 = new StringBuilder();

		for (int i = s.length() - 1; i >= 0; i--) {
		    s1.append(s.charAt(i));
		}

		System.out.println(s1.toString());
*/
		
		
		//System.out.println(StringsProblems.countingVowelsGivenString(s));
		//System.out.println(StringsProblems.countingOrPrintingOnlySpecialCharacters(s));
		//StringsProblems.removingSpecialCharacters(s);
		//StringsProblems.appendingNumericCharactersAtEndOfGivenString(s);
		//StringsProblems.convertToLowerCase(s);
		//StringsProblems.trimmingAtStartingAndEndingOfGivenString(s);
		//StringsProblems.printSymbolBeforeLetterOfGivenString(s);
	// given 2 strings s,t.check whether string t can be found in subsequence of string s.
		//System.out.println("enter a another string to check subsequence");
		//String t=Sc.nextLine();
		
		//System.out.println(StringsProblems.printSubsequenceStringPresentInNormalString(s,t));
		//System.out.println("enter the character to find index");
		//char k=Sc.next().charAt(0);
		
		//StringsProblems.printingIndexOfCharacter(s,k);
	// printing all substrings of certain size, given by user and its same lik subArray
		//System.out.println("enter a size or length of the substring");
		//int n=Sc.nextInt();
		//StringsProblems.printingAllSubStrings(s, n);
		//System.out.println("enter 2nd string");
		//String s2=Sc.nextLine();
		//System.out.println(StringsProblems.checking2ndStringPresentIn1stString(s,s2));
		//StringsProblems.printingLongestSubstring(s);
		StringsProblems.eachWordNewLine(s);
		
	}
	
	

}
