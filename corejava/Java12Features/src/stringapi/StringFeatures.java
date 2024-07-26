package stringapi;

public class StringFeatures {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "  all the power is within you";
		System.out.println(s);
		System.out.println(s.indent(10));
		System.out.println(s.indent(-2));

		String t = "10";
		Integer res = t.transform(Integer::parseInt);
		System.out.println(res);
	}

}
