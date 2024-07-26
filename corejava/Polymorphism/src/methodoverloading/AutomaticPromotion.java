package methodoverloading;

public class AutomaticPromotion {
	/*
	 * public void print(int i) { System.out.println("Integer version: " + i); }
	 */
	public void print(float f) {
		System.out.println("Float version: " + f);
	}

	public void print(char f) {
		System.out.println("char version: " + f);
	}

	public void print(Long f) {
		System.out.println("Long version: " + f);
	}

	/*public void print(String s) {
		System.out.println("String version: " + s);
	}*/

	public void print(Object o) {
		System.out.println("Object version: " + o);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AutomaticPromotion ap = new AutomaticPromotion();
		ap.print(12.2f);
		ap.print(23);
		ap.print("Hello");
	}

}
