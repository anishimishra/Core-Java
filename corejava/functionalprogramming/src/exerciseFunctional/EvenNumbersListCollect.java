package exerciseFunctional;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EvenNumbersListCollect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		List<Integer> evenNumbers = evenNumbers(numbers);
		System.out.println(evenNumbers);
	}

	private static List<Integer> evenNumbers(List<Integer> numbers) {
		// TODO Auto-generated method stub
		Stream<Integer> s = numbers.stream()
				// .distinct()
				.filter(number -> number % 2 == 0);
		List<Integer> evenNumbers = s.collect(Collectors.toList());
		return evenNumbers;
	}

}
