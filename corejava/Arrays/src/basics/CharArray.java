package basics;

public class CharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c[] = { 'a', 'z', 'q', 'p', 'o', 'a' };
		if (c[0] == c[c.length - 1]) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

}
