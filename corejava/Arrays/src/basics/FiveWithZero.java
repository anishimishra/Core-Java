package basics;

public class FiveWithZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 3, 5, 4, 5, 6, 5, 3, 5, 7 };
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 3 && a[i + 1] == 5) {
				a[i + 1] = 0;
			}
		}
		for (int element : a) {
			System.out.print(element + " ");
		}
	}

}
