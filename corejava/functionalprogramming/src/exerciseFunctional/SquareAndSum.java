package exerciseFunctional;

import java.util.List;

public class SquareAndSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		squareAndSumNumbers(numbers);
		cubeAndSumNumbers(numbers);
	}

	private static void cubeAndSumNumbers(List<Integer> numbers) {
		// TODO Auto-generated method stub
		int s = numbers.stream()
				// cube
				.map(number -> number * number * number)
				// sum
				.reduce(0, Integer::sum);
		System.out.println(s);
	}

	private static void squareAndSumNumbers(List<Integer> numbers) {
		// TODO Auto-generated method stub
		int s = numbers.stream()
				// square
				.map(number -> number * number)
				// sum
				.reduce(0, Integer::sum);
		System.out.println(s);
	}

}
