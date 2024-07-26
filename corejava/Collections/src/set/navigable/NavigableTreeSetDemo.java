package set.navigable;

import java.util.*;

public class NavigableTreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> s = new TreeSet<Integer>();
//Random r=new Random();
//for(int i=0;i<=5;i++) {
		// s.add(r.nextInt(60));
//}
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(50);
		System.out.println(s);
		System.out.println(s.ceiling(20));
		System.out.println(s.higher(40));
		System.out.println(s.floor(20));
		System.out.println(s.lower(40));
		System.out.println(s.pollFirst());
		System.out.println(s.pollLast());
		System.out.println(s.descendingSet());
		System.out.println(s);
	}

}
