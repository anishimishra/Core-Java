package First;

public class Demo {

	static Demo globalObj;
	static Demo methodDemo = new Demo();
	static Demo returnDemo = new Demo();

	static {
		Demo obj = new Demo();
		// System.out.println(obj);
		// System.out.println(Demo.globalObj);
		Demo.globalObj = new Demo();
		// System.out.println(Demo.globalObj);
		//System.out.println(Demo.methodDemo);
		Demo.init();
		//System.out.println(Demo.methodDemo);
		System.out.println(Demo.returnDemo);
		Demo.returnDemo = Demo.initReturn();
		System.out.println(Demo.returnDemo);
	}

	public static void main(String[] args) {
		// System.out.println(Demo.globalObj);
		//System.out.println(Demo.methodDemo);
		System.out.println(Demo.returnDemo);
	}

	static void init() {
		Demo.methodDemo = new Demo();
	}

	static Demo initReturn() {
		return new Demo();
	}
}
