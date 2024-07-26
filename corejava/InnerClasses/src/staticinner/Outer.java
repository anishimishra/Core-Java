package staticinner;

public class Outer {
	static void f1() {
		System.out.println("outer static method");
	}

	static class Inner {
		static void f2() {
			System.out.println("inner static method");
		}

		void f3() {
			System.out.println("non static method inside the inner class");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer.f1();
		Outer.Inner.f2();
		Outer.Inner inner = new Outer.Inner();
		inner.f3();
	}

}
