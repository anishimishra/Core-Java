package objectmethods;

public class TestElectricityBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElectricityBill bill1 = new ElectricityBill();
		bill1.setMeterNo(123.5);
		bill1.setName("rohini");
		bill1.setAddress("sangria");

		ElectricityBill bill2 = new ElectricityBill();
		bill2.setMeterNo(456.8);
		bill2.setName("anishi");
		bill2.setAddress("mystic");

		ElectricityBill bill3 = new ElectricityBill();
		bill3.setMeterNo(456.8);
		bill3.setName("poorvi");
		bill3.setAddress("sunway");

		System.out.println(bill1);
		System.out.println(bill2);
		System.out.println(bill3);

		System.out.println(bill1.equals(bill2));
		System.out.println(bill2.equals(bill3));
		System.out.println(bill1.equals(bill3));

		System.out.println(bill1.hashCode());
		System.out.println(bill2.hashCode());
		System.out.println(bill3.hashCode());
	}

}
