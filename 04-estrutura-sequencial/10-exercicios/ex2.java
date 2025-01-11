package java_course_default;

import java.util.Locale;
import java.util.Scanner;

public class ex2 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b, c;
		a = 3.14159;
		b = sc.nextDouble();
		
		c = a * Math.pow(b, 2);
		
		System.out.printf("SOMA = %.4f%n", c);

		sc.close();
	}
}
