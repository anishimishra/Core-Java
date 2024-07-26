package regex;

public class StringMobileNumberValidator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "1234567890";
		if (s.matches("^\\d{10}$")) {
			System.out.println("valid cell number");
		} else {
			System.out.println("invalid cell number");
		}
	}
}