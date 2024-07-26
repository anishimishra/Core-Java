package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumberValidator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern pattern = Pattern.compile("^\\d{10}$");
		Matcher matcher = pattern.matcher("1234567890");
		if (matcher.matches()) {
			System.out.println("valid cell number");
		} else {
			System.out.println("invalid cell number");
		}
	}
}