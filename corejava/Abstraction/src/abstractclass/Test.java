package abstractclass;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// BMW bmw = new BMW(); - error comes as cannot instatiate
		ThreeSeries three = new ThreeSeries();
		three.accelerate();
		three.commonFunc();

		FiveSeries five = new FiveSeries();
		five.accelerate();
		five.commonFunc();
	}

}
