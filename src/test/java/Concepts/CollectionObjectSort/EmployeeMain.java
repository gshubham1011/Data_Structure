package Concepts.CollectionObjectSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class EmployeeMain {

	public static void main(String[] args) {
		
		System.out.println(" Start ");
		employee e1 = new employee(1,"shubham");
		employee e2 = new employee(1,"shubham");
		employee e3 = new employee(3,"gupta");
		employee e4 = new employee(2,"hello");
		employee e5 = new employee(4,"india");

		//HashSet<employee> emp= new HashSet<employee>();// same how to do with set sort of object
		ArrayList<employee> emp = new ArrayList<employee>();
		 
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		emp.add(e5);

		
		System.out.println(emp);
		
		Collections.sort(emp); // Default sorting 
		
		System.out.println(emp);
		
		Collections.sort(emp,employee.nameCamparator); // sorting by name 
		System.out.println(emp);

		Collections.sort(emp,new EmployeeCaparatorByIDAndName()); // separate class
		System.out.println(emp);


	}

}
