package objecttry;

public class EqualsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User u1 = new User();
		u1.setId(1);
		u1.setName("an");
		User u2 = new User();
		u2.setId(1);
		u2.setName("an");
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));

		String s1 = new String("an");
		String s2 = new String("an");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));

		Integer i1 = new Integer(123);
		Integer i2 = new Integer(123);
		System.out.println(i1 == i2);
		System.out.println(i1.equals(i2));
	}

}
