package stringReverse;

import java.util.Arrays;

public class StringReversal {

	public static void main(String[] args) {
		String s="java ,tap, academy";
		//char []arr=s.toCharArray();
		int a=s.length();
		//for(int i=a-1;i>=0 ;i--) {
		//arr[i]=s.charAt(i);
		//	System.out.print(arr[i]);
		//}
		for(int i=a-1;i>=0 ;i--) {
			char n1=s.charAt(i); 
				System.out.print(n1);
		}
		
		
	}

}
