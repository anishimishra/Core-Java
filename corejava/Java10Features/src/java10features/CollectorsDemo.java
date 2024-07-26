package java10features;

import java.util.List;
import java.util.stream.Collectors;

public class CollectorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = List.of(15, 20, 17, 30);
		List<Integer> newList = list.stream()
				.filter(x -> x % 3 == 0)
				.collect(Collectors.toUnmodifiableList());
		List<Integer> newList2 = list.stream()
				.filter(x -> x % 3 == 0)
				.collect(Collectors.toList());
		System.out.println(newList);
		newList2.add(40);
		System.out.println(newList2);
	}

}
