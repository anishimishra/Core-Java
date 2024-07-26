package streams;

import java.math.BigInteger;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class BigIntegerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(IntStream.rangeClosed(1, 50)
				.reduce(1, (x, y) -> x * y));
		System.out.println(LongStream.rangeClosed(1, 25)
				.reduce(1L, (x, y) -> x * y));
		System.out.println(LongStream.rangeClosed(1, 50)
				.mapToObj(BigInteger::valueOf)
				.reduce(BigInteger.ONE, BigInteger::multiply));
	}

}
