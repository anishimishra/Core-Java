package arraysutil;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 40, 90, 15, 7 };
		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.println();
		Arrays.sort(a);
		System.out.println("After sorting:");
		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.println();
		String s[] = { "V", "A", "Z", "P" };
		Arrays.sort(s);
		// Arrays.sort(s, new MyComparator());
		for (String string : s) {
			System.out.print(string + " ");
		}
		System.out.println();
		int r = Arrays.binarySearch(s, "Z");
		System.out.println(r);
	}

}
