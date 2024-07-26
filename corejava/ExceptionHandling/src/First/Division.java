package First;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		System.out.println("Enter 2 integer : ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = a / b;
		System.out.println("result: " + c);
		System.out.println("more code can go here");
		// java.lang.ArithmeticException comes
	}

}
