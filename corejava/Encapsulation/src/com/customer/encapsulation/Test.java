package com.customer.encapsulation;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c = new Customer();
		c.setFirstNam("hi");
		c.setLastname("bye");
		c.setCreditCard("2342");

		System.out.println(c.getFirstName());
		System.out.println(c.getLastname());
		System.out.println(c.getCreditCard());
	}

}
