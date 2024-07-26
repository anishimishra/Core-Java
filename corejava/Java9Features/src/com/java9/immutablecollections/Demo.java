package com.java9.immutablecollections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = List.of("abc", "xyz", "123");
		// list.add("nyc"); - gives error java.lang.UnsupportedOperationException
		for (String string : list) {
			System.out.print(string + " ");
		}
		System.out.println();
		Set<String> set = Set.of("abc", "xyz");
		for (String string : set) {
			System.out.print(string + " ");
		}
		System.out.println();
		Map<Integer, String> map = Map.of(101, "abc", 102, "xyz");
		for (Map.Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		System.out.println();
		Map<Integer, String> map1 = Map.ofEntries(Map.entry(101, "abc"), Map.entry(102, "xyz"));
		for (Map.Entry<Integer, String> m : map1.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

}
