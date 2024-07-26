package set;

import java.util.Set;
import java.util.TreeSet;
import comparator.StringComparatorByLength;

public class SortStringsByLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new TreeSet<>(new StringComparatorByLength());
		set.add("abcxyz");
		set.add("xyzabcde");
		set.add("defzzzzzzzzzzz");
		set.add("mno");
		for (String obj : set) {
			System.out.println(obj);
		}
	}

}
