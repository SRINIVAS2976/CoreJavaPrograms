package com.example.Interface;



interface JDBC {
	abstract void getconn();
	void setconn();// without abstract keyword we an use it interface default it will provide it .
	void executeconn();
	void result();
	static void conndriver() {
		
		drivers(); // here we calling directly the static method inside the interface ,only static methods can call static methods, for reducing repeation of code we direclty calling that inside static method
	}
	// we r adding default methods in interface because in future after lot of classes ,implemeneted ,if we need to add feature we can directly add here ,thats why default method uses here .
	
	private  static void drivers() {     // u can use default keyword to implement a method body inside interface so implemeted classes will not get error , for backward compatibility
		System.out.println("drivers are ready for each connection");
	}   
	default void drivers1() {
		
	}

}

interface DBCONN{
    int a=3;   //static also     // inside interface variables also allowed.only values assigned are acceptable inside the interface , it is final constant. interface in default it is final variable
	void mysqlcon() ;
		
	
}
/*interface Datawarehouse extends JDBC{// impossible implementing 1 interface to other interface , because implements giving method body both also will not give method body , so error shows .
	// but possible for extends same abstract and void methods will be created inherited . 
}*/
class Oracle implements JDBC,DBCONN{// here u can implement 2 interfaces at same clases ,it is possible

	@Override
	public void getconn() {        // always increase the visibilty in top interface automatically takes as public access modifier ,so we cannot give here default so we ned to give public ,thats it 
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setconn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void executeconn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void result() {
		System.out.println("oracle is ready and succesful connection");
		
	}

	@Override
	public void mysqlcon() {
		// TODO Auto-generated method stub
		
	}

}
class MongoDB implements JDBC{
	@Override
	public void getconn(){
	
	   System.out.println("the connection is ready");
	}
	public void setconn() {
		
	}
	public void executeconn() {
		
	}
	public void result() {
		System.out.println("the connection is not succefful");
	}

	
}
class MariaDB implements JDBC{
	public void getconn(){
		
		   System.out.println("the connection is ready");
		}
		public void setconn() {
			System.out.println("iam ready to next step");
		}
		public void executeconn() {
			System.out.println("iam waiting");
		}
		public void result() {
			System.out.println("the connection was successful");
		}

}
class sqldriver extends MariaDB implements DBCONN{// multiple inheritance extending one clss and implementing other clas
	@Override
	public void executeconn() {
		// TODO Auto-generated method stub
		//super.executeconn();
		System.out.println("first i will complete");
	}
	@Override
		public void setconn() {
			// TODO Auto-generated method stub
			super.setconn();
		}
	@Override
	public void mysqlcon() {
		// TODO Auto-generated method stub
		
	}
}

class  JDBCConnection{
	void access(JDBC J){
		J.executeconn();
		J.result();
		J.setconn();
	}
}

public class InterfaceBasic {

	public static void main(String[] args) {
	         // u cannot create object for interfaces which to achieve abstraction and standardization so only child class u can create it
		MongoDB m=new MongoDB();
		MariaDB m1=new MariaDB();
		// to acheive polymorphism  either top object creation or this .
           JDBC J= new MongoDB();
           JDBC J1=new MariaDB();
           JDBC J2=new Oracle();
           JDBC J3=new sqldriver();
           // for polymorphic class accesing 
           JDBCConnection JD=new JDBCConnection();
           JD.access(J1);
           JD.access(J);
           JD.access(J2);
           JD.access(J3);
           
           System.out.println(DBCONN.a); // static also it is inbuilt in interface so directly calling the interface name ,without using static keyword
           JDBC.drivers();
	}

}
