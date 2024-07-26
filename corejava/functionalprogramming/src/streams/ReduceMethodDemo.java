package streams;

import java.util.List;

public class ReduceMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = List.of(12, 9, 20, 13, 4, 6, 2, 4, 12, 15);
		int s = numbers.stream().reduce(0, (x, y) -> (x + y));
		System.out.println(s);
		int k = numbers.stream().reduce(0, (x, y) -> x);
		System.out.println(k);
		int l = numbers.stream().reduce(0, (x, y) -> y);
		System.out.println(l);
		int max = numbers.stream().reduce(0, (x, y) -> x > y ? x : y);
		System.out.println(max);
//if negative values are also there
		int maxInc = numbers.stream().reduce(Integer.MIN_VALUE, (x, y) -> x > y ? x : y);
		System.out.println(maxInc);
		int min = numbers.stream().reduce(Integer.MAX_VALUE, (x, y) -> x < y ? x : y);
		System.out.println(min);
		//you can use jshell in cmd
	}

}
