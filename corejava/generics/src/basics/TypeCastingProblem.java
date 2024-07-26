package basics;

import java.util.*;

public class TypeCastingProblem {

	public static void main(String[] args) {
		// TODO o-generated method stub
		String s[] = new String[10];
		s[0] = "John";
		s[1] = "Rob";

		List l = new ArrayList();
		l.add("John");
		l.add("Rob");
		l.add(123);
		String name = (String) l.get(0);
		String name1 = (String) l.get(1);
		String name2 = (String) l.get(2);
	}

}
