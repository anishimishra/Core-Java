package list;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add(10);
		list.add(new Integer(20));
		list.add(30.45);
		list.add("Hello");

		for (Object object : list) {
			System.out.println(object);
		}
		System.out.println(list.size());
	}

}
