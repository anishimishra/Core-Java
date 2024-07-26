package First;

public class ArrayIndexOOBDemoHandled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 10, 20, 30 };
		try {
			System.out.println("Array elements : ");
			for (int i = 0; i <= a.length; i++) {
				System.out.println(a[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Index beyond array length");
		}
		System.out.println("After array output");
	}

	void method1() {
		System.out.println("method1");
	}
}
