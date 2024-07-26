package gcollector;

public class GCDemo {

	GCDemo() {
		System.out.println(this + " Created");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GCDemo();
		new GCDemo();
		/*
		 * for (int i = 0; i <= 99999; i++) 
		 * { new GCDemo(); }
		 */
	}

	@Override
	protected void finalize() {
		System.out.println(this + " Finalized");
	}
}