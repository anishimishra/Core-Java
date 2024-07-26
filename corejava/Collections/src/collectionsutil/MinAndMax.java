package collectionsutil;

import java.util.*;

public class MinAndMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[] = { 10, 300, -50, 7, 11, 30 };
		Integer min = Collections.min(Arrays.asList(a));
		Integer max = Collections.max(Arrays.asList(a));
		System.out.println(min);
		System.out.println(max);
	}

}
