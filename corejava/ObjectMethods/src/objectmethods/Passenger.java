package objectmethods;

public class Passenger {
	private int id;
	private String firstName;
	private String lastName;

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Passenger Information is First Name: " + this.getFirstName() + " Last Name: " + this.getLastName();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return id + firstName.length() + lastName.length();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Passenger passenger = (Passenger) obj;
		if (passenger.getId() == this.id && passenger.getFirstName() == this.firstName
				&& passenger.getLastName() == this.lastName) {
			return true;
		} else {
			return false;
		}

	}
}
