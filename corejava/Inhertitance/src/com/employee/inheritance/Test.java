package com.employee.inheritance;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String projects[] = new String[] { "Flight Reservation", "Check in" };
		Manager manager = new Manager(1, "John", "Travel", 10000, projects, 2000);
		System.out.println(manager.id);
		System.out.println(manager.name);
		System.out.println(manager.dept);
		System.out.println(manager.salary);
		manager.work();

		Developer dev = new Developer(2, "Anishi", "Travel", 2000, "full stack");
		dev.work();

		Tester tes = new Tester(3, "de", "Travel", 1000, new String[] { "Selenium", "Muckito" });
		System.out.println(tes.salary);
		tes.work();
	}

}
