package predicate;

import java.util.function.Predicate;

public class GreaterThanTwenty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> p = i -> (i > 20);
		System.out.println(p.test(15));
		System.out.println(p.test(25));
		System.out.println(p.test(30));
	}

}
