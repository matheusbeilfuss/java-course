package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		student.name = sc.nextLine();
		student.grade1 = sc.nextDouble();
		student.grade2 = sc.nextDouble();
		student.grade3 = sc.nextDouble();
		
		System.out.println();
		System.out.printf("FINAL GRADE = %.2f%n", student.finalGrade());
		
		String situation = student.studentPassed();
		System.out.println(situation);
		
		if (situation == "FAILED") {
			System.out.printf("MISSING %.2f POINTS", student.pointsMissing());
		}
		
		sc.close();
	}

}
