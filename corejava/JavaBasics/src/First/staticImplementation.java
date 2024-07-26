package First;

public class staticImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello from main");
	}

	static {
		System.out.println("Static block 3");
	}
	static {
		System.out.println("Static block 1");
	}

	static {
		System.out.println("Static block 2");
	}
}
