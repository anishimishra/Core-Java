package p1;

public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new A();
		// System.out.println(obj.a)); errors out since its private
		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println(obj.d);
	}
}
