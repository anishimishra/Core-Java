package First;

import java.util.Scanner;

public class DivisionExceptionHandled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter 2 integer : ");
			a = sc.nextInt();
			b = sc.nextInt();
			c = a / b;
			System.out.println("result: " + c);
		} /*catch (ArithmeticException e) {
			System.out.println("Please do not enter 0");
		}*/ finally {
			System.out.println("Finally");
		} // finally can be written without catch and will be always
			// executed even if code errors out
		System.out.println("more code can go here");
	}
}
