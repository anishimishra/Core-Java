package com.employee.inheritance;

public class Tester extends Employee {
	String tools[];

	public Tester(int id, String name, String dept, double salary, String tools[]) {
		super(id, name, dept, salary);
		// TODO Auto-generated constructor stub
		System.out.println("Inside Tester constructor");
		this.tools = tools;
	}

	@Override
	protected void work() {
		super.work();
		//super.salary = 3000;
		System.out.println("Tester is testing using ");
		for (int i = 0; i < tools.length; i++) {
			System.out.println(tools[i]);
		}
	}
}
