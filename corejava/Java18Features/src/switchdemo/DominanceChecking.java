package switchdemo;

public class DominanceChecking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object obj = null;
		switch (obj) {
		case CharSequence s -> System.out.println(s);
		//case String i -> System.out.println(i);
		default -> System.out.println(0);
		};
	}

}
