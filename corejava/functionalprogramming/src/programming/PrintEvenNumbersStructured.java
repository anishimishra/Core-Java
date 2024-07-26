package programming;

import java.util.List;

public class PrintEvenNumbersStructured {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printEvenNumbersInListStructured(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));
	}

	private static void printEvenNumbersInListStructured(List<Integer> numbers) {
		// TODO Auto-generated method stub
		for (Integer number : numbers) {
			if (number % 2 == 0) {
				System.out.println(number);
			}
		}
	}

}
