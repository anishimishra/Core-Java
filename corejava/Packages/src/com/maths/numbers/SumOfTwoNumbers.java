package com.maths.numbers;

import java.util.Scanner;

public class SumOfTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter 2 integer : ");
		Scanner sc = new Scanner(System.in);
		int num1 = Integer.parseInt(sc.next());
		int num2 = sc.nextInt();
		int result = num1 + num2;
		System.out.println("Sum is: " + result);
	}

}
