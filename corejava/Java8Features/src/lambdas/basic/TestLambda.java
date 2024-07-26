package lambdas.basic;

public class TestLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = () -> System.out.println("Inside MyMethod");
		a.myMethod();
	}

}
