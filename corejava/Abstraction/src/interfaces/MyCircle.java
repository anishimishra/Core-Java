package interfaces;

public class MyCircle implements Circle, Circle2 {

	@Override
	public void calcArea() {
		// TODO Auto-generated method stub
		System.out.println(Circle.pi);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCircle mc = new MyCircle();
		mc.calcArea();
		mc.calcArea(1.23f);
	}

	@Override
	public void calcArea(float radius) {
		// TODO Auto-generated method stub
		System.out.println(Circle2.pi);
	}
}
