package First;

public class StringConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "xyz";
		String s2 = "abc";

		System.out.println(s1 + s2);
		int a = 10, b = 20, c = 30;
		System.out.println(a + b + c);
		System.out.println(s1 + a + b + c);
		// expression is evaluated left to right
		System.out.println(a + b + c + s1);
		int d = 40;
		System.out.println(a + b + s1 + c + d);
	}

}
