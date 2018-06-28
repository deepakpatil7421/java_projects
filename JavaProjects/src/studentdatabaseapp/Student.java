package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String courses = "";
	private int tuitionBalance = 0;
	private String StudentID;
	private static int costOfCourse = 600;
	private static int id = 1000;

	public Student() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the student first name");
		this.firstName = sc.nextLine();

		System.out.println("Enter the last name");
		this.lastName = sc.nextLine();

		System.out.println("1- Freshmen \n2 - Sophomore \n3 - Junior \n4 - Senior \nEnter the Student Class Level");
		this.gradeYear = sc.nextInt();
		setStudentID();
		System.out.println(firstName + " " + lastName + " " + gradeYear + " " + StudentID);

	}

	private void setStudentID() {
		id++;
		this.StudentID = gradeYear + "" + id;
	}

	public void enroll() {
		do {

			System.out.print("Enter the course to enroll (Q to Quit)");
			Scanner sc = new Scanner(System.in);
			String course = sc.nextLine();
			if (!course.equals("Q")) {
				courses = courses + "\n" + course;
				tuitionBalance = tuitionBalance + costOfCourse;

			} else {
				break;
			}

		} while (1 != 0);
		System.out.println("ENROLLED IN :" + courses);
		System.out.println("Tuition Balance :" + tuitionBalance);
	}

	public void viewBalance() {

		System.out.println("your tuition balance is :" + tuitionBalance);

	}

	public void payTuition() {
		viewBalance();
		System.out.println("Enter your payment: $");
		Scanner sc = new Scanner(System.in);
		int payment = sc.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for your paymant:" + tuitionBalance);
		viewBalance();
	}

	public String showInfo() {
		return "Name : " + firstName + " " + lastName + "\nCourse Enrolled :" + courses + "\nBalance :"
				+ tuitionBalance;
	}
}
