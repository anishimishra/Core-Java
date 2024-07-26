package objectmethods;

public class TestPassenger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Passenger passenger = new Passenger();
		passenger.setFirstName("Anishi");
		passenger.setLastName("Mishra");
		passenger.setId(6);
		System.out.println(passenger);
		System.out.println(passenger.hashCode());

		Passenger passenger2 = new Passenger();
		passenger2.setFirstName("Anishi");
		passenger2.setLastName("Misra");
		passenger2.setId(6);
		System.out.println(passenger2);
		System.out.println(passenger2.hashCode());

		System.out.println(passenger.equals(passenger2));
	}

}
