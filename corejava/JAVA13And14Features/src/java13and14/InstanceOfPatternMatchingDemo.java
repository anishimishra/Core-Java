package java13and14;

public class InstanceOfPatternMatchingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object object = InstanceOfPatternMatchingDemo.get();
		if (object instanceof String str) {
			//String str = (String) object;
			System.out.println(str);
		}
	}

	public static Object get() {
		return "Pattern matching in action";
	}
}
