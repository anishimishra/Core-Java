package classloading;

public class MultipleObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User u1 = new User();
		Class c1 = u1.getClass();
		User u2 = new User();
		Class c2 = u2.getClass();

		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1 == c2);

		System.out.println(c1.getClassLoader());
		System.out.println(String.class.getClassLoader());//loaded by the bootstrap class loader
		
	}

}
