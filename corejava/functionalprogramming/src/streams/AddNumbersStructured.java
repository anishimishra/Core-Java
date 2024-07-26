package streams;

import java.util.List;

public class AddNumbersStructured {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		int sum = addListStructured(numbers);
		System.out.println(sum);
	}

	private static int addListStructured(List<Integer> numbers) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (Integer num : numbers) {
			sum = sum + num;
		}
		return sum;
	}

}
