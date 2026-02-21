package comparableandcomparator;

import java.util.Scanner;
import java.util.TreeSet;

// POJO CLASS
class Employee implements Comparable<Employee /*
												 * we must use genrics here because we need to say what type we r
												 * implemnting abstract method thats why or else it will shows error
												 */> { // implementing comparable interface to override compareTo method
														// inside inbuuilt java interface
	private int id;
	private String name;
	private String lastname;
	private String gmail;
	private String dept;
	private int salary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getGmail() {
		return gmail;
	}

	public void setGmail(String gmail) {
		this.gmail = gmail;
	}

	public String getdept() {
		return dept;
	}

	public void setdept(String dept) {
		this.dept = dept;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Employee(int id, String name, String lastname, String gmail, String dept, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.gmail = gmail;
		this.dept = dept;
		this.salary = salary;
	}

	public Employee() {
		super();

	}

	public String toString() { // we r using to string to avoic code repetition and especially if we r storing
								// in collections as object ,this tostring will comes into play print all
								// objects in 1 shot
		return id + " " + name + " " + lastname + " " + gmail + " " + dept + " " + salary + " ";
	}

	@Override
	public int compareTo(Employee o) { // compareto method always we should declare as wrapper class ,not primitive
										// types

		Integer id1 = this.id; // here we r sorting based on id , we r giving sort method id 1 currently
								// executing object this . and another as paramter o below .
		Integer id2 = o.id;
		// this is genreal statement inside compareTo method comapring 1 employee object
		// based on id with 2nd employee object based on its id .
		/*
		 * if(id1>id2) { return 1; // positve means swap each character } else
		 * if(id2>id1){ return -1; // negative means no swap each character } else {
		 * return 0; // == means 0 }
		 */
		// we can write entire if else into 1 statement .
		// return id1.compareTo(id2); // one line statement of above all programs .

		// sorting using name and lastname
		/*
		 * String name1=this.name; // cuurently executing 1 name String name2=o.name;//
		 * this name given as another name for 2 nd employee return
		 * name1.compareTo(name2);
		 */

		// sorting based on length of the name .
		// String name1=this.name;
		// String name2=o.name;
		// return name1.length()-name2.length(); //or
		// return Integer.compare(name1.length(), name2.length());

		// or
		// return Integer.valueOf(name1.length()).compareTo(name2.length());
		/*
		 * if(name1.length()>name2.length()) { return 1; // swap } else
		 * if(name2.length()>name1.length()) { return -1; // no swap } else { return 0;
		 * }
		 */

		// for Treeset we need to sort if we same name we need to sort based on last
		// name .

		String name1 = this.name;
		String name2 = o.name;
		// we r getting data even if we same name ,compare using last name , in treeset
		// it removes duplicated but we making to print the values and compare it based
		// on last name .
		if (name1.equals(name2)) {
			return this.lastname.compareTo(o.lastname);
		} else if (id1 == id2) {
			return name1.compareTo(name2);
		} else {
			return name1.compareTo(name2);
		}

	}

}

public class ComparableAndComparator {

	public static void main(String[] args) {

		// ArrayList<Employee> al=new ArrayList<Employee>(); // creating array list for
		// just using arraylist how objects stored and sorted . by using collections we
		// just creating it .
		TreeSet<Employee> ts = new TreeSet<Employee>(); // treeset will remove duplicates
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of employees");
		int n = sc.nextInt();
		// sc.nextLine();

		for (int i = 0; i < n; i++) { // for reducing repeatitve satements we r using this .
			Employee e = new Employee();
			System.out.println("enter the details of" + (i + 1) + "st" + "Employee");
			String s = sc.next(); // we r getting input as a string
			String[] arr = s.split(","); // we r splitting the entered string with commas , and storing into array
											// directly

			// we r setting values from the array to employee object ,

			e.setId(Integer.parseInt(arr[0])); // here we r getting input as a string so we need to convert into integer
												// and store it in employee object .
			e.setName(arr[1]);
			e.setLastname(arr[2]);
			e.setGmail(arr[3]);
			e.setdept(arr[4]);
			e.setSalary(Integer.parseInt(arr[5]));
			// System.out.println(e); // if u simply print it will give inherited tostring
			// as hashcode , we need to override toString in employee thats it .

			// converting the above stored values into collections arraylist and tree set

			ts.add(e); // for treeset i default sort it by own we dont want to give collections.sort
						// method.
			// Collections.sort(al); // we cannot use this sort method like this ,because
			// java clls inbuilt compare to and it dont know according to which u need to
			// sort , so we need to override compare to method in employee class and do it .

		}
		// System.out.println(al);
		System.out.println(ts);
		sc.close();

	}

}
