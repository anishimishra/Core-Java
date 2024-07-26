package methodref.constructors;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInterface f1 = s -> new MyClass(s);
		f1.get("using lambdas");

		MyInterface f2 = MyClass::new;
		f2.get("using constructor mapping");
	}

}
