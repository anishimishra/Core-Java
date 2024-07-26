package list;

import java.util.*;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object objects[] = new Object[10000000];
		for (int i = 0; i < objects.length; i++) {
			objects[i] = new Object();
		}
		LinkedList<Object> Lilist = new LinkedList<>();
		long start = System.currentTimeMillis();
		for (Object object : objects) {
			Lilist.add(object);
		}
		long end = System.currentTimeMillis();
		System.out.println("Time Taken: " + (end - start) + " ms");

		ArrayList<Object> Arlist = new ArrayList<>();
		long startar = System.currentTimeMillis();
		for (Object object : objects) {
			Arlist.add(object);
		}
		long endar = System.currentTimeMillis();
		System.out.println("Time Taken: " + (endar - startar) + " ms");

		List<Object> Alist = new ArrayList<Object>();
		long starta = System.currentTimeMillis();
		for (Object object : objects) {
			Alist.add(object);
		}
		long enda = System.currentTimeMillis();
		System.out.println("Time Taken: " + (enda - starta) + " ms");
	}

}
