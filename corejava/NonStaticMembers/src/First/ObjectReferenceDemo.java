package First;

public class ObjectReferenceDemo {
	int x;

	ObjectReferenceDemo() {

	}

	public static void main(String[] args) {
		ObjectReferenceDemo ord = new ObjectReferenceDemo();
		// ord will have new ObjectReferenceDemo() address, constructors does not have a
		// return type,
		// they implicitly return the address of the particular object in memory
		System.out.println(ord.x);
		System.out.println(ord);
	}
}
