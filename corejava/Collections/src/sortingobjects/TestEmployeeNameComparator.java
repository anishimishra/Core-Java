package sortingobjects;

import java.util.Set;
import java.util.TreeSet;

public class TestEmployeeNameComparator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Employee> set = new TreeSet<>(new EmployeeNameComparator());
		set.add(new Employee(100, "Obama"));
		set.add(new Employee(400, "Tom"));
		set.add(new Employee(300, "Bharath"));
		set.add(new Employee(200, "Rambo"));
		set.add(new Employee(600, "Ant"));
		set.add(new Employee(500, "Haathi"));
		set.add(new Employee(700, "Turtle"));
		for (Employee employee : set) {
			System.out.print(employee.id + " ");
			System.out.print(employee.name + " ");
			System.out.println();
		}
	}
}
