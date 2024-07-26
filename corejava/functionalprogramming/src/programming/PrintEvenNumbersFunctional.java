package programming;

import java.util.List;

public class PrintEvenNumbersFunctional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printEvenNumbersInListFunctional(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));
	}

	private static boolean isEven(int number) {
		return number % 2 == 0;
	}

	private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
		// TODO Auto-generated method stub
		numbers.stream()
//filter only allow number even numbers
				.filter(PrintEvenNumbersFunctional::isEven).forEach(i -> System.out.print(i + " "));
	}

}
