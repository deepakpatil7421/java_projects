package bankapp;

public class Savings extends Account {
	int safetyDepositeBoxId;
	int safetyDepositeBoxKey;

	public Savings(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "1" + accountNumber;
		setSafetyDepositeBox();

	}

	@Override
	public void setRate() {
		rate = getBaseRate() - 0.25;
	}

	private void setSafetyDepositeBox() {
		safetyDepositeBoxId = (int) (Math.random() * Math.pow(10, 3));
		safetyDepositeBoxKey = (int) (Math.random() * Math.pow(10, 4));
	}

	public void showInfo() {
		System.out.println("Account Type:Savings");
		super.showInfo();
		System.out.println("Your Savings account features" + "\n" + "Safety Deposit Box Id: " + safetyDepositeBoxId
				+ "\n" + "Safety Deposit Box Key : " + safetyDepositeBoxKey);

	}
}
