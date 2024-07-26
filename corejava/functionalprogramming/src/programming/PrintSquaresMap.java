package programming;

import java.util.List;

public class PrintSquaresMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printSquaresOfEvenNumbersInListFunctional(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));
	}

	private static void printSquaresOfEvenNumbersInListFunctional(List<Integer> numbers) {
		// TODO Auto-generated method stub
		numbers.stream().filter(number -> number % 2 == 0)
//mapping - x-> x*x
				.map(number -> number * number).forEach(i -> System.out.print(i + " "));
	}

}
