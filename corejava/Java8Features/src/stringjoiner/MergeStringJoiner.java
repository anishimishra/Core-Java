package stringjoiner;

import java.util.StringJoiner;

public class MergeStringJoiner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringJoiner join = new StringJoiner(", ", "[", "]");
		join.add("Rahul");
		join.add("Raju");
		StringJoiner join2 = new StringJoiner(", ", "[", "]");

		join2.add("Peter");
		join2.add("Raheem");
		StringJoiner merge = join.merge(join2);
		System.out.println(merge);
	}

}
