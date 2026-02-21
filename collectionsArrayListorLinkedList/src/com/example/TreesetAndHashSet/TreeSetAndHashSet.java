package com.example.TreesetAndHashSet;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.Iterator;

public class TreeSetAndHashSet {

	public static void main(String[] args) {
		/*TreeSet T=new TreeSet();
	    T.add(20);
	    T.remove(20);
	    T.add(30);
	    T.add(50);
	    T.add(70);
	    T.add(80);
	    T.add(90);
	    System.out.println(T.ceiling(50));
	    System.out.println(T.higher(50));
	    System.out.println(T.floor(50));
	    System.out.println(T.headSet(70));// it prints before 70 everyvalues , head set first values before 70
	    System.out.println(T.tailSet(70));// it prints last values after 70
	    System.out.println(T.subSet(50, 90)); // it prints middle values from 50-90
	    System.out.println(T);
	}*/
	HashSet hs=new HashSet();
	hs.add("tap");
	hs.add(30);
	hs.add(30); // no duplcatres
	Iterator itr=hs.iterator();
	while(itr.hasNext()) {
	System.out.println(itr.next());
	}

}
}
