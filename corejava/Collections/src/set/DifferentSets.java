package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class DifferentSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random obj = new Random();
		HashSet<Integer> set = new HashSet<>();
		for (int i = 1; i <= 5; i++) {
			int number = obj.nextInt(100);
			set.add(number);
			System.out.print(number + "  ");
		}
		System.out.println();
		System.out.println("Hashset elements: " + set);

		LinkedHashSet<Integer> linkedSet = new LinkedHashSet<>();
		for (int i = 1; i <= 5; i++) {
			int number = obj.nextInt(100);
			linkedSet.add(number);
			System.out.print(number + "  ");
		}
		System.out.println();
		System.out.println("LinkedHashset elements: " + linkedSet);

		Set<Integer> treeSet = new TreeSet<>();
		for (int i = 1; i <= 5; i++) {
			int number = obj.nextInt(100);
			treeSet.add(number);
			System.out.print(number + "  ");
		}
		System.out.println();
		System.out.println("Treeset elements: " + treeSet);
	}

}
