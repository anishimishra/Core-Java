package exerciseFunctional;

import java.util.List;

public class PrintCubesMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printCubesOfOddNumbersInListFunctional(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));
	}

	private static void printCubesOfOddNumbersInListFunctional(List<Integer> numbers) {
		// TODO Auto-generated method stub
		numbers.stream()
//filter the condition
				.filter(number -> number % 2 != 0)
//map for cube
				.map(number -> number * number * number)
//print
				.forEach(i -> System.out.print(i + " "));
	}

}
