package optional;

public class NotOptionalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[] = new String[10];
		String lower = str[5].toLowerCase();
		if (lower.isEmpty()) {
			System.out.println("not present");
		} else {
			System.out.println(lower);
		}
	}

}
