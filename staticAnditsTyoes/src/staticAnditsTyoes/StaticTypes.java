package staticAnditsTyoes;
class StaticTypesAndMethods{
	                                  // static variables ,static methods and blocks everything can be used and accesed of static variables .
	static int a;
	static int b;
	
	static void fun1() {
		int c=a*b;
		System.out.println(c);
	}
	static                            // always first execution is done by static blocks when u call class of static.first output is 30
	{
		a=10;b=20;
		System.out.println(a+b);
		fun1();// we can call same method inside like this also or direct class .fun name
	}
	                                       // instance variables ,instane methods and instance blocks cannot be accesed static types only instance variables can be accesed
	int x=25,y=50;// instance variable
	 {
		 //x=15;
		 //y=20;
		 //System.out.println(x+y);
		System.out.println("this is instance block"); // this is instance block
	}
	 void fun2() {// instance method
		 
		 System.out.println(x*y);
		 System.out.println(a+b);// accessing static types proofs.
		
	 }
	 StaticTypesAndMethods(){     // constructor of class 
		x=25;
		y=20;
		System.out.println(x+y);
		System.out.println(a-b); //non static members can access static members but static members cannot access non static members
		System.out.println(a/b);
		 
	 }
}
public class StaticTypes  {
	static {
		System.out.println("hiu welcome");  // first this will print because before jvm looks any static methods or blocks inside main class so first it executes then .main
	} 
	public static void main(String[] args) {
		//StaticTypesAndMethods.fun1();/// we can directly call the static method using class name without creating object
		StaticTypesAndMethods s=new StaticTypesAndMethods();      //between new and '()' there is instance block it will work first and then constructor will work check in above class executed according to that after u print.
	       s.fun2();
	       
	}
	
}

