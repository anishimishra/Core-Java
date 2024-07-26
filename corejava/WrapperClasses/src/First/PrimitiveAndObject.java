package First;

public class PrimitiveAndObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 100;
		Integer y = Integer.valueOf(i);// static method
		int z = y.intValue(); // non-static method
		System.out.println(y);
		System.out.println(z);
	}

}
