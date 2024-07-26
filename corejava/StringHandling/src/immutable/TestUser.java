package immutable;

public class TestUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user = new User(1, "name");// mutable
		System.out.println(user);// prints packageName.className@hashcode

		String s = new String("Bharath"); // immutable
		System.out.println(s);

		Integer i = new Integer(30); // immutable
		System.out.println(i);
	}

}
