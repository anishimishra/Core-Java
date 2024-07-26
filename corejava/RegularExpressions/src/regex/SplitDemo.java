package regex;

import java.util.regex.Pattern;

public class SplitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern pattern = Pattern.compile("\\s");
		String[] words = pattern.split("how are you");
		for (String word : words) {
			System.out.println(word);
		}

		// Pattern pattern2 = Pattern.compile("\\.");
		Pattern pattern2 = Pattern.compile("[.]");
		String[] words2 = pattern2.split("www.cndidjcn.com");
		for (String word : words2) {
			System.out.println(word);
		}

		String s = "www.cdvfvgfv.com";
		String[] split = s.split("[.]");
		for (String w : split) {
			System.out.println(w);
		}
	}

}
