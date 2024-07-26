package First;

public class BMICalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// bmi = weight in kg/(height*height)
		double height = 5.4;
		double weight = 55;
		double heightInMeters = height * 0.4536;
		double bmi = weight / (heightInMeters * heightInMeters);
		System.out.println("BMI : " + bmi);
	}

}
