package list;

import java.util.*;

public class ListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();// runtime polymorphism
//good practice to use List on the left hand side
		for (int i = 10; i <= 100; i += 10) {
			list.add(i);
		}
		System.out.println("List: " + list);

		list.add(2, 100);
		System.out.println("List after insert: " + list);
		list.set(3, 200);
		System.out.println("List after replacement: " + list);

		List<Integer> secondList = new ArrayList<>();
		secondList.add(111);
		secondList.add(222);
		secondList.add(333);
		System.out.println("second list: " + secondList);

		list.addAll(4, secondList);
		System.out.println("List after adding second List: " + list);

		if (list.contains(222)) {
			System.out.println("List has the value");
		} else {
			System.out.println("List does not has the value");
		}
		System.out.println("Elements in the list are: ");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + "  ");
		}
		System.out.println();
		list.remove(3);
		System.out.println("List after deletion: " + list);
	}

}
