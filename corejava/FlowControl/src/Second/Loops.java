package Second;

public class Loops {

	public static void main(String[] args) {
		int n = 150;
		for (int i = 1; i < n; i++) {
			if (i % 10 == 0) {
				continue;
			}
			System.out.print(i + " ");
			if (i == 99) {
				break;
			}
		}
		System.out.println();
		int i = 0;
		while (i < n) {
			i++;
			if (i % 10 == 0) {
				continue;
			}
			System.out.print(i + " ");
			if (i == 99) {
				break;
			}
		}
		System.out.println();
		i = 0;
		do {
			i++;
			if (i % 10 == 0) {
				continue;
			}
			System.out.print(i + " ");
			if (i == 99) {
				break;
			}
		} while (i < n);
	}

}
