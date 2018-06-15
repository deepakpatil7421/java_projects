package studentdatabaseapp;

import java.util.Scanner;

public class StudentDataBaseApplication {

	public static void main(String[] args) {
		System.out.println("Enter number of student to enroll: ");
		Scanner sc = new Scanner(System.in);
		int numOfStudent = sc.nextInt();
		Student[] student = new Student[numOfStudent];
		for (int n = 0; n < numOfStudent; n++) {
			student[n] = new Student();
			student[n].enroll();
			student[n].payTuition();
			System.out.println(student[n].showInfo());
		}
	}

}
