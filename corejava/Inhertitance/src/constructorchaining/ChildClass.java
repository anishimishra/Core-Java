package constructorchaining;

public class ChildClass extends SuperClass {
	ChildClass() {
		this(10);
		System.out.println("No arg ChildClass constructor");
	}

	ChildClass(int x) {
		super(x);
		System.out.println("One arg ChildClass constructor");
		System.out.println(x);
	}

	public static void main(String[] args) {
		ChildClass c = new ChildClass();
	}
}
