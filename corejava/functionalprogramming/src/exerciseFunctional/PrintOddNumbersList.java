package exerciseFunctional;

import java.util.List;

public class PrintOddNumbersList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printOddNumbersInList(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15, 5));
	}

	private static boolean isOdd(int number) {
		return number % 2 != 0;
	}

	private static void printOddNumbersInList(List<Integer> numbers) {
		// TODO Auto-generated method stub
		numbers.stream().filter(number -> number % 2 != 0).forEach(System.out::println);

		numbers.stream().filter(PrintOddNumbersList::isOdd).forEach(i -> System.out.print(i + " "));
	}

}
