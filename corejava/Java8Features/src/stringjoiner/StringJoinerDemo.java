package stringjoiner;

import java.util.StringJoiner;

public class StringJoinerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringJoiner join = new StringJoiner(", ");
		join.setEmptyValue("It is empty");
		System.out.println(join);
		join.add("Rahul");
		join.add("Raju");
		join.add("Peter");
		join.add("Raheem");
		System.out.println(join);
		int length = join.length();
		System.out.println(length);
		String str = join.toString();
		System.out.println(str);
		char ch = str.charAt(3);
		System.out.println(ch);
		join.add("Saurabh");
		System.out.println(join);
		int newLength = join.length();
		System.out.println("New Length: " + newLength);
	}

}
