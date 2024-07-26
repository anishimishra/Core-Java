package functionalinterfaces;

import java.util.List;
import java.util.function.*;

public class Demo {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

		Predicate<Integer> isEvenPredicate = (x) -> x % 2 == 0;

		Function<Integer, Integer> squareFunction = x -> x * x;
		Function<Integer, String> stringOutputFunction = x -> x + " ";

		Consumer<Integer> sysoutConsumer = x -> System.out.println(x);

		BinaryOperator<Integer> sumBinaryOperator = (Integer x, Integer y) -> x + y;
	}

}
