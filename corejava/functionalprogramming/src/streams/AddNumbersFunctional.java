package streams;

import java.util.List;

public class AddNumbersFunctional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		int sum = addListFunctional(numbers);
		System.out.println(sum);
	}

	private static int addListFunctional(List<Integer> numbers) {
		// TODO Auto-generated method stub
		int s = numbers.stream()
				// combine them into one result => one value
				// start with 0 and (a,b) -> a+b;
				// stream of numbers convert into one value we use reduce method
				.reduce(0, AddNumbersFunctional::sum);

		int sl = numbers.stream()
				// using lambda expression
				.reduce(0, (a, b) -> (a + b));
		int si = numbers.stream()
				// using Integer class
				.reduce(0, Integer::sum);
		return si;
	}

	private static int sum(int aggregate, int nextNumber) {
		System.out.println(aggregate + " " + nextNumber);
		return aggregate + nextNumber;
	}
}
