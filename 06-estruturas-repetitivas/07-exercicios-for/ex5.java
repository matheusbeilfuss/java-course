package java_course_default;

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int fatorial = 1;
		
		for (int i=1; i<=N; i++) {
			fatorial *= i;
		}
		
		System.out.println(fatorial);
		
		sc.close();

	}
}
