package stringBuilderAndStringBuffer;
import java.util.Scanner;

//import jdk.internal.org.jline.terminal.TerminalBuilder.SystemOutput;

public class BufferAndBuilderConcepts {

	public static void main(String[] args) {
	String a=new String("Tap aCadeMy");
	char []s1=a.toCharArray();
	for(int i=0;i<s1.length;i++) {
	char n1=a.charAt(i);
	if(n1>65&&n1<97 ){
		//n1=Character.toLowerCase(n1);
		char n2=(char)(n1+32);
		System.out.print((n2));
	}
	
	else if(n1==32) {
	        System.out.print(" ");// do nothing just assign same space
	}
	else {
		//n1=Character.toUpperCase(n1);
		char n3=(char)(n1-32);
		System.out.print((n3));
	}
	}
	//Scanner	sc=new Scanner(System.in);
	//System.out.println("enter a string");
	//String a=sc.nextLine();
	//System.out.println(a.toUpperCase());
	//StringBuffer sb=new StringBuffer(a);// Stringbuffer mutable ,getting input from user strings are imutable thats why we converting by passing string arguements
	
	//System.out.println(sb.reverse());//reverse method can be used only in string buffer and builders.thats why this
	

	}
}

