package stringjoiner;

import java.util.StringJoiner;

public class StringJoinerDemo2 {
	public static void main(String[] args) {
		StringJoiner join = new StringJoiner(", ", "[", "]");
		join.add("Rahul");
		join.add("Raju");
		join.add("Peter");
		join.add("Raheem");
		System.out.println(join);
	}
}
