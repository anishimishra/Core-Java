package First;

public class SwitchFinalKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 20;
		final int b = 20;
		final int c = 100;
		switch (a) {
		case 10:
			System.out.println("Case 10");
			break;
		case b:
			System.out.println("Case 20");
			break;
		case 30:
			System.out.println("Case 30");
			break;
		case c + 1:
			System.out.println("Case 101");
			break;
		default:
			System.out.println("No matches");
		}
	}

}
