package iterator;

import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class setIteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random obj = new Random();

		Set<Integer> treeSet = new TreeSet<>();
		for (int i = 1; i <= 5; i++) {
			int number = obj.nextInt(100);
			treeSet.add(number);
			System.out.print(number + "  ");
		}
		System.out.println();
		System.out.println("Treeset elements: " + treeSet);

		Iterator<Integer> itr = treeSet.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
			itr.remove();
		}
		System.out.println();
		System.out.println(treeSet);
	}

}
