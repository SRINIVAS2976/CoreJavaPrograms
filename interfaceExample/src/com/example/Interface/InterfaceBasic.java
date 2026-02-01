package com.example.Interface;



interface JDBC {
	abstract void getconn();
	void setconn();// without abstract keyword we an use it interface default it will provide it .
	void executeconn();
	void result();

}
class Oracle implements JDBC{

	@Override
	public void getconn() {
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
			
		}
		public void executeconn() {
			
		}
		public void result() {
			System.out.println("the connection was successful");
		}

}
class  JDBCConnection{
	void access(JDBC J){
		J.executeconn();
		J.result();
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
           // for polymorphic class accesing 
           JDBCConnection JD=new JDBCConnection();
           JD.access(J1);
           JD.access(J);
           JD.access(J2);
	}

}
