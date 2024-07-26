package functionalinterfaces;

import java.util.List;
import java.util.function.Predicate;

public class BehaviourParameterization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

		filterAndPrint(numbers, x -> x % 2 == 0);
		System.out.println();
		filterAndPrint(numbers, x -> x % 2 != 0);
		System.out.println();
		filterAndPrint(numbers, x -> x % 3 == 0);
	}

	private static void filterAndPrint(List<Integer> numbers, Predicate<? super Integer> predicate) {
		numbers.stream()
		.filter(predicate)
		.forEach(i -> System.out.print(i + "  "));
	}

}
