package exerciseFunctional;

import java.util.List;

public class SumOddNumbersList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = List.of(12, 9, 20, 13, 4, 6, 2, 4, 12, 15);
		int sum = numbers.stream()
//take odd numbers
				.filter(number -> number % 2 != 0)
//sum
				.reduce(0, (a, b) -> (a + b));
		System.out.println(sum);
	}

}
