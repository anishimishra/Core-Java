package comparison;

public class ObjectComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user1 = new User(1, "abc");
		User user2 = new User(1, "abc");
		System.out.println(user1);
		System.out.println(user2);
		System.out.println(user1 == user2);
		System.out.println(user1.equals(user2));// default implementation will only check for memory location
		// to compare the contents of the object override the equals method
	}

}
