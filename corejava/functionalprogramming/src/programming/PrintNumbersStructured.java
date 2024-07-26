package programming;

import java.util.List;

public class PrintNumbersStructured {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printAllNumbersInListStructured(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));
	}

	private static void printAllNumbersInListStructured(List<Integer> numbers) {
		// TODO Auto-generated method stub
		for (Integer number : numbers) {
			System.out.println(number);
		}
	}

}
