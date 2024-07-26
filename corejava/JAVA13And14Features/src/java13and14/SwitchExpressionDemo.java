package java13and14;

public class SwitchExpressionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int key = 23;
		String result = switch (key) {
		case 1: {

			yield "Choice 1";
		}
		case 2: {
			yield "Choice 2";
		}
		default:
			yield "Invalid choice";
		};
		System.out.println(result);

		int choice = 2;
		String response = switch (choice) {
		case 1 -> {
			yield "You have 0 balance";
		}
		case 2 -> {
			yield "you can get a loan";
		}
		case 3 -> {
			yield "are you sure you have money";
		}
		default -> throw new IllegalArgumentException("Unexpected value: " + choice);
		};
		System.out.println(response);
	}

}
