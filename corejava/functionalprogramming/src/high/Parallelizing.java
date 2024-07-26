package high;

import java.util.stream.LongStream;

public class Parallelizing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long time = System.currentTimeMillis();

//System.out.println(LongStream.range(0,1000000000).sum());
		System.out.println(LongStream.range(0, 1000000000).parallel().sum());
		System.out.println(System.currentTimeMillis() - time);
	}

}
