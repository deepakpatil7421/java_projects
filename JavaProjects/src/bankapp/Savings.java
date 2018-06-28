package bankapp;

public class Savings extends Account {
	int safetyDepositeBox;
	int safetyDepositeBoxKey;

	public Savings(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "1" + accountNumber;

	}

	public void showInfo() {
		super.showInfo();
		System.out.println("Account Type:Savings");
	}
}
