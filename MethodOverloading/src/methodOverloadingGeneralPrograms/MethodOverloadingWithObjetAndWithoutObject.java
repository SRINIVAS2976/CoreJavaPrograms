package methodOverloadingGeneralPrograms;
class Methods{
	void main(int a,char b) {
		System.out.println("srini");
	}
	double main(float a,double b) {
		System.out.println("jagu");
		return a+b;
	}
	String java(int b, float c){
		return "srini";
	}
	String add(char a ,String c) {
		System.out.println("ravi");
		return a+c;
	}
	String add(float b,String c) {
		System.out.println("carol");
		return b+c;
	}
}
public class MethodOverloadingWithObjetAndWithoutObject {
      public static void main(String[]args) {
    	  Methods m=new Methods();
    	//float r= (float)m.main(12.0f,23.0);
    	
    	 // m.main(10,'b');// prints vicky main method because it type cast int to float automatically
    	String r1=m.add(10,"Srini");
    	System.out.println(r1);
      }
}
