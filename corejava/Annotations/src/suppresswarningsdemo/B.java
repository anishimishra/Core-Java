package suppresswarningsdemo;

import java.util.ArrayList;
import java.util.List;

import deprecateddemo.A;

public class B {

	@SuppressWarnings(value = { "deprecation", "rawtypes" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		System.out.println(a);
		a.myMethod();
		a.myMethod2();

		List list = new ArrayList();
		System.out.println(list);
	}

}
