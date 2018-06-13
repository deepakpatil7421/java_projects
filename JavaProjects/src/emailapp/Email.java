package emailapp;

import java.util.Scanner;

public class Email {

	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity = 500;
	private int defaultPasswordLength = 8;
	private String alternateMailId;
	private String companySuffix = "@hcl.com";

	public Email(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;

		this.department = setDepartment();

		this.password = randamPassword(defaultPasswordLength);
		System.out.println("your password is :" + this.password);

		email = firstName.toLowerCase() + lastName.toLowerCase() + companySuffix;

	}

	private String setDepartment() {
		System.out.println("new Employee : "+firstName+
				" Department Code : \n1 for sales \n2 for Development \n3 for accounting \n4 for None \nEnter the department code");
		Scanner sc = new Scanner(System.in);
		int departchoice = sc.nextInt();
		if (departchoice == 1) {
			return "sales";
		} else if (departchoice == 2) {
			return "dev";
		} else if (departchoice == 3) {
			return "account";
		} else {
			return "";
		}

	}

	private String randamPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@#$*";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}

	public void setmailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}

	public void setalternateMailId(String altmail) {
		this.alternateMailId = altmail;
	}

	public void changePassword(String password) {
		this.password = password;
	}

	public int getmailboxCapacity() {
		return mailboxCapacity;
	}

	public String getalternateMailId() {
		return alternateMailId;
	}

	public String getPassword() {
		return password;
	}

	public String showInfo() {
		return "Display info : " + firstName + " " + lastName + "\nCompany Email : " + email + "\nmailbox Capacity : "
				+ mailboxCapacity + "mbs";

	}
}
