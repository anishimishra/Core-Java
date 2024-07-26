package functionalinterfaces;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class BehaviourParameterizationSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

		List<Integer> squaredNumbers = operationAndPrint(numbers, x -> x * x);

		List<Integer> cubedNumbers = operationAndPrint(numbers, x -> x * x * x);
		
		List<Integer> doubledNumbers = operationAndPrint(numbers, x -> x + x);

		System.out.println(squaredNumbers);
		System.out.println(cubedNumbers);
		System.out.println(doubledNumbers);
	}

	private static List<Integer> operationAndPrint(List<Integer> numbers,
			Function<? super Integer, ? extends Integer> mappingFunction) {
		List<Integer> squaredNumbers = numbers.stream()
				.map(mappingFunction)
				.collect(Collectors.toList());
		return squaredNumbers;
	}

}
