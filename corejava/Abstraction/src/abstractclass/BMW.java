package abstractclass;

// abstract class cannot be final
public abstract class BMW {
	void commonFunc() {
		System.out.println("Inside commonFunc method");
	}

// abstract method name cannot be static
	abstract void accelerate();

	abstract void brake();

	public static void main(String[] args) {
		System.out.println("Inside the main method");
	}
}
