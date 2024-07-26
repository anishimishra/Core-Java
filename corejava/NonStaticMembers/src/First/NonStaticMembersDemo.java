package First;

public class NonStaticMembersDemo {
	int num;

	NonStaticMembersDemo() {
		System.out.println("Inside the constructor");
	}
	// constructor is a non static keyword

	/*
	 * NonStaticMembersDemo() { //Default constructor }
	 */

	{
		System.out.println("Inside the non static block");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inside the main method");
		NonStaticMembersDemo obj = new NonStaticMembersDemo();
		// new NonStaticMembersDemo();
		// new NonStaticMembersDemo();
		obj.doSomething();
	}

	static {
		System.out.println("Inside the static block");
	}

	void doSomething() {
		System.out.println("Inside Do something");
	}
}
