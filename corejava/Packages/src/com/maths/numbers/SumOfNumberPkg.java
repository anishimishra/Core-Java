package com.maths.numbers;

import java.util.Scanner;
import static java.lang.Integer.*;
import static java.lang.System.out;
import static java.lang.Math.*;

public class SumOfNumberPkg {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		out.println("Enter 2 integer : ");
		Scanner sc = new Scanner(System.in);
		int num1 = parseInt(sc.next());
		int num2 = parseInt(sc.next());
		int result = num1 + num2;
		out.println("Sum is: " + result);

		double d = pow(2, 9);
		System.out.println(d);

		double m = sqrt(9);
		System.out.println(m);
	}
}
