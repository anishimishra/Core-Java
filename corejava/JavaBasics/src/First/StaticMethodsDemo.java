package First;

public class StaticMethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inside main - ");
		StaticMethodsDemo.method1();
	}

	static void method1() {
		System.out.println("Inside static method 1");
	}

	static {
		System.out.println("Inside static block - ");
		StaticMethodsDemo.method1();
	}
}
