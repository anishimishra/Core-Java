package First;

public class IllegalArgumentDemo {
	public static int sum(int a, int b) {
		if (a == 0 || b == 0) {
			throw new IllegalArgumentException("a and b should not be zero");
		}
		return a + b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread = new Thread();
		thread.setPriority(10);
		System.out.println(IllegalArgumentDemo.sum(10, 0));
	}

}
