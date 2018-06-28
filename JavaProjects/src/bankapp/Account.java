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
		setRate();
	}

	public abstract void setRate();

	private String setAccountNumber() {
		String lastTwoSSN = sSN.substring(sSN.length() - 2, sSN.length());
		int uniqueID = index;
		int randomNumber = (int) (Math.random() * Math.pow(10, 3));
		return lastTwoSSN + uniqueID + randomNumber;

	}

	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Depositing $" + amount);
		printBalance();
	}

	public void withdraw(double amount) {
		balance = balance - amount;
		System.out.println("Withdraw $" + amount);
		printBalance();

	}

	public void transfer(String toWhere, double amount) {
		balance = balance - amount;
		System.out.println("Transfering $ " + amount + " to " + toWhere);
		printBalance();
	}

	public void printBalance() {
		System.out.println("Your Balance is: " + balance);
	}

	public void showInfo() {
		System.out.println("Name : " + name + "\n" + "Account Number: " + accountNumber + "\n" + "Balance: " + balance
				+ "\nRate: " + rate + "%"

		);
	}
}
