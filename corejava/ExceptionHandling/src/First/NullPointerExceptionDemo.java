package First;

public class NullPointerExceptionDemo {
	static ArrayIndexOOBDemo a;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = null;
		System.out.println(s.length());
		NullPointerExceptionDemo.a.method1();
	}
	// java.lang.NullPointerException comes
}
