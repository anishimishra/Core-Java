package java13and14;

public record Employee(String name, int sal) {

	static int id;

	public static void myM() {
		System.out.println(id);
	}

	public void myI() {
		System.out.println(this.name);
		System.out.println(this.sal);
	}

	public Employee() {
		this("", 0);
	}

	public Employee(String empData) {
		this("", 0);
	}
}
