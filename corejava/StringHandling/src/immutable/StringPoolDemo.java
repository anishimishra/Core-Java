package immutable;

public class StringPoolDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user1 = new User(1, "abc");
		User user2 = new User(2, "abc");
		System.out.println(user1);
		System.out.println(user2);
		
		String s1 = "abc";
		String s2 = "abc";
		String s3 = "abc";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());

		s2 = "cde";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
	}

}
