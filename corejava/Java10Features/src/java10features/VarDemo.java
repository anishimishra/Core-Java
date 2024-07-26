package java10features;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class VarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var x = 10;
		// Map<String, List<String>> map = new HashMap<String, List<String>>();
		var map = new HashMap<String, List<String>>();
		/*
		 * for(Map.Entry<String, List<String>> entry:map.entrySet()) {
		 * 
		 * }
		 */
		for (var entry : map.entrySet()) {
			// List<String> value = entry.getValue();
			var value = entry.getValue();
		}
		Consumer<Integer> k = i -> {
			var g = 10;
			System.out.println(i);
		};
		// below behaves like generics
		var list = new ArrayList<>();
		list.add(123);
		list.add("xyz");
	}

}
