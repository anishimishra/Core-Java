package programming;

import java.util.List;
import java.util.stream.Stream;

public class PrintNumbersFunctional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printAllNumbersInListFunctional(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));
	}

	private static void print(int number) {
		System.out.println(number);
	}

	private static void printY(int number) {
		System.out.print(number + " ");
	}

	private static void printAllNumbersInListFunctional(List<Integer> numbers) {
		// convert it to stream of numbers
		numbers.stream().forEach(PrintNumbersFunctional::print);// method reference
		Stream<Integer> s = numbers.stream();
		System.out.print(s);
		System.out.println();
		s.forEach(i -> System.out.print(i + " "));
		System.out.println();
		Stream<Integer> t = numbers.stream();
		t.forEach(System.out::print);
		System.out.println();
		Stream<Integer> k = numbers.stream();
		k.forEach(PrintNumbersFunctional::printY);
	}

}
