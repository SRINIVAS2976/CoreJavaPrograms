package staticAnditsTyoes;
class Test{
	static {
		System.out.println("hello welcome"); /// only this static block loaded after the class test object created in main function
	}
	static void print() {
		execute();// cannot acces non static methods
	}
     void execute() {
    	 execute();// normal methods can acces static types
	}
}
public class StaticAndItsTypes {
static {// static block
	System.out.println("hi welcome");// but here it executes before object created because always java will see inside java class there is staic varibales and methods and blocks ,after that only it goes inside main method
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub     // static is mainly used for execute the statements before main function executipon
         System.out.println("srini");        // here first prints static block and main function this prints
		//Test t=new Test();// when u create object only it works that top class static block until that program doesnt show any output . 
		
	}

}
