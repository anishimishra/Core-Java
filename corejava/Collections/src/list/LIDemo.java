package list;

import java.util.*;

public class LIDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new LinkedList<>();
		list.add("abc");
		list.add("def");
		list.add("xyz");
		ListIterator<String> itr = list.listIterator();
		System.out.println("Iterating in forward direction: ");
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		System.out.println();
		System.out.println("Iterating in backward direction: ");
		while (itr.hasPrevious()) {
			System.out.print(itr.previous() + " ");
		}
	}

}
