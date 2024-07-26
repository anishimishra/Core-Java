package maps;

import java.util.*;

public class WeakHashMapDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Map<User, String> map = new WeakHashMap<>();
		User u = new User();
		map.put(u, "Tom");
		System.out.println(map);
		u = null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(map);
	}

}
