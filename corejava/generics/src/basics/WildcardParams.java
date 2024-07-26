package basics;

import java.util.ArrayList;

public class WildcardParams {
	public static void main(String[] args) {
		WildcardParams wcp = new WildcardParams();
		wcp.myMethod(new ArrayList<Thread>());
		wcp.myMethod(new ArrayList<MyClass>());
	}

	public void myMethod(ArrayList<? extends Thread> l) {
		l.add(null); // if ? is there we can add only null
		// l.add("bh");
		// l.add(new MyClass());
	}
}
