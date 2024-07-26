package codingchairs;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 0;
		int available = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");
		// String str = sc.next();
		String str = "CCCC";
		for (int i = 0; i <= str.length() - 1; i++) {
			char ch = str.charAt(i);
			if (ch == 'C') {
				if (available > 0) {
					available--;
				} else if (available == 0) {
					total++;
				}

			} else if (ch == 'R') {
				if (total > 0) {
					available++;
				}
			} else if (ch == 'U') {
				if (total > 0 && available > 0) {
					available--;
				} else if (available == 0) {
					total++;
				}
			} else {
				if (total > 0) {
					available++;
				}
			}
		}
		System.out.println(total);
		System.out.println(available);
	}
}