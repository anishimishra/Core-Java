package methodoverriding.dynamicbinding.runtimebinding;

public class MACBookAir extends MACBook {
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("macbook air start");
	}

	@Override
	public void shutdown() {
		// TODO Auto-generated method stub
		System.out.println("macbook air shutdown");
	}
}
