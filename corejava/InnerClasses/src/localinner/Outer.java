package localinner;

public class Outer {
	void f1() {
		System.out.println("Inside Outer f1()");
		class LocalInner {
			void f2() {
				System.out.println("Inside LocalInner f2()");
			}
		}
		LocalInner localInner = new LocalInner();
		localInner.f2();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer outer = new Outer();
		outer.f1();
	}

}
