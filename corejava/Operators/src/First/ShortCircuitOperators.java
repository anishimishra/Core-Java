package First;

public class ShortCircuitOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean x = true, y = false;
		boolean a = true, b = true;
		if (x || y) {
			System.out.println("Inside if");
		}
		if (a && b) {
			System.out.println("Inside if");
		}
	}

}
