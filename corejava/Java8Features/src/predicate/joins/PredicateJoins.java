package predicate.joins;

import java.util.function.Predicate;

public class PredicateJoins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 0, 5, 10, 20, 30, 40, 50, 60, 70, 73 };
		Predicate<Integer> p1 = i -> i > 10;
		Predicate<Integer> p2 = i -> i % 2 == 0;
		System.out.println("Greater than 10: ");
		PredicateJoins.method1(p1, arr);
		System.out.println("Even Numbers: ");
		PredicateJoins.method1(p2, arr);
		System.out.println("Not Greater than 10: ");
		PredicateJoins.method1(p1.negate(), arr);
		System.out.println("Greater than 10 and even: ");
		PredicateJoins.method1(p1.and(p2), arr);
		System.out.println("Greater than 10 or even: ");
		PredicateJoins.method1(p1.or(p2), arr);
	}

	static void method1(Predicate<Integer> p, int[] x) {
		for (int i : x) {
			if (p.test(i)) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}

}
