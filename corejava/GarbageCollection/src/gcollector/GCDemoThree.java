package gcollector;

public class GCDemoThree {
	int objId;

	GCDemoThree(int objId) {
		this.objId = objId;
		System.out.println("Created " + this.objId);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GCDemoThree(1);
		new GCDemoThree(2);
		new GCDemoThree(3);
		for (int i = 0; i <= 100; i++) {
			System.gc();
		}
	}

	@Override
	protected void finalize() {
		System.out.println("Finalized " + objId);
	}

}
