package collectionsArrayListorLinkedList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.ArrayList;

public class LinkedListArrayList {

	public static void main(String[] args) {
		LinkedList L1=new LinkedList();
		//ArrayList A1=new ArrayList();
		
		
		L1.add(10);
		L1.add(20);
		L1.add(1,30);
		
		System.out.println(L1);
		ArrayList A1=new ArrayList(L1);// here the polymorphism achieved like constructor parent reference child object . arraylist(collection) constructor
		L1.addAll(1,A1);//here 1st position will be added 10,30,20 because L1 given to array list object so .at 1st position , it will be added .
		A1.add(100);
		System.out.println(L1.size());
		System.out.println(A1.containsAll(L1));
		System.out.println(L1);
		System.out.println(A1);
		for(int i=0;i<L1.size() ;i++) {
			System.out.println(L1.get(i));
		}
		ArrayList A2=new ArrayList(3);// constructor with this size
		A2.add(10);
		A2.add(300);
		A2.add(200);
		A2.add(400);
		LinkedList L2=new LinkedList(A2);
		//System.out.println(L2.peek());// here we r peeking the first element just copy &paste 
		
		System.out.println(L2.poll());// we r polling 1st value . cut and pasting again down
		System.out.println(L2); // yes after poll we r printing this thats it .
		
		
		System.out.println(A2);
		
	}

}
