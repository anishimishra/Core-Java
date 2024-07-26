package set;

import java.util.*;

import comparator.SBComparator;

public class StringBufferTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Set<StringBuffer> set = new TreeSet<>(new SBComparator());
		Set<StringBuffer> set = new TreeSet<>();
		set.add(new StringBuffer("abc"));
		set.add(new StringBuffer("xyz"));
		set.add(new StringBuffer("def"));
		set.add(new StringBuffer("mno"));
		for (StringBuffer obj : set) {
			System.out.println(obj);
		}
	}

}
