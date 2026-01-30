package importantMethodsjava;

import java.util.Iterator;
import java.util.StringTokenizer;

public class SplitAndOtherMethodsINJava {

	public static void main(String[] args) {
		String s="Raja Ram Mohan Roy"; 
	//char[]n1=s.toCharArray();
		String []n2=s.split("a");// converting string to array
		for (String arr:n2)
		System.out.print(arr);
		// String Tokenizer concept 
	//	StringTokenizer st=new StringTokenizer("java python ai ml","");//same like split(" ") chopping means removing that element
		 
		//st.hasMoreElements();//its used for traversing the given string ,it is cursor logic .
		//String s=st.nextToken();// to get the string or 1st value from given inside string tokenizer.
		//System.out.println(s);// this for each element 
		//while(st.hasMoreElements())// this is boolean when condition true it executes inside . value is there it will iterate 
			//{
			//System.out.println(st.nextToken());// with single loop we can print entire output
		//}
		
	}
	}


