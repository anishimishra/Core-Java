package First;

public class ArrayIndexOOBDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 10, 20, 30 };
		System.out.println("Array elements : ");
		for (int i = 0; i <= a.length; i++) {
			System.out.println(a[i]);
		}
		// java.lang.ArrayIndexOutOfBoundsException comes
		System.out.println("After array output");
	}

	void method1() {
		System.out.println("method1");
	}

}
