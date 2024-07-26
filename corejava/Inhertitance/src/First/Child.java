package First;

public class Child extends Parent {

	Child() {
		System.out.println("Childs object" + this);
	}

	void f2() {
		System.out.println("Inside f2");
	}
}
// can exttend one class at a time