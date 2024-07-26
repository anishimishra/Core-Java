package collectionsutil;

import java.util.*;

public class CollectionsReverseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(8);
		l.add(50);
		l.add(78);
		System.out.println(l);
		Collections.reverse(l);
		System.out.println("After reversing: ");
		System.out.println(l);
	}

}
