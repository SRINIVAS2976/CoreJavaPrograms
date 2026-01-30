package classAndObjectExamples;



public class Dog {
	String name;
	int price;

	public static void main(String[] args) {
		// For creating 3 dog objects .
	 Dog d=new Dog();   
	Dog  d1 =new Dog();
	Dog d2=new Dog();
// creating array for store this objects
	Dog[]arr= new Dog[3];
	arr[0]=d;
	arr[1]=d1;
	arr[2]=d2;
	arr[0].name="Srini";
	arr[1].name="vignesh";
	arr[2].name="basha";
	arr[0].price=1000;
	arr[1].price=50000;
	arr[2].price=20000;
	
	for(Dog dog:arr) {
System.out.println(dog.name+" "+dog.price);
	}
	}
}
	
