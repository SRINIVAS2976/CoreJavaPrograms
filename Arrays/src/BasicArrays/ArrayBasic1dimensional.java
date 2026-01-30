package BasicArrays;
import java.util.Scanner;
public class ArrayBasic1dimensional {

		    public static void main(String[] args) {
		      float[]a=new float[10];
		      int []b={1,24,54,32,56,};
		      int i;
		     Scanner sc=new Scanner(System.in);
		      for(i=0;i<a.length ;i++)
		      {
		          System.out.println("enter cgpa:");
		          a[i]=sc.nextFloat();
		      }
		          for(i=0;i<a.length ;i++)
		      {
		          System.out.print(a[ i]+" ");
		      }
		      
		      }

	}


