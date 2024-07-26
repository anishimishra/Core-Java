package lambdas;

public class TestSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum s = (x, y) -> System.out.println("Sum is: " + (x + y));
		s.add(10, 20);
		s.add(20, 30);
	}

}
