package code;

import java.util.Scanner;

public class TemperatureConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double f, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose the conversion type \n 1. Fahrenheit to Celsius \n 2. Celsius to Fahrenheit");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("enter f temp");
			f = sc.nextDouble();
			c = (f - 32) * 5 / 9;
			System.out.println(c);
			break;
		case 2:
			System.out.println("enter c temp");
			c = sc.nextDouble();
			f = ((c * 9) / 5) + 32;
			System.out.println(f);
			break;
		default:
			System.out.println("invalid choice");
		}
	}

}
