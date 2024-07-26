package code;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10 - i; j++) { // for spaces
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) { // for printing *
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
