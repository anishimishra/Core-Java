package functionalinterfaces;

import java.util.List;
import java.util.function.BinaryOperator;

public class sumNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

//lambda expression also does not have a name
		BinaryOperator<Integer> sumAccumulator = Integer::sum;
		BinaryOperator<Integer> sumAccumulator3 = (x, y) -> x + y;
//anonymous class
		BinaryOperator<Integer> sumAccumulator2 = new BinaryOperator<Integer>() {

			@Override
			public Integer apply(Integer t, Integer u) {
				// TODO Auto-generated method stub
				return t + u;
			}

		};

		int n = numbers.stream().reduce(0, sumAccumulator2);
		System.out.println(n);
	}

}
