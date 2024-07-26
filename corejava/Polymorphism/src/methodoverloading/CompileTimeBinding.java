package methodoverloading;

public class CompileTimeBinding {
	void add(int a, int b) {
		int result = a + b;
		System.out.println("Result is: " + result);
	}

	void add(float a, float b) {
		float result = a + b;
		System.out.println("Result is: " + result);
	}

	void add(int a, int b, int c) {
		int result = a + b + c;
		System.out.println("Result is: " + result);
	}

	public static void main(String[] args) {
		CompileTimeBinding ctb = new CompileTimeBinding();
		ctb.add(12f, 24f);
		ctb.add(3, 5);
		ctb.add(20, 20, 20);
	}
}
