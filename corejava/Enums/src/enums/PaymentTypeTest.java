package enums;

public class PaymentTypeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PaymentType pt = PaymentType.CREDITCARD;
//System.out.println(pt);
		PaymentType[] values = PaymentType.values();
		for (PaymentType paymentType : values) {
			System.out.println("Payment Type: " + paymentType + ", Oridnal: " + paymentType.ordinal() + ", Fee: "
					+ paymentType.getFee());
		}
	}

}
