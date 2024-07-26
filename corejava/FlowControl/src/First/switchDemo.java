package First;

public class switchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 3;
		switch (x) {
		//byte ,short, char, int, enum, String as switch arguments
		case 1: //cant use variables has to be constants
			System.out.println("case 1");
			break;
		case 2:
			System.out.println("case 2");
			break;
		case 1 + 1 + 1:
			System.out.println("case 3");
			break;
		default:
			System.out.println("default");
		}
	}

}
