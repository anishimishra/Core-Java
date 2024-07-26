package comparison;

public class StringComparison {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abc";
		String s2 = "xyz";
		String s3 = "abc";
		String s4 = new String("abc");// JVM uses a new memory location does not get stored in the string pool
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());

		System.out.println(s1 == s3);// pointing to the same memory location; compares the memory location
		System.out.println(s1.equals(s3)); // compares the contents of the string

		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));// overrides the equals method to compare the content of the strings

		System.out.println(s1 == s4);
		System.out.println(s1.equals(s4));
	}
}
