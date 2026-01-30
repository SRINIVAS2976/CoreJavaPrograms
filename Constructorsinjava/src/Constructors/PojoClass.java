package Constructors;

import java.util.Scanner;
// pojo class is nothing but giving facility to developer of giving every usability of getters and setters and  every constructors 
public class PojoClass {// pojo class means we r using both settes and getters and 0 parametrized constructor and parameterized construtor 
	private int id;
	private String name;
	private String email;
	private int salary;
	public PojoClass() {
		// 0 parameterized constructor 
	}
	
public PojoClass(int id, String name, String email, int salary) { // using parameterized constructor also
		this.id = id;
		this.name = name;
		this.email = email;
		this.salary = salary;
	}
   
                                               //using both getters and setters
public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {// we can use getters and setters like this also or previpusly class in encapsulation i created setters first and getters next 
	this.name = name;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public int getSalary() {
	return salary;
}

public void setSalary(int salary) {
	this.salary = salary;
}

public static void main(String[] args) {
	// object created for the class
	/*PojoClass p=new PojoClass();
	
	// getting input from user
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the details:");
//	int  id=sc.nextInt();
	//String name=sc.next();                    // these are one ways to get input 
	//String email=sc.next();
	//int salary=sc.nextInt();
	                                               // i need to store the input using ',' so we use split method. i need to store the users input with ','
	String input=sc.nextLine();//getting all inputs storing as a string even a integer also storing like  string
	String[]arr=input.split(",");      // using split method to get the input as separated as commas(',') and always split method gives only array .return type is string array.
	
	
	int id=Integer.parseInt(arr[0]);// converting string to integer. this parse int will convert string to integer . we can set only integers thats why we r converting
	int salary=Integer.parseInt(arr[3]);
    
	
	// setting users input to setter method
	p.setId(id);// setters method is intger but here we storing string , so we need to convert that array string to int after storing here
	p.setName(arr[1]); // these are already variables are string so it accepts directly
	p.setEmail(arr[2]);// these also
	p.setSalary(salary); // here also salary is int type , we r getting input as a string , we cannot set value directly because saalry variale is int type , we have string so we need to convert string to integer.
	
	// geting the already setted users input
	input.concat("this is my program");
	System.out.println(input);           // strings are immutable ,getting user inputs are immutable thats why we cannot concatenate output also we dont get this because ,still we doesnt give any reference to immutable string
	
	System.out.println(p.getId()+" "+p.getName()+" "+p.getEmail()+" "+p.getSalary());
 
}*/
	                                                                         // or
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter no of employees");
	int n=sc.nextInt();      
	   sc.nextLine(); // dummying the nextint()\n  nextLine()  ,first we getting as nextint() then we should use either next()or dummy like this line to remove \n after entering the no of employees
	PojoClass[]arr1=new PojoClass[n];// after knowing no of employess and before creating object, making my array ready 
       for(int i=0;i<n;i++) {                         //for creating more objects upper program for only one employeeobject . for multiple objects	
    	   PojoClass p=new PojoClass();      
    	   
System.out.println("Enter the details:");
//int  id=sc.nextInt();
//String name=sc.next();                    // these are one ways to get input 
//String email=sc.next();
//int salary=sc.nextInt();
                               
              // i need to store the input using ',' so we use split method. i need to store the users input with ','
String input=sc.nextLine();//getting all inputs storing as a string even a integer also storing like  string
String[]arr=input.split(",");      // using split method to get the input as separated as commas(',') and always split method gives only array .return type is string array.


int id=Integer.parseInt(arr[0]);// converting string to integer. this parse int will convert string to integer . we can set only integers thats why we r converting
int salary=Integer.parseInt(arr[3]);


// setting users input to setter method
p.setId(id);// setters method is intger but here we storing string , so we need to convert that array string to int after storing here
p.setName(arr[1]); // these are already variables are string so it accepts directly
p.setEmail(arr[2]);// these also
p.setSalary(salary); // here also salary is int type , we r getting input as a string , we cannot set value directly because saalry variale is int type , we have string so we need to convert string to integer.

// geting the already setted users input
//input.concat("this is my program");
//System.out.println(input);           // strings are immutable ,getting user inputs are immutable thats why we cannot concatenate output also we dont get this because ,still we doesnt give any reference to immutable string

//System.out.println(p.getId()+" "+p.getName()+" "+p.getEmail()+" "+p.getSalary());
arr1[i]=p;  // making a single object store into array ,thats why we using array , without using array ,the objects are garbage collected when it loops 

                                  }
       
       /// now i have to check in my objects the values are setted inside as stored in array or not iam creating array , creating object setting values of the object , after storing inside alredy done in top of program ,i need to view
       
       for(PojoClass p:arr1) {
    	   System.out.println(p.getId()+" "+p.getName()+" "+p.getEmail()+" "+p.getSalary());
       }
       
       
}
}




