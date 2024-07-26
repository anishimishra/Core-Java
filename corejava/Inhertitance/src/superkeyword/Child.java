package superkeyword;

public class Child extends Parent {
	int c, d;

	Child(int a, int b, int c, int d) {
		super(a, b); // should be the first line
		this.c = c;
		this.d = d;
	}

	void displayDetails() {
		System.out.println("Parent a: " + super.a);
		System.out.println("Parent b: " + super.b);
		System.out.println("Child c: " + this.c);
		System.out.println("Child d: " + this.d);
	}

	void f1() {
		super.f1();
		System.out.println(this);
		System.out.println("Inside childs f1");
	}
}
//super() - invoke constructor