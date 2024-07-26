package regex;

public class StringEmailValidator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String email = "anishi@anishi.com";

		if (email.matches("^[a-zA-Z0-9_.-]+@[a-zA-Z0-9_.-]+$")) {
			System.out.println("valid email id");
		} else {
			System.out.println("invalid email id");
		}
	}
}