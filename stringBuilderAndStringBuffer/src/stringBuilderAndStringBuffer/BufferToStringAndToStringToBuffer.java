package stringBuilderAndStringBuffer;
import java.util.Scanner;

public class BufferToStringAndToStringToBuffer {
public static void main(String[]args) {
//	String s=new String("java");
	//StringBuffer sb=new StringBuffer();// conversion from string to string buffer
	//sb.append("java");
	//String s1=sb.toString();//conversion from stringuffer to string to use string methods
	//s1=s1.concat("coding");
	//System.out.println(s1);
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a string ");
	String s=sc.nextLine();
	StringBuffer sb=new StringBuffer(s);// converting given input from user keyboard (string)to stringbuffer (changing immutable to mutable string
	sb.append("tap academy");
	System.out.println(sb);
}
}
