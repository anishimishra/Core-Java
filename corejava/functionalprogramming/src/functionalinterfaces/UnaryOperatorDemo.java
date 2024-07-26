package functionalinterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UnaryOperator<Integer> unaryOperator = (x) -> 3 * x;
		System.out.println(unaryOperator.apply(10));
	}

}
