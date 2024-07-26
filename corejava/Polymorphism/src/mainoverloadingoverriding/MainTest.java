package mainoverloadingoverriding;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("default main method");
		main(10);
	}

	public static void main(int args) {
		System.out.println("overloaded main method");
	}

}
