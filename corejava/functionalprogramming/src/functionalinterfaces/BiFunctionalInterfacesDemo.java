package functionalinterfaces;

import java.util.function.*;

public class BiFunctionalInterfacesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiPredicate<Integer, Integer> bipred = (x, y) -> x > y;
		System.out.println("4 > 5 ? " + bipred.test(4, 5));
		System.out.println("5 > 4 ? " + bipred.test(5, 4));

		BiPredicate<Integer, String> biPredicate = (x, y) -> {
			return x < 10 && y.length() > 5;
		};
		System.out.println(biPredicate.test(15, "hello"));

		BiFunction<Integer, Integer, Integer> bifunc = (x, y) -> x * y;
		System.out.println("4 * 5 = " + bifunc.apply(4, 5));

		BiFunction<Integer, String, String> biFunction = (x, y) -> {
			return x + " " + y;
		};
		System.out.println(biFunction.apply(15, "hello"));

		BiConsumer<Integer, String> bicon = (x, y) -> {
			System.out.println(x);
			System.out.println(y);
		};
		bicon.accept(3, "hello");

		BiConsumer<String, String> biConsumer = (x, y) -> {
			System.out.println(x);
			System.out.println(y);
		};
		biConsumer.accept("bye", "bye");
	}

}
