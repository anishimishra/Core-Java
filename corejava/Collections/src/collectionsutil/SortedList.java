package collectionsutil;

import java.util.*;

public class SortedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l = new ArrayList<>();
		l.add("Z");
		l.add("A");
		l.add("X");
		l.add("B");
		System.out.println(l);
		Collections.sort(l);
		System.out.println("After sorting in natural order: ");
		System.out.println(l);
		// System.out.println("Sort using MyComparator class");
		// Collections.sort(l, new MyComparator());
		// System.out.println(l);

		int C = Collections.binarySearch(l, "C");
		System.out.println(C);
		int X = Collections.binarySearch(l, "X");
		System.out.println(X);
	}

}
