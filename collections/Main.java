package collections;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> cities = new ArrayList<String>();
		String[] cities2 = new String[] {};
		
		cities.add("Ankara");
		cities.add("Ýstanbul");
		
		System.out.println(cities.contains("Ýstanbul"));
		
		cities.remove("Ankara");
		cities.remove(0);
		
		System.out.println(cities.size());
		System.out.println(cities2.length);
		
		Employee employee1 = new Employee(4, "Ýsim");
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1,"Engin"));
		employees.add(new Employee(2,"Hüseyin"));
		employees.add(new Employee(3,"Eren"));
	
		System.out.println(employees.size());
		System.out.println(employees.contains(new Employee(1,"Engin")));
		
		// Custom Array List
	
		MyArrayList<Employee> myArray = new MyArrayList<>();
		myArray.add(new Employee(1, "Ozgur"));
		myArray.add(new Employee(2, "Ahmet"));
		myArray.add(new Employee(3, "Ahmet"));
		myArray.add(employee1);
		
		System.out.println( myArray.size());
		myArray.contains(employee1);
	
	}

}
