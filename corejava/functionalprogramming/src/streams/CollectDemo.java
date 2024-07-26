package streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		List<Integer> doubledNumbers = doubleList(numbers);
		System.out.println(doubledNumbers);
	}

	private static List<Integer> doubleList(List<Integer> numbers) {
		// TODO Auto-generated method stub
		Stream<Integer> s = numbers.stream().map(number -> number * number);
		List<Integer> list = s.collect(Collectors.toList());
		return list;
	}

}
