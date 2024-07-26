package staticinner;

public class AccessingOuterFromInner {
	private static int x = 50;
	private int y;

	AccessingOuterFromInner(int y) {
		this.y = y;
	}

	void f1() {
		System.out.println("Outer class non static method");
	}

	class Inner {
		private int y;

		Inner(int y) {
			this.y = y;
		}

		private void f2() {
			System.out.println("Outer class; static x " + AccessingOuterFromInner.x);
			System.out.println("Outer class; non static y " + AccessingOuterFromInner.this.y);
			System.out.println("Inner class; non static y " + this.y);
			System.out.println("non static Inner class and non static method");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessingOuterFromInner outer = new AccessingOuterFromInner(80);
		outer.f1();
		AccessingOuterFromInner.Inner inner = outer.new Inner(30);
		inner.f2();
	}

}
