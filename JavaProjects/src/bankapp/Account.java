package bankapp;

public abstract class Account implements IRate {
	String name;
	String sSN;
	String accountNumber;
	static int index = 10000;
	double balance;
	double rate;

	public Account(String name, String sSN, double initDeposit) {
		this.name = name;
		this.sSN = sSN;
		balance = initDeposit;
		index++;
		this.accountNumber = setAccountNumber();

	}

	private String setAccountNumber() {
		String lastTwoSSN = sSN.substring(sSN.length() - 2, sSN.length());
		int uniqueID = index;
		int randomNumber = (int) (Math.random() * Math.pow(10, 3));
		return lastTwoSSN + uniqueID + randomNumber;

	}

	public void showInfo() {
		System.out.println("Name : " + name + "\n" + "Account Number: " + accountNumber + "\n" + "Balance: " + balance

		);
	}
}
