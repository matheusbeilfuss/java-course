package java_course_default;

import java.util.Locale;
import java.util.Scanner;

public class ex5 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codPeca1, numPeca1, codPeca2, numPeca2;
		double valorPeca1, valorPeca2, valorFinal;
		codPeca1 = sc.nextInt();
		numPeca1 = sc.nextInt();
		valorPeca1 = sc.nextDouble();
		sc.nextLine();
		
		codPeca2 = sc.nextInt();
		numPeca2 = sc.nextInt();
		valorPeca2 = sc.nextDouble();
		sc.nextLine();
		
		valorFinal = (numPeca1 * valorPeca1) + (numPeca2 * valorPeca2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorFinal);
		
		sc.close();
	}
}
