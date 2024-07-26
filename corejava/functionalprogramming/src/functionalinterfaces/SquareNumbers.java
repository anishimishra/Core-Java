package functionalinterfaces;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class SquareNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

//Predicate (boolean-valued function) of one argument
		Predicate<Integer> isEvenPredicate = x -> x % 2 == 0;
		Predicate<Integer> isEvenPredicate2 = new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {
				// TODO Auto-generated method stub
				return t % 2 == 0;
			}

		};

//Function accepts one argument and produces a result
		Function<Integer, Integer> squareFunction = x -> x * x;
		Function<Integer, Integer> squareFunction2 = new Function<Integer, Integer>() {

			@Override
			public Integer apply(Integer t) {
				// TODO Auto-generated method stub
				return t * t;
			}

		};

//Consumer accepts a single input argument and returns no result
		Consumer<Integer> sysoutConsumer = System.out::println;
		Consumer<Integer> sysoutConsumer2 = new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				// TODO Auto-generated method stub
				System.out.println(t);
			}

		};
		numbers.stream().filter(isEvenPredicate2).map(squareFunction2).forEach(sysoutConsumer2);
	}
	/*
	 * boolean isEven(int x) { return x%2==0; }
	 * 
	 * int squared(int x){ return x*x; }
	 */
}
