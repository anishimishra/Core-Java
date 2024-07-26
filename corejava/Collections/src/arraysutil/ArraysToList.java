package arraysutil;

import java.util.*;

public class ArraysToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s[] = { "V", "A", "Z", "P" };
		for (String i : s) {
			System.out.print(i + " ");
		}
		System.out.println();
		List<String> l = Arrays.asList(s);
		s[1] = "Y";
		// l.add("O"); // UnsupportedOperationException
		System.out.println(l);

		Integer a[] = { 40, 90, 15, 7 };
		List<Integer> li = Arrays.asList(a);
		System.out.println(li);
//asList() method works with arrays of reference types like Integer[] and with arrays of primitive types like int[]
	}

}
