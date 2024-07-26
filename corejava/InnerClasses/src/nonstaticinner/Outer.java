package nonstaticinner;

public class Outer {
	void f1() {
		System.out.println("Outer class non static method");
	}

	class Inner {
		void f2() {
			System.out.println("non static Inner class and non static method");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer outer = new Outer();
		outer.f1();
		Outer.Inner inner = outer.new Inner();
		inner.f2();
	}

}
