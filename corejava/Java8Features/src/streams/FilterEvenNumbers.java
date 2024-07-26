package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1 = new ArrayList<>();
		for (int i = 0; i <= 10; i++) {
			l1.add(i);
		}
		System.out.println(l1);
		List<Integer> l2 = l1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(l2);
		System.out.println(l1.stream().filter(i -> i % 2 == 0).count());
		List<Integer> l3 = l1.stream().filter(i -> i % 2 == 0).sorted().collect(Collectors.toList());
		System.out.println(l3);
		Comparator<Integer> comp = (i1, i2) -> i2.compareTo(i1);
		Comparator<Integer> comp2 = (i1, i2) -> i1.compareTo(i2);
		List<Integer> l4 = l1.stream().filter(i -> i % 2 == 0).sorted(comp).collect(Collectors.toList());
		System.out.println(l4);
		Integer max = l1.stream().max(comp2).get();
		System.out.println(max);
		Integer min = l1.stream().min(comp2).get();
		System.out.println(min);
		l1.stream().forEach(i -> System.out.print(i + "  "));
	}

}
