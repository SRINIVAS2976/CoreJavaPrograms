package com.example.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class HashMapAccess {

	public static void main(String[] args) {
		HashMap hm=new HashMap(); // does not preserve order of insertion.
		hm.put(1,"srini");
		hm.put(2,"srini");
		hm.put(5, "torvald");
		hm.put(4, "hore");
		hm.put(2, "vrini");// same last updated value is printed ,data loss , foir key duplicates
		hm.putIfAbsent(5, "vicky");
		Set s=hm.entrySet();  // we r converting hash map into has set then only we csn access it .
		/*for( Object o: s) {  // we can access or traverse only after conversion of map into set and
			System.out.println(o);
			
		}*/
		Iterator itr=s.iterator();
		while(itr.hasNext()) {     // it is possible only after converting into hashset ,we can traverse.
		System.out.println(itr.next());
		}
		LinkedHashMap lm=new LinkedHashMap();
		lm.put(5,"cow");
		lm.put(6,"himalayan");
		lm.put(7,"dog");
		lm.put(7,"buffalo"); // with same key the last key value is printed everytimr
		Set s2=lm.keySet();
		Set s1=lm.entrySet();
		Iterator itr1=s1.iterator();
		Iterator itr2=s2.iterator();
		while(itr1.hasNext()){
			System.out.println(itr1.next());
		}
		while(itr2.hasNext()){
			System.out.println(itr2.next());
		}
		TreeMap Tm=new TreeMap();
		 /// it gives sorted order only ,no order of insertion. and for range operations like headset ,tailset, subset best.
		Tm.put(0, "raina");
		Tm.put(2, "virat");
		Tm.put(1, "40");
		System.out.println(Tm);
		// maps always need to convert into set and use th iterator
	   Set v=Tm.entrySet();
	   Iterator itr3=v.iterator();
	  while( itr3.hasNext()){
		  System.out.println( itr3.next());
	   }
		
		
		
		

}
}