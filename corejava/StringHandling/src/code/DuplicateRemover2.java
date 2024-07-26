package code;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateRemover2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aaabbbcccdddjdndjjdjjdc";
		Set<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			set.add(ch);
		}
		System.out.println(set);
		String result = "";
		for (Character character : set) {
			result = result + character;
		}
		System.out.println(result);
	}

}
