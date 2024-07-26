package methodoverriding.dynamicbinding.runtimebinding;

public class Parent {
	String s = "parent";

	public static void doSomething() {
		System.out.println("Inside parent method");
	}

	public void checkOverride() {
		System.out.println("inside parent checkOverride method");
	}
}
