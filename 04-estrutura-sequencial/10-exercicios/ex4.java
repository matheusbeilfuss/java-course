package java_course_default;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		double c, d;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextDouble();
		
		d = b * c;
		
		System.out.printf("NUMBER = " + a);
		System.out.printf("SALARY = U$ %.2f%n", d);
		
		sc.close();
	}
}
