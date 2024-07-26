package switchpatterns;

public class SwitchPatternsDemo {
	public static double getPerimeter(Shape shape) {
		if (shape instanceof Circle c) {
			return 2 * Math.PI * c.radius();
		} else if (shape instanceof Rectangle r) {
			return 2 * r.length() * r.width();
		} else {
			throw new IllegalArgumentException();
		}
	}

	public static double getPerimeterUsingSwitch(Shape shape) {
		return switch (shape) {
		case Circle c -> 2 * Math.PI * c.radius();
		case Rectangle r -> 2 * r.length() * r.width();
		default -> throw new IllegalArgumentException("Unexpected value: " + shape);
		};
	}

	public static void testNullSupport(Object obj) {
		switch (obj) {
		case String s -> System.out.println(s);
		case null -> System.out.println("unknown");
		default -> System.out.println("default");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(SwitchPatternsDemo.getPerimeter(new Circle(10)));
		System.out.println(SwitchPatternsDemo.getPerimeterUsingSwitch(new Circle(10)));
		SwitchPatternsDemo.testNullSupport(null);
	}

}
