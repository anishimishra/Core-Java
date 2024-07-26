package First;

public class DoWhileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1;
		do {
			System.out.println("Inside the loop");
		} while (x < 1);

		do {
			System.out.println("Hello");
			break;
		} while (true);
		// System.out.println("Hello"); - shows unreachable code

		int i = 1;
		do {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		} while (i <= 30);
	}
}
