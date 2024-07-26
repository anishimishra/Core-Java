package immutable;

public class ImmutableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello";
		String s2 = "World";
		System.out.println("Before concat : " + "\ns1: " + s1);
		System.out.println("s2: " + s2);
		s1.concat(s2);
		System.out.println("After concat : " + "\ns1: " + s1);
		System.out.println("s2: " + s2);
		s1 = s1.concat(s2);
		System.out.println("After concat and assignment to s1 : " + "\ns1: " + s1);
		System.out.println("s2: " + s2);
	}

}
