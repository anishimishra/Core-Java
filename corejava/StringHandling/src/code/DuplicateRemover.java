package code;

import java.util.ArrayList;

public class DuplicateRemover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aaabbbcccdddjdndjjdjjdc";
		ArrayList<Character> list = new ArrayList<Character>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (!list.contains(ch)) {
				list.add(ch);
			}
		}
		System.out.println(list);
		String result = "";
		for (Character character : list) {
			result = result + character;
		}
		System.out.println(result);
	}

}
