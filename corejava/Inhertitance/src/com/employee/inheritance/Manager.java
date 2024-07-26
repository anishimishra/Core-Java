package com.employee.inheritance;

public class Manager extends Employee {
	String projects[];
	double salary;

	public Manager(int id, String name, String dept, double salary, String projects[], double managerSalary) {
		super(id, name, dept, salary);
		// TODO Auto-generated constructor stub
		System.out.println("Inside Manager constructor");
		this.projects = projects;
		this.salary = managerSalary;
	}

	@Override
	protected void work() {
		super.work();
		System.out.println("Manager is managing ");
		for (int i = 0; i < projects.length; i++) {
			System.out.println(projects[i]);
		}
	}

}
