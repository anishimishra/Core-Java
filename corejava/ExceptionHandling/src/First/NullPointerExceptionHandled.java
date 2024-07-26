package First;

public class NullPointerExceptionHandled {
	static ArrayIndexOOBDemoHandled a;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			NullPointerExceptionHandled.a.method1();
		} catch (NullPointerException e) {
			System.out.println("method is null");
		}
	}

}
