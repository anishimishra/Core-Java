package basics;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3, 4, 5 };
		int sum = 0;
		for (int element : a) {
			sum += element;
		}
		System.out.println(sum);
	}

}
