package superdemo;

import java.util.ArrayList;

public class WildcardParams {
	public static void main(String[] args) {
		WildcardParams wcp = new WildcardParams();
		wcp.myMethod(new ArrayList<A>());
	}

	public void myMethod(ArrayList<? super B> l) {
		l.add(null); // if ? is there we can add only null
		l.add(new B());
	}
}
