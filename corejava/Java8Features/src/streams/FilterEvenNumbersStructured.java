package streams;

import java.util.ArrayList;
import java.util.List;

public class FilterEvenNumbersStructured {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1 = new ArrayList<>();
		for (int i = 0; i <= 10; i++) {
			l1.add(i);
		}
		System.out.println(l1);
		List<Integer> l2 = new ArrayList<>();
		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 0) {
				l2.add(i);
			}

		}
		System.out.println(l2);
	}

}
