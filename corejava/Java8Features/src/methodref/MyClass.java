package methodref;

public class MyClass {
	public void myMethod23(int i) {
		System.out.println(i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInterface f = i -> System.out.println(i);
		f.myMethod(10);
		MyClass c = new MyClass();
		MyInterface f1 = c::myMethod23;
		f1.myMethod(20);
	}

}
