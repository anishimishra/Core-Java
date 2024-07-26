package methodoverriding.dynamicbinding.runtimebinding;

public class Child extends Parent {
	String s = "child";

	public static void doSomething() {
		System.out.println("Inside child method");
	}

	public void checkOverride() {
		System.out.println("inside child checkOverride method");
	}
}
