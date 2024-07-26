package basics;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int a[5];
		// int a[]= {10,20,30,40,50};
		int a[] = new int[5];
		a[0] = 10;
		a[1] = new Integer(20); // autoboxing
		// a[2]=30.54;
		a[2] = 30;
		// a[7]=70; // ArrayIndexOutOfBoundException
		System.out.println("Elements of the array");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println();
		
		for (int element : a) {
			System.out.print(element + " ");
		}
		System.out.println();
		
		long[] arr = new long[4];
		for (long element : arr) {
			System.out.print(element + " ");
		}
		System.out.println();
		
		float[] arr1 = new float[4];
		for (float element : arr1) {
			System.out.print(element + " ");
		}
	}

}
