package BasicArrays;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayBasic1dimensional {

		    public static void main(String[] args) {
		     // float[]a=new float[10];
		      int []b={1,24,54,32,56};
		    
		      int a=b.length;
		    /* Scanner sc=new Scanner(System.in);
		      for(i=0;i<b.length ;i++)
		      {
		          System.out.println("enter cgpa:");
		          a[i]=sc.nextFloat();
		      }*/
		       
		    	   for(int i = 0; i <a/2; i++)
				      {
		    		   int temp=b[i]; // putting last value as temp vaiable
		    		   b[i]=b[a-1-i];// putting 1st vale to last
		    		   b[a-1-i]=temp;// same that last value comes to 1st position
				         // System.out.print(a[ i]+" "+b[i]);
		    		  System.out.println(Arrays.toString(b));
		    		 
				      }
		    	
		      
		       
		     // sc.close();
		      }
	}


