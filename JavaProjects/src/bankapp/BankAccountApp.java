package bankapp;

public class BankAccountApp {

	public static void main(String[] args) {
		Checking chacc = new Checking("Deepak", "321456789", 1500);

		Savings ss1 = new Savings("Diksha", "321453758", 2500);
		ss1.showInfo();
		System.out.println("*********************");
		chacc.showInfo();

		ss1.deposit(5000);
		ss1.withdraw(2000);
		ss1.transfer("Brokrage", 1000);

	}

}
