package constructorchaining;

public class SuperClass {
	int x;

	public SuperClass() {
		System.out.println("No arg SuperClass constructor");
	}

	public SuperClass(int x) {
		this();
		this.x = x;
		System.out.println("One arg SuperClass constructor");
		System.out.println(x);
	}
}
