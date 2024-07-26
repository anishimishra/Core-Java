package assertions;

public class AssertDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int withdrawalAmount = 100;
		int currentBalance = 60;
		// assert (withdrawalAmount <= currentBalance);

		assert (withdrawalAmount <= currentBalance) : "Withdrawal amount is more than current Balance";

		// by default assertions are disabled to enable them
		// do -ea by going to run configs then args and vm args
		// and there write -ea
	}

}
