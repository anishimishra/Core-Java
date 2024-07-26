package code;

public class CharReversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "java is awesome!!";
		String k = "";
		String res = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == ' ') {
				res = res + k + " ";
				k = "";
			} else {
				k = ch + k;
			}
		}
		res = res + k;
		System.out.println(res);
	}

}
