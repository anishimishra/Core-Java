package scanner;

import java.util.Scanner;

public class sumCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("Enter numbers to calculate sum");
		while (sc.hasNextInt()) { // if you enter string then it come out of the loop
			int num = sc.nextInt();
			sum += num;
		}
		System.out.println("Sum is " + sum);
	}

}
