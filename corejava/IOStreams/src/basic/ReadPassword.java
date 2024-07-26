package basic;

import java.io.Console;

public class ReadPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Console c = System.console();
		System.out.println("Enter password: ");
		char ch[] = c.readPassword();
		String password = String.valueOf(ch);
		System.out.println("Password is: " + password);
	}

}
