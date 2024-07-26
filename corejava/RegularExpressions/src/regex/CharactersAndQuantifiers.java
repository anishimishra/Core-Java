package regex;

import java.util.regex.Pattern;

public class CharactersAndQuantifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Pattern.matches("[abc]", "a"));
		System.out.println(Pattern.matches("[abc]", "d"));
		System.out.println(Pattern.matches("[abc]?", "abc"));
		System.out.println(Pattern.matches("[abc]", "abc"));
		System.out.println(Pattern.matches("[abc]+", "ababc"));
		System.out.println(Pattern.matches("[abc]*", "dddd"));

		System.out.println(Pattern.matches("\\d", "1"));
		System.out.println(Pattern.matches("\\D", "a"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]{5}", "test9"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]{2,5}", "te9"));
		
	}

}
