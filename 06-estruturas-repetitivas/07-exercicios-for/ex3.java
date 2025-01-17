package java_course_default;

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i=0; i<N; i++) {
			
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			
			double media = (a * 0.2) + (b * 0.3) + (c * 0.5);
			
			System.out.printf("%.1f%n", media);
		}
		
		sc.close();

	}
}
