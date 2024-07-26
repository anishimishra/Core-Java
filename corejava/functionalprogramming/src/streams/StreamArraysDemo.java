package streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Stream.of(12, 9, 13, 4, 6, 2, 4, 12, 15).count());
		System.out.println(Stream.of(12, 9, 13, 4, 6, 2, 4, 12, 15).reduce(0, Integer::sum));
		System.out.println(Stream.of(12, 9, 13, 4, 6, 2, 4, 12, 15));
		int[] numberArray = { 12, 9, 13, 4, 6, 2, 4, 12, 15 };
		System.out.println(numberArray);
		System.out.println(Arrays.stream(numberArray));
		System.out.println(Arrays.stream(numberArray).sum());
		System.out.println(Arrays.stream(numberArray).average());
		System.out.println(Arrays.stream(numberArray).min());
		System.out.println(Arrays.stream(numberArray).max());
	}

}
