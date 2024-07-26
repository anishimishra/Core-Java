package streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CreatingStreamDynamically {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(IntStream.range(1, 10));
		System.out.println(IntStream.range(1, 10).sum());
		System.out.println(IntStream.rangeClosed(1, 10).sum());
		System.out.println(IntStream.iterate(1, e -> e + 2)
				.limit(10).sum());
		System.out.println(IntStream.iterate(1, e -> e + 2)
				.limit(10)
				.peek(k -> System.out.print(k + " ")).sum());
		System.out.println(IntStream.iterate(2, i -> i + 2)
				.limit(10)
				.peek(i -> System.out.print(i + " ")).sum());
		System.out.println(IntStream.iterate(2, i -> i * 2)
				.limit(10)
				.peek(i -> System.out.print(i + " ")).sum());
		List<Integer> a = IntStream.iterate(2, i -> i * 2)
				.limit(10)
				.boxed()
				.collect(Collectors.toList());
		System.out.println(a);
	}

}
