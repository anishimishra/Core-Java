package predicate;

import java.util.function.Predicate;

public class LengthOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<String> p = s -> s.length() > 5;
		System.out.println(p.test("xyz"));
		System.out.println(p.test("bharath"));
	}

}
