package basics;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyGenericClass<String> s = new MyGenericClass("Bharath");
		s.displayObjectDetails();
		System.out.println(s.getObject());

		MyGenericClass<Integer> i = new MyGenericClass(123);
		i.displayObjectDetails();
		System.out.println(i.getObject());

		MyGenericClass<Double> d = new MyGenericClass(123.45);
		d.displayObjectDetails();
		System.out.println(d.getObject());
	}

}
