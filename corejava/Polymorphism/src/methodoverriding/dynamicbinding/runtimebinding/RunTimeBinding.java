package methodoverriding.dynamicbinding.runtimebinding;

public class RunTimeBinding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MACBook m1 = new MACBookPro(); // Upcasting
		MACBook m2 = new MACBookAir();
		System.out.println(m1);
		System.out.println(m2);
		m1.start();
		m1.shutdown();

		MACBookPro m5 = (MACBookPro) m1; // downcasting
		System.out.println(m5);
		m5.prosmethod();

		MACBookAir m6 = (MACBookAir) m2; // downcasting
		System.out.println(m6);

		m2.start();
		m2.shutdown();
		// after implementing AppleLaptop interface
		AppleLaptop m3 = new MACBookPro();
		AppleLaptop m4 = new MACBookAir();
		System.out.println(m3);
		System.out.println(m4);
		m3.start();
		m3.shutdown();
		m4.start();
		m4.shutdown();
	}

}
