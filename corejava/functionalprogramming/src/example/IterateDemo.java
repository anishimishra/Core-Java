package example;

import java.util.stream.Stream;

public class IterateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream.iterate(1, ele -> ele + 1)
		.filter(ele -> ele % 5 == 0)
		.limit(5)
		.forEach(System.out::println);
	}

}
