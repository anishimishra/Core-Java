package com.customer.encapsulation;

public class Customer {
	private String firstname;
	private String lastname;
	private String creditCard;

	public String getFirstName() {
		return firstname;
	}

	public void setFirstNam(String firstname) {
		if (firstname == null) {
			System.out.println("invalid first name");
		}
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(String creditCard) {
		this.creditCard = creditCard;
	}
}
