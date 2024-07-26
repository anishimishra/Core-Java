package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern pattern = Pattern.compile("^[a-zA-Z0-9_.-]+@[a-zA-Z0-9_.-]+$");
		Matcher matcher = pattern.matcher("anishi@anishi.com");
		if (matcher.matches()) {
			System.out.println("valid email id");
		} else {
			System.out.println("invalid email id");
		}
	}
}