package streams;

import java.util.List;
import java.util.stream.Stream;

public class DistinctDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		Stream<Integer> s = numbers.stream().distinct();
		s.forEach(i -> System.out.print(i + " "));
	}

}
