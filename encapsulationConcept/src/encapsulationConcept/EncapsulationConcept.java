package encapsulationConcept;
 class EncapsulationConcept {
     private int bal;// instance variable balance  // foir ensuring security for this variales bank object
     private int accno;
    public void setbal(int bal){// local variales balance
    	this. bal=bal;           // for differeniating local and global variables we use this keyword .
     }
   public  void setaccno(int accno){// this both are getters and setters always should be public ,which is used for controlled acess
    	this. accno=accno;
     }
    public int getbal(){// getters returning same bal which user had setted .for controlled access
    	 return bal; 
     }
   public int getaccno() {
    	return accno;
    }
  
 
	public static void main(String[] args) {
		EncapsulationConcept e=new EncapsulationConcept();
		e.setbal(1000); // setting balance  
		System.out.println(e.getbal());// getting that same balance why we r doing for security controlled access . getters and setters are used as remote
		e.setaccno(23063901);
		System.out.println(e.getaccno());

	}

}
