package methodoverriding.dynamicbinding.runtimebinding;

public class MACBookPro extends MACBook {
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("macbook pro start");
	}

	@Override
	public void shutdown() {
		// TODO Auto-generated method stub
		System.out.println("macbook pro shutdown");
	}

	public void prosmethod() {
		System.out.println("macbook pro prosmethod");
	}
}
