package bankapp;

public class BankAccountApp {

	public static void main(String[] args) {
		Checking chacc = new Checking("Deepak", "321456789", 1500);

		Savings ss1 = new Savings("Diksha", "321453758", 2500);
		ss1.showInfo();
		System.out.println("*********************");
		chacc.showInfo();

	}

}
