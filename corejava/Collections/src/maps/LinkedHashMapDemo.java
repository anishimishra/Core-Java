package maps;

import java.util.*;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new LinkedHashMap<>();
		map.put("John", 70);
		map.put("Tom", 89);
		map.put("Lee", 67);
		map.put("Brad", 80);
		Set<String> keySet = map.keySet();
		System.out.println("Keys: " + keySet);
		Collection<Integer> values = map.values();
		System.out.println("Values: " + values);

		for (String key : keySet) {
			System.out.println("Key: " + key + ", Value: " + map.get(key));
		}
	}

}
