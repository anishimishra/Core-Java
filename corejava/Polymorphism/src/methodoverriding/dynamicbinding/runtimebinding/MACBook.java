package methodoverriding.dynamicbinding.runtimebinding;

public class MACBook implements AppleLaptop{
	public void start() {
		System.out.println("macbook start");
	}

	public void shutdown() {
		System.out.println("macbook shutdown");
	}
}
