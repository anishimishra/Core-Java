package functionalinterfaces;

import java.util.function.IntBinaryOperator;

public class PrimitiveFunctionalInterfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntBinaryOperator intBinaryOperator = (x, y) -> x + y;
		int i = intBinaryOperator.applyAsInt(12, 34);
		System.out.println(i);
	}

}
