package scanner;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student id, name, score");
		int id = sc.nextInt();
		String name = sc.next();
		double score = sc.nextDouble();
		System.out.println("Student details");
		System.out.println("id " + id);
		System.out.println("name " + name);
		System.out.println("score " + score);
	}

}
