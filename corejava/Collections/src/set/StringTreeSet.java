package set;

import java.util.*;

public class StringTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new TreeSet<>();
		set.add("abc");
		set.add("xyz");
		set.add("def");
		set.add("mno");
		for (String obj : set) {
			System.out.println(obj);
		}
	}

}
