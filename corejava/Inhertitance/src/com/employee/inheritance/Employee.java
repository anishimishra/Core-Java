package com.employee.inheritance;

public class Employee {
	int id;
	String name;
	String dept;
	double salary;

	public Employee(int id, String name, String dept, double salary) {
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		System.out.println("Inside Employee constructor");
	}

	protected void work() {
		System.out.println("Common work for everyone");
	}

	// if a method is marked as final it cannot be overridden
}
