package Constructors;
class ConstructorAndDefaultConstructor{
	private int a;
	private char c;
	private boolean b;
	private float f;
	private double d;
	private byte by;
	private short s;
	private long l;
	 private String s1;
	// there is no constructor here ,but java automatically creates default construtor Constructors{
    // if there is  a constructor java will not create default constructor , then it looks programmers constructor and work upon that
    
    //}
	public ConstructorAndDefaultConstructor(){ //Constructor given by me for 0 parameterized constructor
		// we can directly pass values here also 
		a=10;
		c='b';
	     s1="ramu";
	}
	public ConstructorAndDefaultConstructor(String s1){ //Constructor given by me for 0 parameterized constructor
		// we can directly pass values here also 
		this();
		this.s1=s1; // it will overwritten the value ramu in top u given value .
	}
	
	
	public   ConstructorAndDefaultConstructor(int a,double d,String s1){ 
		this(s1);// calling 0 parameterized contructor top .this is constructor chaining the output will that 0 parameterized constructor defined values
		
		
		//this.a=a;
		//this.d=d;
	}
	
	public ConstructorAndDefaultConstructor (double d,float f,int a){// normal constructor calling by programmer

		this.a=a;
		this.f=f;
		this.d=d;
	}
	
	
	                        
	 public int geta(){// getters method
		return a;
	}
	public char getc() {
		return c;
	}
	public boolean getb(){
		return b;
	}
	byte getby() {
		return by;
	}
	short gets() {
		return s;
	}
	long getl() {
		return l;
	}
	String gets1() {
		return s1;
	}
	float getf() {
		return f;
	}
	double getd() {
		return d;
	}
	public static void main(String[] args) {
		 //ConstructorAndDefaultConstructor c2=new ConstructorAndDefaultConstructor();//this for default constructor withow passing anything it automatcaly returns default instance values.
		//System.out.println(c2.geta()+" "+c2.gets1()+" "+c2.getc());
		 ConstructorAndDefaultConstructor c1=new ConstructorAndDefaultConstructor(25,'a',"srini");// constructor passing value directly by object creation
		 
		      System.out.println(c1.geta()+" "+c1.getf()+" "+c1.getby()+" "+c1.gets1()+" "+c1.getl());
		      System.out.println(c1.getc()+c1.getd());// default value of character default is always invisible .
	
	}}
 


