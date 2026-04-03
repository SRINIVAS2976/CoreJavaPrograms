package com.example.BasicPracticePrograms;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class HashMapProblem { // same program of string 2nd part difficult problems .
	static void manipulatingString(String s) {
		LinkedHashMap<Character,Integer>map=new LinkedHashMap<Character,Integer>();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(map.containsKey(ch)) {
				int value=map.get(ch); // getting value of that current ch already present inside the string
				map.put(ch, value+1);  // upadting values
			}
			else {
				map.put(ch,1);// if key is new adding key and value.
			}
		}
		// for accessing individual in map by using entry set
		Set<Entry<Character,Integer>> set=map.entrySet();  // always whenver ur using entry set . u need to import map.entry.
	for(Entry<Character,Integer> entry:set) {              // 
		System.out.println(entry.getKey()+""+entry.getValue());
	}
		
	}
	
	// given string s . need to print all words occuring more than 3 times in new line .
	static void wordsRepeatingGivenString(String s) {
		HashMap<String,Integer>map=new HashMap<String,Integer>();
		String []arr=s.split(" ");
		for(int i=0;i<arr.length;i++) {
			String s1=arr[i];
			if(map.containsKey(s1)) {
				int value=map.get(s1);
				map.put(s1, value+1);
			}
			else {
				map.put(s1, 1);
			}
			
		}
		/*
		Set<Entry<String,Integer>>set=map.entrySet();   // map.entry should be imported .
		for(Entry<String,Integer>entry:set) {
			if(entry.getValue()>3) {
				System.out.println(entry.getKey());
			}
		}
		*/
		//or this below approcah for getting strings directly from key set and checking repaeating strings.
		for(String x:map.keySet()) {
			if(map.get(x)>3) {
				System.out.println(x);
			}
		}
		
		}
	// shifting each charatcters and encrypting a string . by 3 characters.
	static void encryptCharacters(String s) {
		String t="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>=65 && ch<=90) {
				//t=t+(char)((ch-'A'+3)%26+'A');
				
				//or this below
				
				int x=ch-65;
				x=(x+3)%26;
				t=t+(char)(x+65);
			}
		
			else if(ch>='a' &&ch<='z') {

				//t=t+ (char)((ch - 'a' + 3) % 26 + 'a');
				
				// or this
				int x=ch-97;
				x=(x+3)%26;
				t=t+(char)(x+97);
				
			}
			else {
				t=t+ch;  // for spaces ,special characters .
			}
			
		}
		System.out.println(t);
	}
		
	

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter a String");
		String s=Sc.nextLine();
		HashMapProblem hm=new HashMapProblem();
		//HashMapProblem.manipulatingString(s);
		//HashMapProblem.wordsRepeatingGivenString(s);
		HashMapProblem.encryptCharacters(s);
		
	}

}
