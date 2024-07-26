package arraysutil;

import java.util.*;

public class MergeArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1[] = { "A", "B", "C", "D" };
		String s2[] = { "E", "F", "G", "H" };
		List<String> l = new ArrayList<String>(Arrays.asList(s1));
		l.addAll(Arrays.asList(s2));
		Object[] array = l.toArray();
		System.out.println(Arrays.toString(array));
		String[] arr = l.toArray(s2);
		System.out.println(arr);
		for (String st : arr) {
			System.out.print(st + " ");
		}
	}

}
