package Second;

public class BankAccount {
	static String bankName = "BOA";

	// static variables will be stored in the method area of the the JVM memory
	// space
	String accountHoldersName;
	String accountNumber;
	float balance;

	// instance fields are defined directly under the class and will be store in the
	// heap memory
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double loanInterestRate = 7.5;
		System.out.println(loanInterestRate);
		// local variables will be stored in a stack memory area and have to be
		// initialized
		System.out.println(BankAccount.bankName);
		BankAccount bankAccount = new BankAccount();
		// write new bankaccount() then click ctrl+1 to assign it to local variable
		// bankAccount.accountHoldersName = "John";
		// bankAccount.accountNumber = "123232323";
		// bankAccount.balance = 20000f;
		System.out.println(bankAccount.balance);
	}

}
