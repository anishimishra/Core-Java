package streams;

import java.util.List;
import java.util.stream.Stream;

public class SortedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		numbers.stream().distinct().sorted().forEach(System.out::print);
		System.out.println();
		Stream<Integer> s = numbers.stream().sorted();
		s.forEach(i -> System.out.print(i + " "));
	}

}
