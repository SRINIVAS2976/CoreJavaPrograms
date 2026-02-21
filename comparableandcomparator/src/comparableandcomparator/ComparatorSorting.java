package comparableandcomparator;

//import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;
//  @SuppressWarnings({ "hiding", "unused" })

class Type1 implements Comparator<Employee2> {
	// sorting based on employeeid
	@Override
	public int compare(Employee2 e1, Employee2 e2) { // here compare method
		// TODO Auto-generated method stub
		Integer id1 = e1.getId();
		Integer id2 = e2.getId();
		return id1.compareTo(id2);
	}
}

class Type2 implements Comparator<Employee2> {
	// sorting based on employee name
	@Override
	public int compare(Employee2 e1, Employee2 e2) {
		// String name1=e1.getName();
		// String name2=e2.getName();
		// return name1.compareTo(name2);
		// or

		return e1.getName().compareTo(e2.getName()); // for string types u can give thid directly
	}

}

class Type3 implements Comparator<Employee2> {
	// sorting based on last name
	@Override
	public int compare(Employee2 e1, Employee2 e2) {
		return e1.getLastname().compareTo(e2.getLastname());// string is an object so directly we can return it
	}

}

class Type4 implements Comparator<Employee2> {
	// sorting based on gmail
	@Override
	public int compare(Employee2 e1, Employee2 e2) {
		return e1.getGmail().compareTo(e2.getGmail());
	}
}

class Type5 implements Comparator<Employee2> {
	// sorting based on dept
	@Override
	public int compare(Employee2 e1, Employee2 e2) {
		return e1.getdept().compareTo(e2.getdept());
	}
}

class Type6 implements Comparator<Employee2> {
	// sorting based on salary.
	@Override
	public int compare(Employee2 e1, Employee2 e2) {
		Integer s1 = e1.getSalary(); // for integer types we need to convert i first wrappper class then we should
										// use it
		Integer s2 = e2.getSalary();
		String dept1 = e1.getdept();
		String dept2 = e2.getdept();
		Integer n1 = s1.compareTo(s2);
		if (n1 != 0) {
			return s1.compareTo(s2);
		}

		if (!dept1.equals(dept2)) {
			return dept1.compareTo(dept2);
		} else {
			return e1.getGmail().compareTo(e2.getGmail());
		}
	}
}

// for saalry high to low we need another class
class Type7 implements Comparator<Employee2> {
	// sorting based on salary.from high to low

	@Override
	public int compare(Employee2 e1, Employee2 e2) {

		Integer s1 = e1.getSalary(); // for integer types we need to convert i first wrappper class then we should
										// use it
		Integer s2 = e2.getSalary();
		Integer id1 = e1.getId();
		Integer id2 = e2.getId();
		if (s1 > s2) {
			return -1;

		}
		if (s1 < s2) {
			return 1;
		}

		if (id1 != id2) {
			return id1.compareTo(id2);
		}

		else {
			return e1.getGmail().compareTo(e2.getGmail());
		}

	}
}

// POJO CLASS
class Employee2 { // <Employee2/*we must use genrics here because we need to say what type we r
					// implemnting abstract method thats why or else it will shows error */>{ //
					// implementing comparable interface to override compareTo method inside
					// inbuuilt java interface
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

	public Employee2(int id, String name, String lastname, String gmail, String dept, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.gmail = gmail;
		this.dept = dept;
		this.salary = salary;
	}

	public Employee2() {
		super();

	}

	public String toString() { // we r using to string to avoic code repetition and especially if we r storing
								// in collections as object ,this tostring will comes into play print all
								// objects in 1 shot
		return id + " " + name + " " + lastname + " " + gmail + " " + dept + " " + salary + " ";
	}

	// here we r creating compareto from comparale interface and implemeting that ,
	// it was same in previous program , but now we can do this in diff class

	// @Override
	// public int compareTo(Employee2 o) { // compareto method always we should
	// declare as wrapper class ,not primitive types

	// Integer id1 =this.id; // here we r sorting based on id , we r giving sort
	// method id 1 currently executing object this . and another as paramter o below
	// .
	// Integer id2=o.id;
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
	/*
	 * String name1=this.name; String name2=o.name; // we r getting data even if we
	 * same name ,compare using last name , in treeset it removes duplicated but we
	 * making to print the values and compare it based on last name .
	 * if(name1.equals(name2)) { return this.lastname.compareTo(o.lastname); } else
	 * if(id1==id2) { return name1.compareTo(name2); }
	 * 
	 * else { return name1.compareTo(name2); }
	 * 
	 * 
	 * }
	 */

}

public class ComparatorSorting {

	public static void main(String[] args) {
		Type1 t1 = new Type1();
		Type2 t2 = new Type2();
		Type3 t3 = new Type3();
		Type4 t4 = new Type4();
		Type5 t5 = new Type5();
		Type6 t6 = new Type6();
		Type7 t7 = new Type7();
		// user need to select the option how to sort based on which
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the option how to be sorted\n" + "1.Id\n" + "2.name\n" + "3.lastname\n" + "4.gmail\n"
				+ "5.dept\n" + "6.salary(low to high)\n" + "7.salary(high to low)");
		int option = sc.nextInt();
		TreeSet<Employee2> ts = null; // here we r declaring local variable must be initialized ,so we give first null
										// , then using this local variale to create object based on user switch.
		switch (option) {
		case 1: {

			ts = new TreeSet<Employee2>(t1); // here we r passing the comparator object reference here ,loose coupling.
			break;
		}
		case 2: {

			ts = new TreeSet<Employee2>(t2); // here we r passing the comparator object reference here ,loose coupling.
			break;
		}
		case 3: {

			ts = new TreeSet<Employee2>(t3); // here we r passing the comparator object reference here ,loose coupling.
			break;

		}
		case 4: {

			ts = new TreeSet<Employee2>(t4); // here we r passing the comparator object reference here ,loose coupling.
			break;
		}
		case 5: {

			ts = new TreeSet<Employee2>(t5); // here we r passing the comparator object reference here ,loose coupling.
			break;
		}
		case 6: {
			ts = new TreeSet<Employee2>(t6); // here we r passing the comparator object reference here ,loose coupling.
			break;
		}
		case 7: {
			ts = new TreeSet<Employee2>(t7);
			break;
		}
		default: {
			System.out.println("enter valid input");
			break;
		}

		}

		System.out.println("enter number of employees");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) { // for reducing repeatitve satements we r using this .
			Employee2 e = new Employee2();
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
