package gcollector;

public class GCDemoTwo {
	int objId;

	GCDemoTwo(int objId) {
		this.objId = objId;
		System.out.println("Created " + this.objId);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i <= 989999; i++) {
			new GCDemoTwo(i);
		}
	}

	@Override
	protected void finalize() {
		System.out.println("Finalized " + objId);
	}
}
