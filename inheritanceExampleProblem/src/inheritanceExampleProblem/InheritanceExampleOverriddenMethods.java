package inheritanceExampleProblem;
class Animal{
	static  void breathe() {                           // tis method will hide automatically when we use this same method in child class . if u want to print this method using parent class u can print but not using child class . 
		System.out.println("animals always live due to breathing only ");
	}
	void eats() {
		System.out.println("i will eat any types of animals");
	}
	void hunt() {
		System.out.println("i will be hunting any small animals");
	}
	Animal eat() {  /// object is the return type so we can return this also in overriding
	System.out.println("hello");
		Animal A=new Animal();
		return A;
	}
}
class deer extends Animal{
	
	 static void breathe() { // we cannot override static methods  , so this method acts as specialized method. internally parent class breathe method hides 
		System.out.println("i am not human to breathe"); // this only prints ,parent class methods hides .this is method hiding.
	}
	@Override               // whenever u remove this override annotation the below method act as specialized method ,java automatically consider that .if u give parameter it will work after removing this override
	void eats(){
		System.out.println("i will eat only grass and small animals"); // here it overrirdes the eats method from parent class
	}
	// specialized method
	void sleep() {
		System.out.println("i will be sleeping at morning and evening");// it is specialized method which parent do not have 
	}
}
class lion extends Animal{
	@Override
	void eats() {
		System.out.println("i will eat deers and foxes");
	}
	// specialized method
	void sleep() {
		System.out.println("i will sleep at day only");
	}
}
class tiger extends Animal{
    @Override
	tiger eat() {    
		// here the parent class has eat() has object return type so we can give any object as return type only in this case .
		tiger t=new tiger();
		System.out.println("hi"); // here overriding
		return t;   // return the reference of object 
	}
}

class monkey extends Animal{
	@Override
	void eats() {
		System.out.println("i will eat bananas and fruits only i will not eat animals");
	}
	void sleep() {
		System.out.println("i will sleep at night only .");
	}
}
class AnimalsBehaviours{
	public void animalkingdom(Animal ref){  // for entire animals we created one method to accept all overriden methods and inherited methods to get here and print it .
		ref.eats();
		ref.eat();
		Animal.breathe();
	}
}

public class InheritanceExampleOverriddenMethods {

	public static void main(String[] args) {
		  // same for all child class u need to create object and access it .
			
	/*	deer d1=new deer();
		// we should always call static methods with class name
		deer.breathe();
		d1.breathe();// it is inherited method from parent animal 
		d1.eats();// it is overirden
		d1.hunt();// it is inherited method from parent animal
		d1.sleep();//it is specialized method which do not have for parent
		 lion l=new lion();
		 l.breathe();
		
		tiger t1=new tiger(); 
		tiger T=t1.eat();  
		   */
		
		
		                           //     TO ACHIEVE POLYMORPHISM FOR SAME ABOVE PROGRAM
		 Animal ref=new deer();     // another way of creating object to achieve polymorpsim .parent reference ,child object
		 
		 Animal ref1=new lion();
		/*deer d= new deer();
		lion l=new lion();
		tiger t=new tiger();
		monkey m=new monkey(); */
		                             // for speciailized methods achieving polymorphism  it is "down casting" ,parent class into child class
		
	   /*  ref=d;        // assigning child reference to parent reference .
		((deer)(ref)).sleep();
		ref=l;
		
		((lion)(ref)).sleep();
		ref=m;
		((monkey)(ref)).sleep();*/
		                              // for overriden methods we can call directly methods using ref.eat() but the efficient way is 
		                                // for multiple overriden methods this case will be useful.in child classes instead of calling each method of each class.
               AnimalsBehaviours a=new AnimalsBehaviours();
               a.animalkingdom(d);
               a.animalkingdom(l);
               a.animalkingdom(t);                         // we have achieved polymophsism by code flexibility as creating one class and accssing all overriden methods,code lines also reduced
               a.animalkingdom(m);
                                                     // many lines of code is reduced.
                           
	}

}
